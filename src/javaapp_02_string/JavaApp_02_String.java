package javaapp_02_string;

import java.util.Scanner;

public class JavaApp_02_String {

    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy szöveget");
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        //String s= "Indul a görög aludni.";

        char menuPont;
        do {
            menuPont =menu();
            
            switch (menuPont) {
                case 'a': System.out.println(s.toUpperCase());break;
                case 'b': System.out.println(s.toLowerCase());break;
                case 'c': System.out.println(s.length());break;
                case 'd': 
                    System.out.println("Adjon meg egy másik stringet");
                    String masik = sc.next();
                    System.out.println(s.equals(masik));
                    break;
                case 'e': 
                    if (s.length()>1) {
                        int a,b;
                        do {
                            System.out.println("Adja meg a kivágandó rész intervallumát\na");
                            a = sc.nextInt();
                            System.out.println("b");
                            b = sc.nextInt();
                            if (a>b) {
                                System.out.println("Az A értéke nem lehet nagyobb B-nél");
                            }
                            if (b>s.length()) {
                                System.out.println("A megadott string csak " + s.length() + " hosszú");
                            }
                            if (a<0) {
                                System.out.println("Az A értéke nem lehet nullánál kevesebb");
                            }
                            if (a==b) {
                                System.out.println("Az A és a B értéke nem lehet egyező");
                            }
                        } while (a>b || a<0 || b>s.length() || a==b);
                        System.out.println(s.substring(a,b));
                    }
                    break;
                case 'f': break;
                default: System.out.println("Helytelen menüpont!"); break;
            }
            
        } while (menuPont != 'f');
        
    }
    
    public static char menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "a - Nagy betűssé alakítani\n" +
                "b - Kisbetűssé alakítani\n" +
                "c - Lekérdezni a hosszát\n" +
                "d - Összehasonlítani egy másik stringgel (string2 bekérése)\n" +
                "e - Egy részét kiiratni a Stringnek (a, b intervallum bekérése)\n" +
                "f - Kilépni\n\n" +
                "Kérem válasszon menüpontot: "
        ); 
        char m = sc.nextLine().charAt(0);
        
        return m;
    }
    
}

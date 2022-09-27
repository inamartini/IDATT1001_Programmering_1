import java.util.Scanner;

public class Oppgave1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv inn brok nummer 1. Skriv teller forst, deretter nevner: "); // bruker skriver inn brøk 1
        int a = sc.nextInt(); // teller brøk 1
        int b = sc.nextInt(); // nevner brøk 2

        System.out.println("Skriv inn brok nummer 2. Skriv teller forst, deretter nevner: "); // bruker skriver inn brøk 2
        int c = sc.nextInt(); // teller brøk 2
        int d = sc.nextInt(); // nevner brøk 2

        Regne regnestykke = new Regne(a, b); // setter inn verdiene i Brøk
        Regne nyBrok = new Regne(c,d);

        System.out.println("Velg: \n1. addisjon\n2. subtraksjon \n3. multiplikasjon \n4. divisjon"); // bruker velger regnemåte
        int regneMetode = sc.nextInt(); // regnemåte
        sc.close(); // lukker scanner

        if (regneMetode == 1) { // hvis bruker velger 1. +

            regnestykke.Addisjon(nyBrok);

            System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + regnestykke.getTeller() + "/" + regnestykke.getNevner());

        }

        if (regneMetode == 2) { // hvis bruker velger 2. -

            regnestykke.Subtraksjon(nyBrok);

            System.out.println(a + "/" + b + " - " + c + "/" + d + " = " + regnestykke.getTeller() + "/" + regnestykke.getNevner());

        }

        if (regneMetode == 3) { // hvis bruker velger 3. *

            regnestykke.Multiplikasjon(nyBrok);

            System.out.println(a + "/" + b + " * " + c + "/" + d + " = " + regnestykke.getTeller() + "/" + regnestykke.getNevner());

        }

        if (regneMetode == 4) { // hvis bruker velger 4. /

            regnestykke.Divisjon(nyBrok);

            System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + regnestykke.getTeller() + "/" + regnestykke.getNevner());

        }

        else { // hvis bruker har tastet inn feil tall

            System.exit(0); // avslutter programmet
        }
    
    }
}

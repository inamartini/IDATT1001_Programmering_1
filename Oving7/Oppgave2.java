import java.util.*;

public class Oppgave2 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // bruker skriver inn tekst
        System.out.println("Skriv inn tekst: ");
        String text = sc.nextLine();

        // while-loop
        while(true) {

            System.out.println("Velg: \n1. Finn antall ord i teksten \n2. Finn gj.snittlig ordlengde \n3. Finn gj.snittlig antall ord per periode \n4. Bytt ut et ord \n5. Hent ut teksten \n6. Hent ut teksten med store bokstaver \n7. Avslutt");
            int valg = sc.nextInt();

            // henter konduktør
            TekstAnalyse analyse = new TekstAnalyse(text, "", "");

            switch(valg){
                // hvis 1. ant. ord i tekst
                case 1: 
                    System.out.println("Antall ord i teksten er: " + analyse.getAntallOrd());

                    break;

                // hvis 2. gjsnittlig ordlengde
                case 2:
                    System.out.println("Gj.snittlig ordlengde er: " + analyse.getGjSnittOrdLengde());

                    break;

                // hvis 3. gjsnittlig antall ord per periode
                case 3: 
                    System.out.println("Gj.snittlig antall ord per periode: " + analyse.getGjSnittAntOrdPrPeriode());

                    break;

                // hvis 4. bytt ut et ord
                case 4:
                    System.out.println("Velg ord som skal byttes ut: "); // ordet som skal byttes ut
                    String byttUt = sc.next();

                    System.out.println("Velg ord som skal erstatte: "); // ordet som kommer inn
                    String nyttOrd = sc.next();

                    TekstAnalyse bytterOrd = new TekstAnalyse(text, byttUt, nyttOrd);

                    System.out.println(bytterOrd.getNyttOrd()); // bytter ut ord

                    break;

                // hvis 5. skriv ut tekst
                case 5:
                    System.out.println(analyse.getText());

                    break;

                // hvsi 6. skriv ut med store bokstaver
                case 6:
                    System.out.println(analyse.getTextUpperCase());

                    break;

            }

            // hvis 7. avslutt programmet
            if (valg == 7) {

                System.out.println("Du har avsluttet programmet");
                break;
            }

        }

        sc.close(); // lukker scanner

    }
}

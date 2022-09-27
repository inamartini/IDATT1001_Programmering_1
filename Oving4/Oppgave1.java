import java.util.*;

public class Oppgave1_3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       
        while(true) { // while for å kunne kjøre programmet flere ganger
            
            System.out.print("Velg valuta: \n1. dollar \n2. euro \n3. svenske kroner \n4. avslutt \n"); // brukeren får valg om veksling
            int valg = sc.nextInt();

            if (valg == 4) { // hvis brukeren velger 4:avslutt
                System.out.println("Du har avsluttet programmet.");
                break; // programmet avsluttes
            }

            if (valg < 1 || valg > 4) { // hvis brukeren har valgt et tall utenom 1,2,3,4
                System.out.println("Du maa velge 1, 2, 3 eller 4. Prov igjen.\n");
                continue; // starter programmet på nytt
            }

            System.out.println("Velg: \n1. Veksle FRA nok \n2. Veksle TIL nok"); // spør brukeren om å veksle til/fra nok
            int valg2 = sc.nextInt();

            if(valg2 < 1 || valg2 > 2) { // hvis brukeren ikke skriver 1 eller 2 starter programmet på nytt
                System.out.println("Du maa skrive 1 eller 2. Prov igjen.\n");
                continue; // programmet starter på nytt
                }

            else{ // hvis brukeren har valgt 1 eller 2

                System.out.println("Hvor mye vil du veksle?"); // brukeren skriver inn sum å veksle
                double kroner = sc.nextDouble();

                if (valg == 1) { // hvis brukeren valgte 1: dollar

                    Valuta dollar = new Valuta(9.93) ; // henter fra Valuta.java, legger inn dollar-kurs
                        
                    if(valg2 == 1) { // hvis brukeren valgte til dollar
                        System.out.println(kroner + " kr tilsvarer " + dollar.omregning_til(kroner) + " dollar\n");
                    } 
                    if(valg2 == 2) { // hvis brukeren valgte fra dollar
                        System.out.println(kroner + " dollar tilsvarer " + dollar.omregning_fra(kroner) + " kroner\n");
                    }
                }

                if (valg == 2) { // hvis brukeren valgte 2: euro

                    Valuta euro = new Valuta(9.98) ; // henter fra Valuta.java, legger inn euro-kurs

                    if(valg2 == 1) { // hvis brukeren valgte til euro
                        System.out.println(kroner + " kr tilsvarer " + euro.omregning_til(kroner) + " euro\n");
                    } 
                    if(valg2 == 2) { // hvis brukeren valgte fra euro
                        System.out.println(kroner + " euro tilsvarer " + euro.omregning_fra(kroner) + " kroner\n");
                    }
                }

                if (valg == 3) { // hvis brukeren valgte 3: sek

                    Valuta sek = new Valuta(1.07) ; // henter fra Valuta.java, legger inn sek-kurs

                    if(valg2 == 1) { // hvis brukeren valgte til sek
                        System.out.println(kroner + " kr tilsvarer " + sek.omregning_fra(kroner) + " svenske kroner\n");
                    } 
                    if(valg2 == 2) { // hvis brukeren valgte fra sek
                        System.out.println(kroner + " svenske kroner tilsvarer " + sek.omregning_til(kroner)  + " kroner\n");
                    }

                }

            }
            
        }

        sc.close(); // lukker scanner
    
    }
    
}

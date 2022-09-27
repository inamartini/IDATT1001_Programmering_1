import java.util.Scanner;

public class Oppgave2 {

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in); // scanner


        System.out.println("Velg nedre grense"); // bruker velger nedre grense
        int nedre = sc.nextInt(); 

        System.out.println("Velg ovre grense"); // bruker velger øvre grense
        int ovre = sc.nextInt(); 

        System.out.println("Velg: \n1. heltall \n2. desimaltall \n3. avslutt"); // velger heltall eller desimaltall
        int valg = sc.nextInt();

        sc.close(); // lukker scanner

        Intervall tall = new Intervall(ovre, nedre); // setter inn brukerverdi

        if(valg == 1) { // hvis bruker velger 1. heltall

            for(int i = 0; i < 5; i++) { // loop, for å sjekke flere tall. Kjører 5 ganger

                System.out.println("Et tall mellom " + nedre + " og " + ovre + " er " + tall.nesteHeltall(nedre, ovre));
            }
        }

        else if(valg == 2) { // hvis bruker velger 2. desimaltall

            for(int i = 0; i < 5; i++) { // loop, for å sjekke flere tall. Kjører 5 ganger

                System.out.println("Et tall mellom " + nedre + " og " + ovre + " er " + tall.nesteDesimaltall(nedre, ovre));
            }
        }

        
        else { // hvis bruker trykker 3. eller feil
            System.out.println("Du har avsluttet programmet.");
            System.exit(0); // avslutter programmet
        }

    }

    
}

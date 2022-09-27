import java.util.*;

public class Oppgave2 {

    public static void main(String[] args){  

        // boolean for å sjekke om tallet er et primtall
        boolean primtall = true;

        // lager sc slik at bruker kan skrive inn tall
        Scanner sc = new Scanner(System.in);

        while (primtall) { // while slik at programmet kan kjøres flere ganger

            System.out.print("Velg et tall for aa se om det er et primtall, velg 0 for aa avslutte: ");
            int brukerTall = sc.nextInt();
            

        if (brukerTall == 0) { // hvis brukeren skriver inn 0, avslutt programmet
            System.out.println("Du har avsluttet programmet");
            //break;
        }

        if ( brukerTall > 1) { // hvis brukertallet er større enn 1, må vi sjekke om det er et primtall

            for (int i = 2; i < brukerTall; i++ ) {
            
                if (brukerTall%i == 0) { //hvis brukertallet kan deles på et annet tall enn seg selv og 1, er det ikke et primtall

                    primtall = false; // ikke et primtall
                   // break;
                }

            }
        }

        else { // hvis brukertallet er mindre enn 1, er det ikke et primtall. Luker ut tall som 0, 1 og negative tall

            primtall = false; // ikke et primtall
        }

        

        // hvis vi får at tallet ikke er et primtall printer vi dette:
        if (primtall == false ) {
            System.out.println(brukerTall + " er ikke et primtall. ");
        }

         // hvis vi får at tallet er et primtall printer vi dette:
        else {
            System.out.println(brukerTall + " er et primtall. ");
        }

    }

        //lukker scanneren
        sc.close();
    }
    
}

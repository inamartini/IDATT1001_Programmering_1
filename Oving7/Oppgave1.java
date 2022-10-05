import java.util.*;

public class Oppgave1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // skriver inn tekst
        System.out.println("Skriv onsket tekst: ");
        String text = sc.nextLine();

        // velger hva som skal gjøres med teksten
        System.out.println("Velg: \n1. forkort teksten \n2. fjern tegn ");
        int valg = sc.nextInt();

        // henter fra konduktøren
        NyString ord = new NyString(text, "");

        // hvis 1. forkorting
        if (valg == 1) {

            System.out.println("Teksten forkortet: " + ord.getFirstWord()); // henter fra MyString
            
        }
            
        // hvis 2. fjerning av tegn
        else if(valg == 2) {
                
            System.out.println("Velg en bokstav aa fjerne: "); // velger bokstav som fjernes
            String bokstav = sc.next();

            NyString forkort = new NyString(text, bokstav);

            System.out.println(forkort.getForkort()); // replace med luft
    
        }

        // hvis brukeren har skrevet feil
        else {

            System.out.println("Du ma skrive 1 eller 2");
            System.exit(0);
        }
            
        sc.close();
    }
    
}

import java.util.*;

public class Oppgave1 {
    

    public static void main(String[] args){  

        // lager sc slik at bruker kan skrive inn starttall
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Velg starttall for gangetabellen: ");
        int gangeStart = sc1.nextInt();

        // lager sc for at bruker kan skrive inn slutttall
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Velg sluttall for gangetabellen: ");
        int gangeSlutt = sc2.nextInt();

        // hvis slutt er større enn start kan ikke koden printe en gangetabell, avuslutter systemet
        if (gangeStart > gangeSlutt) {

            System.out.println("Sluttallet maa vaere stoerre enn starttallet.");
            System.exit(0); // avslutter systemet
        }

        // for-loop for antall gangetabeller som skal skrives ut
        for (int i = gangeStart; i <= gangeSlutt; i++){   

            int antall = 0; 
           
            // for-loop for hvert gangestykke som skal skrives ut - her: til 10
           for (int j = 1; j <= 10; j++) {

            int total = i * j; // regner ut selve gangestykket

            antall += 1; // for hvert tall skal tallet som ganges med, øke med 1

            System.out.print(i + " x " + antall + " = " + total + " , "); // print gangetabellen, på samme linje

           }
            System.out.println(i + "-gangen "); // forklarer hvilken gangetabell som skrives ut, og printer på ny linje    
        }

        // lukker scannere
        sc1.close();
        sc2.close();

    }
}

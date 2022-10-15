import java.util.*;

public class Oppgave1 {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        // fyller inn informasjon --------------------------------------------------------------------------------

        System.out.println("Fornavn: ");
        String fornavn = sc.nextLine();

        System.out.println("Etternavn: ");
        String etternavn = sc.nextLine();

        System.out.println("Fodselsaar: ");
        int fodselsaar = sc.nextInt();

        Person person = new Person(fornavn, etternavn, fodselsaar);

        System.out.println("Arbeidstaker-nummer : ");
        int arbTakerNum = sc.nextInt();

        System.out.println("Ansettelsesaar: ");
        int ansettelsesaar = sc.nextInt();

        System.out.println("Maanedslonn: ");
        double maanedslonn = sc.nextDouble();

        System.out.println("Skatteprosent: ");
        double skatteprosent = sc.nextDouble();

        ArbTaker arbTaker = new ArbTaker(person, arbTakerNum, ansettelsesaar, maanedslonn, skatteprosent);

        // -------------------------------------------------------------------------------------------------------

        System.out.println();

        // skriver ut alt ----------------------------------------------------------------------------------------

        System.out.println("Navn: " + arbTaker.getNavn());
        System.out.println("Alder: " + arbTaker.getAlder() + " aar ");
        System.out.println("Antall aar i bedriften: " + arbTaker.getAntAar());

        if (arbTaker.getMerEnnTiAar() == true) {
            System.out.println("Personen har vaert ansatt i bedriften i mer enn 10 aar");
        }
        else {
            System.out.println("Personen har ikke vaert ansatt i bedriften mer enn 10 aar");
        }

        System.out.println("Bruttolonn per aar: " + arbTaker.getBruttoPerAar() + " kroner ");
        System.out.println("Skattetrekk per aar: " + arbTaker.getSkattPerAar() + " kroner ");
        System.out.println("Skattetrekk per maaned: " + arbTaker.getSkattPerMaaned() + " kroner ");
    
        // -------------------------------------------------------------------------------------------------------

        System.out.println();

        boolean rediger = true;

        // while løkke for endringer av informasjonen
        while(rediger) {

            System.out.println("Velg: \n1. Endre maanedslonn \n2. Endre skatteprosent \n0. Ferdig");
            int valg = sc.nextInt();


            if (valg ==1) {
                System.out.println("Endre maanedslonn fra " + arbTaker.getMaanedslonn() + " kr til: ");
                double nyLonn = sc.nextDouble();

                arbTaker.setNyMaanedslonn(nyLonn); // endrer månedslønn

                System.out.println("Du har valgt ny maanedslonn: " + arbTaker.getMaanedslonn() + " kr");
                System.out.println("Ny brutto aarslonn: " + arbTaker.getBruttoPerAar() + " kr");
            }

            if (valg ==2) {
                System.out.println("Endre skatteprosent fra " + arbTaker.getSkatteprosent() + "% til: ");
                double nyProsent = sc.nextDouble();

                arbTaker.setNySkatteprosent(nyProsent); // endrer skatteprosent

                System.out.println("Du har valgt ny prosent: " + arbTaker.getSkatteprosent() + "%");
                System.out.println("Ny skatt per maaned: " + arbTaker.getSkattPerMaaned() + " kr og ny skatt per aar: " + arbTaker.getSkattPerAar() + " kr ");
            }

            if (valg == 0){
                rediger = false; // hopper ut av while løkken
            }

            System.out.println();
        }

        // printer ut alt -----------------------------------------------------------------------------------------------------

        System.out.println("Navn: " + arbTaker.getNavn());
        System.out.println("Alder: " + arbTaker.getAlder() + " aar ");
        System.out.println("Antall aar i bedriften: " + arbTaker.getAntAar());

        if (arbTaker.getMerEnnTiAar() == true) {
            System.out.println("Personen har vaert ansatt i bedriften i mer enn 10 aar");
        }
        else {
            System.out.println("Personen har ikke vaert ansatt i bedriften mer enn 10 aar");
        }

        System.out.println("Bruttolonn per aar: " + arbTaker.getBruttoPerAar() + " kroner ");
        System.out.println("Skattetrekk per aar: " + arbTaker.getSkattPerAar() + " kroner ");
        System.out.println("Skattetrekk per maaned: " + arbTaker.getSkattPerMaaned() + " kroner ");

        sc.close();
    }
}

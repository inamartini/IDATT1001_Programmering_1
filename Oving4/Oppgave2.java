public class Oppgave2 {

    public static void main(String[] args) {

        Terning spiller = new Terning(); // lager terning for spiller 1
        Terning spiller2 = new Terning(); // lager terning for spiller 2
        int runde = 1; // lager rundeteller

        while(spiller.erFerdig() == false && spiller2.erFerdig() == false) { // kjører løkke så lenge ingen av spillerne er ferdig = har 100p

            spiller.kastTerning(); // spiller 1 kaster terning
            spiller2.kastTerning(); // spiller 2 kaster terning

            System.out.println("Spiller 1 total: " + spiller.getSumPoeng() + " poeng"); // skriver ut sum for spiller 1 hver runde
            System.out.println("Spiller 2 total: " + spiller2.getSumPoeng() + " poeng"); // skriver ut sum for spiller 2 hver runde

            runde += 1; // teller antall sunder

            System.out.println("Runde: " + runde + ""); // skriver ut rundetall


        }

        if(spiller.getSumPoeng() == 100) { // hvis spiller 1 har 100p

            System.out.println("Spiller 1 vant.");
        }

        else if(spiller2.getSumPoeng() == 100) { // hvis spiller 2 har 100p
            
            System.out.println("Spiller 2 vant.");
        }

    }
}

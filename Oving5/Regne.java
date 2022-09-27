

public class Regne {

    private int teller1 ;
    private int nevner1 ;


    public Regne(int teller1, int nevner1) {

        //  hvis brukeren setter nevner lik 0
        if (nevner1 == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke vaere 0");
        }

        // hvis ikke kjører programmet
        else {
            this.teller1 = teller1;
            this.nevner1 = nevner1;
        }   
        
    }

    public Regne(int teller1) {
        this.teller1 = teller1;
        this.nevner1 = 1;
    }

    // addisjon
    public void Addisjon(Regne brok) {
        teller1 = (teller1 * brok.getNevner()) + (brok.getTeller() * nevner1);
        nevner1 = nevner1 * brok.getNevner();
    }

    // subtraksjon
    public void Subtraksjon(Regne brok2) {
        teller1 = (teller1 * brok2.getNevner() - (brok2.getTeller() * nevner1));
        nevner1 = nevner1 * brok2.getNevner();
    }

    // multiplikasjon
    public void Multiplikasjon(Regne brok3) {
        teller1 = teller1 * brok3.getTeller();
        nevner1 = nevner1 * brok3.getNevner();
    }

    // divisjon
    public void Divisjon(Regne brok4) {
        teller1 = teller1 * brok4.getNevner();
        nevner1 = brok4.getTeller() * nevner1;
    }

    public int getTeller() {
        return teller1;
    }

    public int getNevner() {
        return nevner1;
    }


}

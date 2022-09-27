import java.util.Random;

public class Intervall {

    private static Random random = new Random();

    private int max ;
    private double ovre ;
    private double nedre ;
    private int svar ;

    private double random2 ;
    private double diff ;
    private double svar2 ;

    public Intervall(int nedre, int ovre) {
        this.nedre = nedre;
        this.ovre = ovre;

    }

    public int nesteHeltall(int nedre, int ovre) { // intervallet (nedre, ovre) 
        int max = ovre - nedre;
        svar = random.nextInt(max);
        svar = svar + nedre;
        
        return svar;
    }

    public double nesteDesimaltall(double nedre, double ovre) { // intervallet >nedre, ovre>
        diff = ovre - nedre;
        random2 = random.nextDouble();
        svar2 = nedre + (diff * random2);

        return svar2;
    }

}

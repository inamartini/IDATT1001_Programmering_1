import java.util.Random;

public class Terning {

    private int sumPoeng = 0; // total poengsum
    private Random terning= new Random(); // terning

    public void kastTerning() { // brukeren kaster terning
        
        int terningkast = terning.nextInt(6);
        terningkast += 1;

        if (terningkast == 1) { // hvis terningkast = 1, starter poengtelling på nytt
            sumPoeng = 0;
        }

        else if (sumPoeng > 100) { // hvis poeng er over 100, blir terningkast trukket fra
            sumPoeng -= terningkast;

        }

        else {// hvis ikke legges hvert terningkast til poengsummen
            sumPoeng += terningkast; 
        }
        
    }

    public boolean erFerdig() { // boolean for ferdig

        return sumPoeng == 100;
     
    }

    public double getSumPoeng() {  // total poengsumm
        return sumPoeng;
    }
    
}

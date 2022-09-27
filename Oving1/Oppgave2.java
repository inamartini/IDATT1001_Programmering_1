public class Oppgave2 {


    public static void main(String[] args) {

        double Timer = 2.0;
        double Minutter = 30.0;
        double Sekunder = 50.0;

        double totSek = (Timer * 60 * 60 ) + (Minutter * 60) + Sekunder;

        System.out.println(" " + Timer + " timer og " + Minutter + " minutter og " + Sekunder + " sekunder er totalt " + totSek + " sekunder.");
    }
    
}

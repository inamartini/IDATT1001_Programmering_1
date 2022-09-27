public class Oving2 {


    public static void main(String[] args) { 

        int Sekunder = 9050;

        int TimerInt = Sekunder / 3600;
        int TimerRest = Sekunder%3600;

        int MinutterInt = TimerRest/60  ;
        int MinutterRest = TimerRest%60;

        int SekunderRest = MinutterRest;


        System.out.println("Antall sekunder er " + Sekunder + " og det er " + TimerInt + " timer og " + MinutterInt + " minutter og " + SekunderRest + " sekunder" );


    }
    
}

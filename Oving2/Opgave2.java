public class Oppgave2 {
    

    public static void main(String[] args) { 

        double kjottdeigA = 35.9;
        double vektA = 450.0;

        double kiloprisA = (kjottdeigA / vektA) * 1000;

        double kjottdeigB = 39.9;
        double vektB = 500.0;

        double kiloprisB = (kjottdeigB / vektB) * 1000;

       // kiloprisA = Math.round(kiloprisA * 100.0) / 100.0;
        //kiloprisB = kiloprisB * 100.0 / 100.0;

        double billigst =  Math.min(kiloprisA, kiloprisB);
    


       System.out.println("Kjottdeig A har en kilopris lik " + kiloprisA + " kr/kg, kjottdeig B har en kilopris lik " + kiloprisB + " kr/kg. Og den billigste er " + billigst + " kr/kg.");

    }

}

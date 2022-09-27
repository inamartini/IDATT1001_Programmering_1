
public class Valuta {

    // private double veksle ;
    private double kurs ;

    public Valuta(double kurs) {
        this.kurs = kurs;
        // this.veksle = veksle;
        
    }

    public double omregning_fra(double veksle) { // regner fra nok til valuta
        kurs = veksle * kurs;
        return kurs;
    }

    public double omregning_til(double veksle) { // regner til nok fra valuta
        kurs = veksle / kurs;
        return kurs;
    }

}

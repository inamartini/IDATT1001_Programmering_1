public class TekstAnalyse {

    private String text ;
    private String byttUt ;
    private String nyttOrd;


    public TekstAnalyse(String text, String byttUt, String nyttOrd) {

        this.text = text;
        this.byttUt = byttUt;
        this.nyttOrd = nyttOrd;

    }
    
    // 1 - Finn antall ord i teksten
    /**
     * 
     * @return retunerer antall ord i teksten
     */
    public int getAntallOrd() { 

        String[] ord = text.split("\\s+");

        return ord.length; 

    }

    // 2 - Finn gj.snittlig ordlengde
   /**
    * 
    * @return retunerer gjenommsnittlig ordlengde
    */
    public double getGjSnittOrdLengde() {

        double antallOrd = getAntallOrd();
        double antallBokstaver = text.replace(" ", "").length();

        return antallBokstaver / antallOrd;
    }

    // 3 - Finn gj.snittlig antall ord per periode
    /**
     * 
     * @return retunerer gjennomsnittlig anatll ord per periode
     */
    public double getGjSnittAntOrdPrPeriode() {

        double antallOrd = getAntallOrd();
        String[] periode = text.split("[.!;?]+");
        double antallPerioder = periode.length;

        return antallOrd / antallPerioder;

    }

    // 4 - Bytter ut ord
    /**
     * 
     * @return retunerer et ordbytte
     */
    public String getNyttOrd() {

        text = text.replace(byttUt, nyttOrd);

        return text;
    }


    // 5 - Hent ut teksten
    /**
     * 
     * @return retunerer teksten
     */
    public String getText() {

        return text;
    }

    // 6 - Hent ut tekst med store bokstaver
    /**
     * 
     * @return retunerer teksten med store bokstaver
     */
    public String getTextUpperCase() {
        text = text.toUpperCase();

        return text;
    }
}

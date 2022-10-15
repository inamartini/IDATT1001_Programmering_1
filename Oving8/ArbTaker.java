import java.util.GregorianCalendar;

public class ArbTaker {

    private Person personalia ;
    private int arbTakerNum ;
    private int ansettelsesaar ;
    private double maanedslonn ;
    private double skatteprosent ;

    GregorianCalendar kalender = new java.util.GregorianCalendar();

    public ArbTaker(Person personalia, int arbTakerNum, int ansettelsesaar, double maanedslonn, double skatteprosent) {

        this.personalia = personalia;
        this.arbTakerNum = arbTakerNum;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;

    }

    /**
     * 
     * @return retunerer String av fornavn, String av etternavn og Int av fødselsår fra Person klassen
     */
    public Person getPersonalia() {

        return personalia;
    }

    /**
     * 
     * @return returnerer Int av arbeidstakernummer
     */
    public int getArbTakerNum() {
        
        return arbTakerNum;
    }

    /**
     * 
     * @return retunerer Int av ansettelsesår
     */
    public int getAnsettelsesaar() {
        
        return ansettelsesaar;
    }
    
    /**
     * 
     * @return retunerer double av månedslønn
     */
    public double getMaanedslonn() {
        
        return maanedslonn;
    }

    /**
     * 
     * @return retunerer double av skatteprosent
     */
    public double getSkatteprosent() {
        
        return skatteprosent;
    }

    /**
     * 
     * @param nyLonn endrer Double av månedslønn
     */
    public void setNyMaanedslonn(double nyLonn){

        this.maanedslonn = nyLonn;

    }

    /**
     * 
     * @param nySkatt endrer Double av skatteprosent
     */
    public void setNySkatteprosent(double nySkatt) {

        this.skatteprosent = nySkatt;

    }

   /**
    * 
    * @return retunerer double av skatt per måned
    */
    public double getSkattPerMaaned() {

        double skatt = this.maanedslonn * (this.skatteprosent / 100);

        return skatt;
    }

    /**
     * 
     * @return retunerer double av skatt per år
     */
    public double getSkattPerAar() {

        double skattTiMaaneder = getSkattPerMaaned() * 10 ;
        double skattDesember = getSkattPerMaaned() / 2 ;
        double skatt = skattTiMaaneder + skattDesember;

        return skatt;
    }

    /**
     * 
     * @return retunerer double av bruttolonn per år
     */
    public double getBruttoPerAar() {

        double lonn = 12 * this.maanedslonn;

        return lonn;
    }

    /**
     * 
     * @return retunerer String av navn, String av etternavn
     */
    public String getNavn() {
        
        String navn = getPersonalia().getEtternavn() + ", " + getPersonalia().getFornavn();

        return navn;
    }

    /**
     * 
     * @return retunerer Int av alder
     */
    public int getAlder() {

        int aar = kalender.get(java.util.Calendar.YEAR);
        int alder = aar - getPersonalia().getFodselsaar();

        return alder;
    } 

    /**
     * 
     * @return retunerer Int av antall år ansatt
     */
    public int getAntAar() {

        int aar = kalender.get(java.util.Calendar.YEAR);
        int antAar = aar - getAnsettelsesaar();

        return antAar;
    }

    /**
     * 
     * @return retunerer Boolean om ansatt mer enn 10 år
     */
    public boolean getMerEnnTiAar() {

        boolean merEnnTi = false;

        if (getAntAar() >= 10) {
            merEnnTi = true;
        }

        return merEnnTi;
    }

}

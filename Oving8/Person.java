public class Person {

    private final String fornavn ;
    private final String etternavn ;
    private final int fodselsaar ;

    public Person (String fornavn, String etternavn, int fodselsaar){

        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;

    }

    /**
     * 
     * @return returnerer String av fornavn
     */
    public String getFornavn() {

        return fornavn;
    }

    /**
     * 
     * @return retunerer String av etternavn
     */
    public String getEtternavn() {

        return etternavn;
    }

    /**
     * 
     * @return retunerer Int av fødselsår
     */
    public int getFodselsaar() {

        return fodselsaar;
    }

    
}

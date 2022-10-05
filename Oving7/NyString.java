
public class NyString {

    private String text ;
    private String bokstav ;

    public NyString(String text, String bokstav) {

        this.text = text;
        this.bokstav = bokstav;
    }

    /**
     * 
     * @return returnerer forkortet versjon
     */
    public String getFirstWord() {

        String forsteBokstav = "";
        for (String s : text.split(" ")) {

            forsteBokstav += s.charAt(0);
        }

        return forsteBokstav;

        }

    public String getForkort() {

        text = text.replace(bokstav, "");

        return text;

    }
    
    
}

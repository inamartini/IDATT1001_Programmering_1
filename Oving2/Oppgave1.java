public class Oppgave1 {

    public static void main(String[] args)
    {  

       String velg = JOptionPane.showInputDialog("Velg aarstall: ");

       int aar = Integer.parseInt(velg);

       String text = "";
       String svar = " er et skuddaar. ";
       String feilSvar = " er ikke et skuddaar. ";

       if(aar%100==0) {

            if(aar%400==0) {
                text = svar;
            }

            else {
                text = feilSvar;
            }
        }

        else if (aar%100!=0){

                if(aar%4==0) {
                    text = svar;
                }

                else {
                text = feilSvar;
            }

        }
    

       JOptionPane.showMessageDialog(null, "Aret " + aar  + text);
   }
    
}

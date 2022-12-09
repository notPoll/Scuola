package String;
import java.io.*;
class Stringhe {
    private String scelta;
    private char n;
    public Stringhe(char ntemp , String sceltatemp) {
        this.scelta = sceltatemp;
        this.n = ntemp;
    }
        public static boolean CercaCarattere(String scelta , char n) {
            boolean trovato = false;
            int i;
            while(!trovato && i<scelta.length()) {
                if(n==scelta.charAt(i)) {
                    trovato = true;
                }
                i++;
            }
            return trovato;
        }
        public static boolean ContieneStringa(String s1 , String s2) {
            boolean contiene = false;
            int i;
            
            return contiene;
        }

}

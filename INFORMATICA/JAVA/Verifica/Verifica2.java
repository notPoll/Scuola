package Verifica;
import java.io.*;
class Verifica2 {
    
}
class mainVerifica2 {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String numeroletto;
        String lettera="";
        System.out.println("Inserire il carattere da ricercare nella stringa.. \n:");
        try {
            lettera = tastiera.readLine();
        } 
        catch (Exception e) {
            System.out.println("Errore1");
        }
        System.out.println("Inserisci la stringa nella quale ricercare la lettera:" + lettera);
        
    }
}
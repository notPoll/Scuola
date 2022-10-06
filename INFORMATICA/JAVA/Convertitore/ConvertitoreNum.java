package Convertitore;
import java.io.*;
class ConvertitoreNum {
     public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String NumeroLetto;
        int SecondiInp;
        int ore = 0;
        int minuti = 0;
        int secondi = 0;
            System.out.println("Inserisci i secondi da convertire in ora minuti e secondi");
            try {
                NumeroLetto = tastiera.readLine();
                SecondiInp = Integer.valueOf(NumeroLetto).intValue();
            }
            catch(Exception exception) {
                System.out.println("Ce stato un errore");
                return;
            }
            ore = SecondiInp/3600;
            minuti = SecondiInp%3600/60;
            secondi = SecondiInp%60;
            System.out.println("La conversione è: " + ore + ":" + minuti + ":" + secondi );
    }
}

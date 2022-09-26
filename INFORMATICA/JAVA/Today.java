// costruire un programma che dopo aver acquisito l'ora del giorno espressa come numero di secondi 
// convertire il varo in ore minuti e secondi
// 3600 secondi = 1 ora
// 60 secondi = 1 minuto
// 1 secondo = 1 secondo
import java.io.*;
class Today {
     public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String NumeroLetto;
        int SecondiInp;
        int ore =3600;
        int kara;
        int para;
        int dara;
            System.out.println("Inserisci i secondi da convertire in ora minuti e secondi");
            try {
                NumeroLetto = tastiera.readLine();
                SecondiInp = Integer.valueOf(NumeroLetto).intValue();
            }
            catch(Exception exception) {
                System.out.println("Ce stato un errore");
                return;
            }
            kara = SecondiInp/60;
            dara = SecondiInp/ore;
            para = SecondiInp;
            System.out.println("test: " + dara + ":" + kara + ":" + para );
    }
}

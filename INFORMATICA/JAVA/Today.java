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
        int minuti =60;
        int Finale =0;
        int Finale1 =0;
        int Finale3 =0;
        System.out.println("Inserisci un numero di secondi");
        try {
            NumeroLetto = tastiera.readLine();
            SecondiInp = Integer.valueOf(NumeroLetto).intValue();
        }
        catch(Exception exception) {
            System.out.println("Ce stato un errore");
            return;
        }
        Finale = SecondiInp/ore;
        Finale1 = SecondiInp/minuti;
        Finale3 = SecondiInp;
        System.out.println("Il tempo in ore è:" + Finale);
        System.out.println("Il tempo in minuti è:" + Finale1);
        System.out.println("Il tempo in secondi è:" + Finale3);
    }
}

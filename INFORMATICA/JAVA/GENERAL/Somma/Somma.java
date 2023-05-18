package Somma;
import java.io.InputStreamReader;
import java.io.*;
class SOMMA {
        public static void main(String args[]) {
                 InputStreamReader input = new InputStreamReader(System.in);
                 BufferedReader tastiera = new BufferedReader(input);
                        int Numero1 = 0;
                        int Somma = 0;
                        int Numero2 = 0;
                        String Numero;
                        try { 
                        Numero = tastiera.readLine();
                        Numero1 = Integer.valueOf(Numero).intValue();
                        }
                        catch(Exception exception) {
                                System.out.println("Ce stato un errore");
                        }
                try {
                Numero = tastiera.readLine();
                Numero2 = Integer.valueOf(Numero).intValue();
                }
                catch(Exception exception) {
                System.out.println("ce stato un errore");
                }
                Somma = Numero1 + Numero2;
                System.out.println("La Somma è :" + Somma);
        }
}
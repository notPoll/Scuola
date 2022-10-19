package Potenza;
import java.io.*;
class Potenza {
    private int Aele;
    private int Bele;
    //per prendere successivamente in input a (numero da elevare a b(potenza))
    public void setA(int a) {
        Aele = a;
    }
        public int getA() {
            return Aele;
        }
            //per prendere successivamento in input b (elevazione)
            public void setB(int b) {
                Bele = b;
            }
                public int getB() {
                    return Bele;
                }
                    public void Visual() {
                        System.out.println("N Da elevare: " + Aele);
                        System.out.println("B elevatore " + Bele);
                    }
}
class MainPotenza {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        int A=0,B=0;
        //Potenza N,E;
        String Tra;
        System.out.println("Inserici il numero che vuoi elevare alla potenza: ");
        try {
            Tra = tastiera.readLine();
            A = Integer.valueOf(Tra).intValue();
        } 
        catch (Exception e) {
            System.out.println("Ce stato un errore");
        }
        System.out.println("Inserisci la potenza che elevera il numero");
            try {
                Tra = tastiera.readLine();
                B = Integer.valueOf(Tra).intValue();
            } 
            catch (Exception e) {
                System.out.println("ce stato un errore");             
            }  
    }
}

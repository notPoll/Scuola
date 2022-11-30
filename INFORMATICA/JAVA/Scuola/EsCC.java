package Scuola;
import java.io.*;
class ContoCorrente {

        private int saldo;
        private String iban;
        public ContoCorrente(int saldo,String Cognome) {
            this.saldo=saldo;
        }
            public void setNome(String Nome) {
                this.iban=iban;
            }
                public String getNome() {
                    return iban;
                }
                    public void setSaldo(int saldo) {
                        this.saldo=saldo;
                    }
                        public int getSaldo() {
                            return saldo;
                        }
                            public void visualizza() {
                                    System.out.println("Il saldo è + saldo ");
                            }
                        public boolean equals(ContoCorrente c1) {
                            if(saldo == c1.saldo ) {
                                return true;
                            }
                            else {
                            return false;
                            }
                        }
}
class MainCC {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in); 
        BufferedReader tastiera = new BufferedReader(input);
        int saldo, scelta=0 ;
        String iban;
        String NumeroLetto;
        ContoCorrente c1;
        final int dim=1000;
        int N;
        try {
            NumeroLetto = tastiera.readLine();
            N = Integer.valueOf(NumeroLetto).intValue();
        } 
        catch (Exception e) {
           System.out.println("Errore1");
        }
        ContoCorrente b1[];
        System.out.println("Inserisci il cognome dell utente da aggiungiere");
        try {
            iban = tastiera.readLine();
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }

    }
}
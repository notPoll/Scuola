package Scuola;
import java.io.*;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
class ContoCorrente {

        private int saldo;
        private String Cognome;
        public ContoCorrente(int saldo,String Cognome) {
            this.saldo=saldo;
        }
            public void setNome(String Nome) {
                this.Cognome=Cognome;
            }
                public String getNome() {
                    return Cognome;
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
        String cognome;
        ContoCorrente c1;
        final int dim=1000;
        
        System.out.println("Inserisci il cognome dell utente da aggiungiere");
        try {
            cognome = tastiera.readLine();
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }

    }
}
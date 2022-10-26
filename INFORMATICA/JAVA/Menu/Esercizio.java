package Menu;
import java.io.*;
class ContoCorrente {
    private double saldo;
    public ContoCorrente (Double temp) {
        saldo = temp;
    }
        public void setSaldo(double sa) {
            saldo = sa;
        }
            public double getSaldo() {
                return saldo;
            }
                public void setVer(double s) {
                    saldo = s;
                }
                    public double getVer() {
                        return saldo;
                    }
                        public void Prelieva(double a) {
                            saldo -= a;
                        }
                            public void Visual() {
                                System.out.println("Il tuo saldo è"  + saldo);
                            }
}
class MainClass {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        double importo = 0;
        ContoCorrente C1;
        String Numeroletto;
        int scelta=0;
        System.out.println("Inserisci il saldo iniziale");
            try {
            Numeroletto = tastiera.readLine();
            importo = Double.valueOf(Numeroletto).doubleValue();
            } 
            catch (Exception e) {
            System.out.println("Ce stato sun errore");
            }
        C1 = new ContoCorrente(importo);
        do {
            System.out.println("Inserisci 1 per Versare 2 per prelevare 0 per uscire");
            try {
                Numeroletto = tastiera.readLine();
                scelta = Integer.valueOf(Numeroletto).intValue();
            } 
            catch (Exception e) {
                System.out.println("Errore");
            }
            switch (scelta) {
                    case 1:
                    System.out.println("Quanto vuoi versare?");
                    try {
                    Numeroletto = tastiera.readLine();
                    importo = Double.valueOf(Numeroletto).doubleValue();
                    } 
                    catch (Exception e) {
                    System.out.println("Errore");
                    }
                    break;
                            case 2:
                            System.out.println("Quanto vuoi prelevare?");
                            if(importo <= C1.getSaldo()) {
                            C1.Prelieva(importo);
                            C1.Visual();;
                            }
                            else {
                            System.out.println("Non hai soldi vai a lavorare");
                            }
                            break;
                                case 0:
                                System.out.println("Uscita...");
                                break;
                                        default:
                                        System.out.println("Ho detto 0,1,2 non accetto altra roba");
                                        break;
            }
        } 
        while (scelta != 0);
    }
}
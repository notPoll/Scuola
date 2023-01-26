import java.io.*;
class MezzoDiTrasporto {
    private String Targa;
    private String Modello;
    private int Potenza;
    public MezzoDiTrasporto(String Targa, String Modello, int Potenza) {
        this.Targa = Targa;
        this.Modello = Modello;
        this.Potenza = Potenza;
    }
    public String getTarga() {
        return Targa;
    }
    public String getModello() {
        return Modello;
    }
    public int getPotenza() {
        return Potenza;
    }
    public void setTarga(String targa) {
        Targa = targa;
    }
    public void setModello(String modello) {
        Modello = modello;
    }
    public void setPotenza(int potenza) {
        Potenza = potenza;
    }
    public void Visualizza() {
        System.out.println("Targa: " + Targa);
        System.out.println("Modello: " + Modello);
        System.out.println("Potenza: " + Potenza);
    }
}
    class Automobile extends MezzoDiTrasporto {
        private int NumPorte;
        public Automobile(int NumPorte, String Targa , String Modello, int Potenza) {
            super(Targa, Modello, Potenza);
            this.NumPorte = NumPorte;
        }
        public int getNumPorte() {
            return NumPorte;
        }
        public void setNumPorte(int numPorte) {
            NumPorte = numPorte;
        }

        public void Visualizza() {
            System.out.println("Numero Porte: " + NumPorte);
        } 
        public int bolloAuto(int Potenza , int bollo) {
            if(Potenza > 80 ) {
                bollo = Potenza + Potenza*3;
            }
            else {
                bollo = Potenza + Potenza*2;
            }
            return bollo;
        }
    }
class MainMezzi {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);   
        BufferedReader tastiera = new BufferedReader(input);
        String Targa = "" , Modello = "", Scelta = "" , NumLetto = "";
        int Potenza = 0, Bollo = 0, NumPort = 0;
        final int DIM = 10;
        MezzoDiTrasporto Mezzi[] = new MezzoDiTrasporto[DIM];
        for (int i=0; i < DIM; i++) {
            System.out.println("vuoi inserire un Automobile o un altro mezzo?");
            try {
                Scelta = tastiera.readLine();
            }
            catch (Exception e) {
                System.out.println("Errore");
            }
            try {
                Targa = tastiera.readLine();
            } 
            catch (Exception e) {
                System.out.println("Errore 1");
            }
            try {
                Modello = tastiera.readLine();
            } 
            catch (Exception e) {
                System.out.println("Errore 2");
            }
            try {
                NumLetto = tastiera.readLine();
                Potenza = Integer.valueOf(NumLetto).intValue();
            } 
            catch (Exception e) {
                System.out.println("Errore 3");
            }
            if(Scelta.equals("Automobile")) {
                System.out.println("inserisci il numero di portiere");
                try {
                    NumLetto = tastiera.readLine();
                    NumPort = Integer.valueOf(NumLetto).intValue();
                } 
                catch (Exception e) {
                    System.out.println("Errore 4");
                }
                Mezzi[i] = new Automobile(NumPort,Targa,Modello,Potenza);
            }
            else {
            Mezzi[i] = new MezzoDiTrasporto(Targa, Modello, Potenza);
            }    
        }
        for (int i=0; i<DIM; i++) {
            if (Mezzi[i] instanceof Automobile) {
                Mezzi[i].Visualizza();
            }
        }
    }
}
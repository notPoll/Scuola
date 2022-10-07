package quadrato;
import java.io.*;
class quadrato {
    private double lato;
                        public void setLato(double l) {
                        lato = l;
                        }
                    public double getLato() {
                        return lato;
                    }
                public double area() {
                 return (lato * lato);
                }
            public double perimetro() {
                return (lato*4);
            }
        public void Visual() {
            System.out.println("lato: " + lato);
        }
    public boolean equals(quadrato q1) {
        if(lato==q1.lato) {
            return true;
        }
        else {
            return false;
        }
            
    }
}
class mainquad {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String quadratoget;
        int q1;
        int q2;
        System.out.println("Inserisci un lato per il tuo quadrato");
            try {
                quadratoget = tastiera.readLine();
                q1 = Integer.valueOf(quadratoget).intValue();
            }
                    catch(Exception exception) {
                        System.out.println("ce stato un errore");
                    }
                        try {
                            quadratoget = tastiera.readLine();
                            q2 = Integer.valueOf(quadratoget).intValue();
                        }
                                catch(Exception exception) {
                                    System.out.println("Ce stato un errore");
                                }
    }
}
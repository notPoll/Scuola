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
}
class mainquad {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    public static void main(String[] args) {
        System.out.println("Inserisci un lato per il tuo quadrato");
    }
}
package Munnez.quadrato;
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
        quadrato Q1;
        quadrato Q2;
        int lato1 = 0;
        int lato2 = 0;  
        System.out.println("Inserisci il lato del tuo primo quadrato");
            try {
                quadratoget = tastiera.readLine();
                lato1 = Integer.valueOf(quadratoget).intValue();
            }
                catch(Exception exception) {
                    System.out.println("ce stato un errore");
                }
                        System.out.println("Inserisci il lato del secondo quadrato");
                        try {
                            quadratoget = tastiera.readLine();
                            lato2 = Integer.valueOf(quadratoget).intValue();
                        }
                            catch(Exception exception) {
                                System.out.println("Ce stato un errore");
                            }
                                Q1 = new quadrato();
                                Q2 = new quadrato();
                                Q1.setLato(lato1);
                                Q2.setLato(lato2);
                    System.out.println("L'area del primo quadrato è: " + Q1.area());
                System.out.println("L'area del secondo quadrato è: " + Q2.area());
            System.out.println("Il perimetro del primo quadrato è: " + Q1.perimetro());
        System.out.println("Il perimetro del primo quadrato è: " + Q2.perimetro());
    System.out.println("Verificando se Il quadrato 1 e il quadrato 2 sono uguali..." +  Q1.equals(Q2));
    }
}
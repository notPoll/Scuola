package Punti;
import java.io.*;
class Punto {
    private double cord;
    private double x;
    private double y;
        public Punto(double x , double y) {
            this.x = x;
            this.y = y;
        }
            public void setAX(double xa) {
                    x = xa;
            }
                public double getAX() {
                    return x;
                }
                    public void setAY(double ya) {
                        y = ya;
                    }
                        public double getAY() {
                            return y;
                        }
                            public void setBX(double xb) {
                                x = xb;
                            }  
                                public double getBX() {
                                    return x;
                                }
                                    public void setBY(double yb) {
                                        y = yb;
                                    }  
                                        public double getBY() {
                                            return y;
                                        }
                                                public void Visual() {
                                                    System.out.println("La cordinata C è "  + x + y);
                                                }
                                                    public void CTrasla() {
                                                        x = x + 10;
                                                        y = y + 5;
                                                        System.out.println("Le nuove coordinate sono: " + x + y);
                                                    }
}                                 
class MainPunto {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String NumeroLetto;
        Double Ax , Ay;
        Double Bx , By;
        System.out.println("Inserisci le cordinate A(x,y)");
        try {
            NumeroLetto= tastiera.readLine();
            Ax = Double.valueOf(NumeroLetto).doubleValue();
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }
        try {
            NumeroLetto= tastiera.readLine();
            Ay = Double.valueOf(NumeroLetto).doubleValue();
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }
        try {
            NumeroLetto= tastiera.readLine();
            Bx = Double.valueOf(NumeroLetto).doubleValue();
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }
        try {
            NumeroLetto= tastiera.readLine();
            By = Double.valueOf(NumeroLetto).doubleValue();
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }
    }
}
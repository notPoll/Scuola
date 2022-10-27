package Punti;
import java.io.*;
class Punto {
    private double cord;
    private double xa;
    private double ya;
    private double xb;
    private double yb;
    private double xc; // xc = xa + ya
    private double yc; // yc = xb + yb
        public Punto(double temp) {
            cord = temp;
        }
            public void setAX(double x) {
                    xa = x;
            }
                public double getAX() {
                    return xa;
                }
                    public void setAY(double y) {
                        ya = y;
                    }
                        public double getAY() {
                            return ya;
                        }
                            public void setBX(double x) {
                                xb = x;
                            }  
                                public double getBX() {
                                    return xb;
                                }
                                    public void setBY(double y) {
                                        yb = y;
                                    }  
                                        public double getBY() {
                                            return yb;
                                        }
                                            public void C() {
                                                xc = xa + ya;
                                                yc = ya + xb;
                                            }
                                                public void Visual() {
                                                    System.out.println("La cordinata C è "  + xc + yc);
                                                }
                                                    public void CTrasla() {
                                                        xc = xc + 10;
                                                        yc = yc + 5;
                                                        System.out.println("Le nuove coordinate sono: " + xc + yc);
                                                    }
}                                 
class MainPunto {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String NumeroLetto;
        System.out.println("Inserisci le cordinate A(x,y)");

    }
}
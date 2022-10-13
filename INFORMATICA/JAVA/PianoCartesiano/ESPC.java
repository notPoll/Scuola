package PianoCartesiano;
import java.io.*;
public class ESPC {
    private double puntox;
    private double puntoy;
    public void setX(double x) {
        puntox = x;
        }
            public double getX() {
                return puntox;
            }
                public void setY(double y) {
                    y = puntoy;
                }
                    public double getY() {
                        return puntoy;
                    }
                        public void Visual() {
                            System.out.println("punto x: " + puntox);
                            System.out.println("Punto y: " + puntoy);
                        }
                                public boolean equalsy(ESPC p2) {
                                    if((puntoy==p2.puntoy) && (puntox==p2.puntox)) {
                                        return true;
                                    }
                                    else 
                                        return false;
                                }
                                public double Distanza(ESPC p1) {
                                   double d;
                                d = Math.sqrt(Math.pow(p1.puntox - puntox,2) + Math.pow(p1.puntoy - puntoy,2));
                                return d;
                                }
}
class MainPunto {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
    }
}

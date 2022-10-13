package PianoCartesiano;
import java.io.*;
public class Punto {
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
                                public boolean equalsy(Punto p2) {
                                    if((puntoy==p2.puntoy) && (puntox==p2.puntox)) {
                                        return true;
                                    }
                                    else 
                                        return false;
                                }
                                public double Distanza(Punto p1) {
                                   double d;
                                d = Math.sqrt(Math.pow(p1.puntox - puntox,2) + Math.pow(p1.puntoy - puntoy,2));
                                return d;
                                }
}
 public class MainPianoCartesiano {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        double x1,x2,y1,y2;
        Punto p1,p2;
        System.out.println("Inserisci la X");
        try {
            string Numero = tastiera.readLine();
                
        } 
        catch (Exception e) {}
        x1 = 
        
        }   
        
}
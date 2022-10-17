package Piano;
import java.io.*;
public class piano {
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
                            public boolean equalsy(eserciziopiano p2) {
                                if((puntoy==p2.puntoy) && (puntox==p2.puntox)) {
                                    return true;
                                }
                                else 
                                    return false;
                            }
                                public double Distanza(eserciziopiano p1) {
                                   double d;
                                d = Math.sqrt(Math.pow(p1.puntox - puntox,2) + Math.pow(p1.puntoy - puntoy,2));
                                return d;
                                }
    }
public class pianomain{
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        double x1,x2,y1,y2;
        eserciziopiano p1,p2;
        System.out.println("Inserisci la X");
        try {
            String Numero = tastiera.readLine();
            x1 = Double.valueOf(Numero).doubleValue();
        } 
        catch (Exception e) {
        System.out.println("ce stato un errore");
        }   
            try {
                String Numero = tastiera.readLine();
                    x2 = Double.valueOf(Numero).doubleValue();
            } 
            catch (Exception e) {
                System.out.println("ce stato un errore");
            }
                try {
                    String Numero = tastiera.readLine();
                        y1 = Double.valueOf(Numero).doubleValue();
                } 
                catch (Exception e) {
                    System.out.println("ce stato un errore");
                }
                    try {
                        String Numero = tastiera.readLine();
                        y2 = Double.valueOf(Numero).doubleValue();
                    } 
                    catch (Exception e) {
                        System.out.println("ce stato un errore");
                    }
                        p1.setX(x1);
                        p1.setY(y1);
                        p2.setX(x2);
                        p2.setY(y2);

                    if(p1.equals(p2)==true) {
                    System.out.println("i punti sono uguali");
                    }
                        else {
                            double d = p1.Distanza(p2);
                        }
    }  
}
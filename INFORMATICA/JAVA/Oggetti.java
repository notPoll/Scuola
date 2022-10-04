import java.io.*;
class Cerchio {
    private double raggio;
    public void setRaggio(double r) {
        raggio = r;
    }
    public double area() {
        return (raggio * raggio * Math.PI);
    }
 }
class main {
    public static void main(String args[]) {
    Cerchio tavolo;
    tavolo = new Cerchio();
    tavolo.setRaggio(0,75);
    System.out.println("L'area del tavolo è" + tavolo.area());
    }
}
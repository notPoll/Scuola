package Verifica;
import java.io.*;
import java.net.IDN;
import java.sql.Time;
class Libro {
   private String titolo;
   private String autore;
   private String id;
   public void Libro(String titemp , String autemp , String idtemp ) {
    this.titolo = titemp;
    this.autore = autemp;
    this.id = idtemp;
   }
   public void setTitolo(String tit) {
       this.titolo = tit;
   }
   public String getTitolo() {
       return titolo;
   }
   public void setAutore(String aut) {
       this.autore = aut;
   }
   public String getAutore() {
       return autore;
   }
   public void setId(String idd) {
       this.id = idd;
   }
   public String getId() {
       return id;
   }
   public void Visualizza(Libro v[]) {
    System.out.println("Titolo: " + titolo);
    System.out.println("Autore: " + autore);
    System.out.println("ID: " + id);
   }
}
class LibreriaMain {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String numeroletto;
        final int DIM = 100;
        String titolo="" , autore="" , id="";
        System.out.println("Inserimento Libri Libreria");
        Libro[] v = new Libro[DIM];
        for (int i = 0; i < v.length; i++) {
            System.out.println("\n Titolo del Libro:" );

        }
    }
}

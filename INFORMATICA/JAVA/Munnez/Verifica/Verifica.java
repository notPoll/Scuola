package Munnez.Verifica;
import java.io.*;
class Libro {
   private String titolo;
   private String autore;
   private String id;
   public Libro(String titemp , String autemp , String idtemp ) {
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
   public void Visualizza() {
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
        final int DIM = 4;
        String titolo="" , autore="" , id="";
        System.out.println("Inserimento Libri Libreria");
        Libro[] v = new Libro[DIM];
        for (int i=0; i<v.length; i++) {
            System.out.println("\n Titolo del Libro?:");
            try {
                titolo = tastiera.readLine();
            } 
            catch (Exception e) {
                System.out.println("Errore1");
            }
                System.out.println("\n Autore del libro?:");
                try {
                    autore = tastiera.readLine();
                } 
                catch (Exception e) {
                    System.out.println("Errore2");
                }
                    System.out.println("ID del libro?:");
                    try {
                        id = tastiera.readLine();
                    } 
                    catch (Exception e) {
                        System.out.println("Errore3");
                    }
                    v[i] = new Libro(titolo , autore , id);
            
        }
        System.out.println("Ordinamento della libreria..");
        boolean scambio = false;
        int d=DIM;
        Libro temp=null;
        do {
            scambio=false;
			for(int i=0; i<d-1;i++) {
				if(v[i].getId().compareTo(v[i+1].getId())>0) {
					v[i]=temp;
					v[i]=v[i+1];
					v[i+1]=temp;
					scambio=true;
				}
			}
			d=DIM-1;
		}
        while(scambio==false);
        System.out.println("Inserisci \n 1: per modificare un libro \n 2: per visualizzare la libreria \n 3: per uscire dal programma.");
        int scelta=0;
        do {
            try {
                numeroletto = tastiera.readLine();
                scelta = Integer.valueOf(numeroletto).intValue();
            } 
            catch (Exception e) {
                System.out.println("Errore2");
            }
            switch (scelta) {
                case 1:
                String Cerca="";
                System.out.println("Inserisci l'ID del libro che vuoi modificare");
                try {
                    Cerca = tastiera.readLine();
                } 
                catch (Exception e) {
                    System.out.println("Errore3");
                }
                int inizio=0, centro=0, fine=0, pos=-1;
				do {
					centro=(inizio+fine)/2;
					if(Cerca.equals(v[centro].getId())) {
						pos=centro;
					}
					else {
						if(Cerca.compareTo(v[centro].getId())<0) {
							fine=centro-1;
						}
						else {
							inizio=centro+1;
						}
					}	
				}
                while(pos==-1 && inizio <= fine);
				
				if(pos==-1) {
					System.out.println("nessun elemento trovato");
				}
				else {
                    System.out.println("Nuovo Nome:");
                    try {
                        autore = tastiera.readLine();
                    } 
                    catch (Exception e) {
                        System.out.println("ErroreX");
                    }
                    System.out.println("Nuovo titolo");
                    try {
                        titolo = tastiera.readLine();
                    } 
                    catch (Exception e) {
                        System.out.println("ErroreY");
                    }
                    v[pos].setAutore(autore);
                    v[pos].setTitolo(titolo);
					System.out.println("contatto modificato");
				}
                break;
                case 2:
                v[DIM].Visualizza();
                break;
                case 0:
                System.out.println("Uscita...");
                break;
                default:
                    System.out.println("Hai inserito un numero diverso da 1,2,0");
                break;
            }
        } 
        while (scelta != 0);
        }
    }

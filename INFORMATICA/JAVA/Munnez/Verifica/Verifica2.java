package Munnez.Verifica;
import java.io.*;
class Verifica2 {
    private String parola="";
    public Verifica2(String n) {
        parola = n;
    }
    public void setParola(String pa) {
        parola = pa;
    }
    public String getParola() {
        return parola;
    }
}
class mainVerifica2 {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String numeroletto;
        String lettera="";
        String parola="";
        System.out.println("Inserire la stringa su cui effettuare la ricerca.. \n:");
        try {
            lettera = tastiera.readLine();
        } 
        catch (Exception e) {
            System.out.println("Errore1");
        }
        int prima=0 , dopo=0;    
					if(parola.equals(parola)) {
						prima=dopo;
					}
					else {
						if(parola.compareTo(parola)<0) {
							prima=dopo-1;
						}
						else {
							prima=dopo+1;
						}
					}	            
					System.out.println("nessun carattere doppio vicino trovato");
				}
                else {
                    System.out.println("Doppio carattere trovato!");
                }
        } 


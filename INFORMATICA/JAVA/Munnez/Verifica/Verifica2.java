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
        int inizio=0, centro=0, fine=0, pos=-1;
				do {
					centro=(inizio+fine)/2;
					if(parola.equals(parola)) {
						pos=centro;
					}
					else {
						if(parola.compareTo(parola)<0) {
							fine=centro-1;
                            System.out.println("Parola doppia non trovata");
						}
						else {
                            System.out.println("Parola doppia trovata");
							inizio=centro+1;
						}
					}	
				}
                while(pos==-1 && inizio <= fine);
				
				}
        } 


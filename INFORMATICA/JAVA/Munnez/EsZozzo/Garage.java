package Scuola.INFORMATICA.JAVA.Munnez.EsZozzo;
import java.io.*;
/*
3.Scrivere un programma che consenta l’inserimento delle
informazioni relative a 100 laureati (alcuni di essi potranno essere
anche professori) in un array e successivamente visualizzi tutte le
informazioni relative ai soli professori di Informatica.
*/
class Laureato {
    private String Nome;
    private String Cognome;
    private String Laurea;
    public Laureato(String Nome, String Cognome, String Laurea) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Laurea = Laurea;
    }
        public String getNome() {
            return Nome;
        }
            public String getCognome() {
                return Cognome;
            }
                public String getLaurea() {
                    return Laurea;
                }
                    public void setNome(String nom) {
                        Nome = nom;
                    }
                        public void setCognome(String cog) {
                            Cognome = cog;
                        }
                            public void setLaurea(String lau) {
                                Laurea = lau;
                            }
                                public void visualizza() {
                                    System.out.println("Nome: " + Nome);
                                    System.out.println("Cognome: " + Cognome);
                                    System.out.println("Laurea: " + Laurea);
                                }
}
class Professore extends Laureato {
    private String MateriaInsegnata;
    public Professore(String Nome, String Cognome, String Laurea,String MateriaInsegnata) {
        super(Nome, Cognome, Laurea);
        this.MateriaInsegnata = MateriaInsegnata;
    }
    public String getMateriaInsegnata() {
        return MateriaInsegnata;
    }
        public void setMateriaInsegnata(String matin) {
            MateriaInsegnata = matin;
        }
            public void visualizza() {
                super.visualizza();
                System.out.println("Materia Insegna: " + MateriaInsegnata);
            }
    } 
class MainLaureati {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);   
        BufferedReader tastiera = new BufferedReader(input);
        String Nome="",Cognome="",Laurea="",MateriaInsegna="",Scelta="";
        final int DIM=100;
        Laureato L[] = new Laureato[DIM];
        for (int i= 0; i<DIM; i++) {
            System.out.println("Vuoi inserire un professore o un laureato?");
            try {
                Scelta = tastiera.readLine();
            } 
            catch (Exception e) {
                System.out.println("Errore" + e);
            }
                System.out.println("Inserisci Nome..");
                try {
                    Nome = tastiera.readLine();
                } 
                catch (Exception e) {
                    System.out.println("Errore1");
                }
                    System.out.println("Inserisci Cognome..");
                    try {
                        Cognome = tastiera.readLine();
                    } 
                    catch (Exception e) {
                        System.out.println("Errore2");
                    }
                    System.out.println("Inserisci Laurea..");
                        try {
                            Laurea = tastiera.readLine();
                        } 
                        catch (Exception e) {
                            System.out.println("Errore3");
                        }
                        if(Scelta.equals("Si")) {
                            System.out.println("Inserisci la materia insegnata");
                            try {
                                MateriaInsegna = tastiera.readLine();
                            } 
                            catch (Exception e) {
                                System.out.println("Errore 4");
                            }
                            L[i] = new Professore(Nome,Cognome,Laurea,MateriaInsegna);
                        }
                        else {
                            L[i] = new Laureato(Nome,Cognome,Laurea);
                        }
        }
        for (int i=0; i < DIM; i++) {
            if(L[i] instanceof Professore) {
                if(((Professore)L[i]).getMateriaInsegnata().equals("Informatica"));
                L[i].visualizza();
            }
        }
    }
}

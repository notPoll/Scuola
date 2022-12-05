/*
Scrivere un programma per la gestione di una rubrica telefonica che consenta l’inserimento delle informazioni (nome e numero di telefono) relative a 100 contatti in un array e successivamente permetta di modificare il numero di telefono di un contatto determinato in base al nome fornito dall'utente (si suppone che nell'array non ci siano contatti con nome uguale).
Si richiede che la ricerca del contatto da modificare sia effettuata utilizzando la ricerca dicotomica.

Suggerimento: la classe Contatto dovrà prevedere gli attributi nome e numeroDiTelefono, il metodo costruttore, ed i metodi: getNome, getNumeroDiTelefono, setNome, setNumeroDiTelefono e visualizza.
*/
package Blabla;
import java.io.*;
class Contatto {
    private String nome;
    private String numero;
    public Contatto(String tempnum , String tempnom) {
        this.numero = tempnum;
        this.nome = tempnom;
    }
        public void setNome(String nome) {
        this.nome = nome;
        }
            public String getNome() {
                return nome;
            }
                public void setNumero(String numero) {
                    this.numero = numero;
                }
                    public String getNumero() {
                        return numero;
                    }
                        public void visualizza() {
                            System.out.println("Il tuo nome e il tuo numero sono: " + nome + numero);
                        }
                            public static void BubbleSort(Contatto v[]) {
                                boolean scambio=false;
                                int n=0;
                                do {
                                    scambio=false;
                                    Contatto temp;
                                    for (int i=0; i<v.length -1-n;i++) {
                                            if (v[i].getNome().compareTo(v[i+1].getNome())>0) {
                                                temp=v[i];
                                                v[i]=v[i+1];
                                                v[i+1]=temp;
                                                scambio=true;
                                            }
                                    }
                                n++;
                                }
                                while(scambio); 
                            }
                            public static int BinarySearch(Contatto v[] , String Name) {
                                int start=0,end=v.length-1,center=0, pos=-1;
                                do {
                                    center=(start+end)/2;
                                    if (v[center].getNome().equals(Name)) {
                                        pos=center;
                                    }
                                    else {
                                        if(Name.compareTo(v[center].getNome())>0) {
                                            start=center+1;
                                        }
                                        else {
                                            end=center-1;
                                        }

                                    }
                                }
                                while(pos==-1 && start<=end);
                                return pos;
                            }
}
class RubricaMain {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String numeroletto;
        int N=0;
            System.out.println("Inserisci la dimensione dell'array");
            try {
                numeroletto = tastiera.readLine();
                N = Integer.valueOf(numeroletto).intValue();
            } 
            catch (Exception e) {
            System.out.println("Errore1");
            }
            
    }
}
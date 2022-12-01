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
}
class RubricaMain {
    private static final int scelta = 0;

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
            Contatto a[] = new Contatto[N];
            for (int i = 0; i < N; i++) {
                System.out.println("\n Numero: " + (i+1) + ":");
                System.out.println("Nome: ");
            }
    }
}
package Munnez.Verifica;
import java.io.*;
class Verifica2 {
    public static boolean search(String str){
        boolean trovato=false;
        int i=0;
        do{
            if(str.charAt(i)==str.charAt(i+1)){
                trovato=true;
            }
        }while(!trovato && i<str.length());
    }
}
class mainVerifica2 {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String parola="";
        System.out.println("Inserire la stringa su cui effettuare la ricerca.. \n:");
        try {
            parola = tastiera.readLine();
        } 
        catch (Exception e) {
            System.out.println("Errore1");
        }

        if(Verifica2.search(parola)){

        }
    } 
}


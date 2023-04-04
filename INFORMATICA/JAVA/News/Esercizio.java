package Scuola.INFORMATICA.JAVA.News;
import java.util.*;
import java.io.*;
class MainProgramma {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);   
        BufferedReader tastiera = new BufferedReader(input);
        ArrayList<Integer> V1 = new ArrayList<Integer>();
        ArrayList<Integer> V2 = new ArrayList<Integer>();
        ArrayList<Integer> V3 = new ArrayList<Integer>();
        try {
            
        } 
        catch (Exception e) {
            System.out.println("Errore");
        }
        try {
            
        } 
        catch (Exception e) {
            System.out.println("Errore1");
        }

        while(V1.size()>0 && V2.size()>0) {
            if(V1.get(0)>V2.get(0)) {
                V3.add(V2.remove(0));
            }
            else {
            V3.add(V1.remove(0));
            }
        }
        while(V2.size()>0) {
            V3.add(V2.remove(0));
        }
    }   
}
/*
Scrivere un programma che simuli il funzionamento di una caldaia permettendo all'utente, dopo aver impostato
la temperatura iniziale, di cambiarla tramite un menu:
1: aumenta temperatura di 1
2: diminuisci la temperatura di 1
3: imposta nuova temperatura
4: visualizza la temperatura
5: fine
NB: il minimi è 10 gradi e il massimo è 30 gradi
*/
//package ; //mettere il nome della cartella dove andrà il file
package Scuola.VarirTest;
import java.io.*;
class Caldaia  {
    private int temperatura;
    public Caldaia(int temp) {
        temperatura = temp;
    }
                public void setTemp(int a) { 
                    temperatura = a;
                }
                int getTemp() {
                    return temperatura;
                }
    public void AumentaTemp(int temperatura) {
        temperatura = temperatura + 1;
    }
    public void DiminuisciTemp(int temperatura) {
        temperatura = temperatura - 1;
    }
        public void Visualizza() {
            System.out.println("La temperatura attuale è di : " + temperatura);
        }
}
class CaldaiaMain {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String Numeroletto;
        int Temperatura;
        int Scelta=0;
        Caldaia C1;
        int x=10;
        int y=30;
        System.out.println("Inserici la temperatura iniziale :");
        System.out.println("La temperatura deve essere di una massima di 30 gradi a una minima di 10");
        try {
            Numeroletto = tastiera.readLine();
            Temperatura = Integer.valueOf(Numeroletto).intValue();
            if(Temperatura <= x || Temperatura >= y) {
                System.out.println("La temperatura è maggiore di 30 o minore di 10");
            }
        }
        catch(Exception e) {
            System.out.println("C'è stato un errore");
        }
        C1 = new Caldaia();
        C1.setTemp(Temperatura);
        do {
        System.out.println("Ciao, ecco a te un menu di scelta: \n 1: per aumentare la temperatura di 1 grado. \n 2: per diminuire la temperatura di 1 grado \n 3: per impostare una nuova temperatura. \n 4: per visualizzare la temperatura costante. \n 0 per uscire ");
            try {
                Numeroletto = tastiera.readLine();
                Scelta = Integer.valueOf(Numeroletto).intValue();
            } 
            catch (Exception e) {
                System.out.println("C'è stato un Errore");
            }
            switch(Scelta) {
            case 1:
            System.out.println("Aumento della temperatura di 1...");
            if(Temperatura >= 30) {
                System.out.println("La temperatura è maggiore di 30 non posso aumentare oltre");
            }
            C1.AumentaTemp(Temperatura);
            break;

                case 2:
                System.out.println("Diminuimento della temperatura di 1...");
                C1.DiminuisciTemp(Temperatura);
                if(Temperatura <= 10) {
                System.out.println("La temperatura è minore di 10 non posso diminuire oltre");
                }
                break;
                    case 3:
                    System.out.println("Inserisci la nuova temperatura ");
                    try {
                    Numeroletto = tastiera.readLine();
                    Temperatura = Integer.valueOf(Numeroletto).intValue();
                    if(Temperatura <= x || Temperatura <= y) {
                        System.out.println("La temperatura è maggiore di 30 o minore di 10");
                    }
                        System.out.println("Temperatura inserita.");
                    }
                    catch(Exception e) {
                        System.out.println("C'è Stato un errore");
                    }
                    break;
                        case 4:
                        C1.Visualizza(); 
                        break;
                                case 0:
                                    System.out.println("Uscita...");
                                break;
                                default:
                                System.out.println("Hai inserito un numero diverso da 1,2,3,4,0");
                                break;
            }
        }
            while(Scelta!=0);        
    }
}
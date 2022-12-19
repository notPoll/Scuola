package EsercizioRub;
import java.io.*;
class Rubrica {
	private String nome;
	private String numero;
	public Rubrica(String numero, String nome) {
		this.nome=nome;
		this.numero=numero;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setNumero(String numero) {
		this.numero=numero;
	}
	public String getNome() {
		return nome;
	}
	
	public String getNumero(String numero) {
		return numero;
	}
	
	
	public void visualizza( ) {
		System.out.println("il numero di telefono è: " + numero);
		System.out.println("il nome del contatto è: " + nome);
	}
	
	public boolean equals(Rubrica nome1) {
		if(nome==nome1.nome) {
			return true;
		}
		else {
			return false;
		}
	}
}
class ProgRubrica {

	public static void main(String[] args) {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader (input);
		
		
		final int DIM=100;
		String nome="", numero="";
        Rubrica v[]= new Rubrica [5]; //creazione dell array
		//creazione oggetto
		//riempio l'array istanzio
		for(int i=0; i<v.length ;i++) {
			System.out.println("inserisci il numero di telefono, del contatto: +39");
			try {
				numero = tastiera.readLine();
			}
			catch(Exception e) {
				System.out.println("si è verificato un errore");
			}
			System.out.println("inserisci il nome del contatto");
			try {
				nome =tastiera.readLine();
			}
			catch(Exception e) {
				System.out.println("si è verificato un errore");
			}
			v[i] = new Rubrica(numero, nome);
		}
		//ordinare l'array l'ordinamento bubblesort
		boolean scambio=false;
		int d=DIM;
		Rubrica temp = null;
		do {
			scambio=false;
			for(int i=0; i<d-1;i++) {
				if(v[i].getNome().compareTo(v[i+1].getNome())>0) {
					v[i]=temp;
					v[i]=v[i+1];
					v[i+1]=temp;
					scambio=true;
				}
			}
			d=DIM-1;
		}
        while(scambio==false);
        //fine ordinamento
		int scelta=0;	
		do {
			System.out.println("inserisci 1 per cambiare un numero telefonico, 2 per visualizzare la rubrica, 3 per uscire");
			try {
				String numeroLetto = tastiera.readLine();
				scelta= Integer.valueOf(numeroLetto).intValue();
			}
			catch(Exception e) {
				System.out.println("si è verificato un errore");
			}
			
			switch(scelta) {
			case 1:
				
				String nomeUtente="";
				System.out.println("inserisci il nome del numero di telefono che si vuole cambiare");
				try {
					nomeUtente = tastiera.readLine();
				}
				catch(Exception e) {
					System.out.println("si è verificato un errore");
				}
                //inizio ordinamento
				int inizio=0, centro=0, fine=0, pos=-1;
				do {
					centro=(inizio+fine)/2;
					if(nomeUtente.equals(v[centro].getNome())) {
						pos=centro;
					}
					else {
						if(nomeUtente.compareTo(v[centro].getNome())<0) {
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
					v[pos].setNumero(numero);
					System.out.println("contatto modificato");
				}
                //fine ordinamento
			break;	
			case 2:
				v[DIM].visualizza();
			break;
			
			case 3:
				System.out.println("sei fuori dal programma");
			break;
			}
		}
        while(scelta != 0);
	}
}
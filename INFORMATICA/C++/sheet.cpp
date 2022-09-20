/* 
-2 per visualizzare la squadra che ha fatto più vittorie
-3 per visualizzare la squadra con la differenza reti più grande
-4 stampare la classifica completa evidenziando opportunamente le ultime 3 squadre
 2 e 3 con delle funzioni*/
#include <iostream>
using namespace std;
    struct squadra {
        string nome;
        int punti;
        int vittoriefat;
        int goalfat;
        int goalsub;
    };
    void inseriscisquadra(squadra A[10], int index) {
        cout<<"Inserimento squadra.." <<endl;
        cout<<"Inserisci Nome:" <<endl;
        cin>> A[index].nome;
        cout<<"Inserisci i punti" <<endl;
        cin>> A[index].punti;
        cout<<"inserisci vittorie fatte:" <<endl;
        cin>> A[index].vittoriefat;
        cout<<"Inserisci goal fatti" <<endl;
        cin>> A[index].goalfat;
        cout<<"Inserisci goal subiti" <<endl;
        cin>> A[index].goalsub;
    };
string squadravittmax(squadra a[10]){
	string nomevitmax="";
	int vitmax=0;	
	for(int i=0; i<10;i++){
		if(a[i].vittoriefat>vitmax){
			vitmax=a[i].vittoriefat;
			nomevitmax=a[i].nome;
		}
	}
	return nomevitmax;	
}

string squadradiffmax(squadra a[10]){
	string nomediffmax="";
	int diffmax=0;	
	for(int i=0; i<10;i++){
		if(a[i].goalfat-a[i].goalsub>diffmax){
			diffmax=a[i].goalfat-a[i].goalsub;
			nomediffmax=a[i].nome;
		}
	}
	return nomediffmax;	
}
void classifica(squadra a[10], int index){
	for(int i=0;i<index;i++){
		for(int j=i+1;j<index+1;j++){
			if(a[j].punti>a[i].punti){
				squadra temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	
	for(int i=0;i<index;i++){
		
		cout<<"posizione "<<i+1<<": "<<a[i].nome;
		if(i>=index-3) cout<<"in retrocessione";
		cout<<endl;
	}
}
int main() {
    squadra A[10];
    int scelta;
    int index=0;
    do {
        cout<<"Inserisci: " <<endl;
            cout<<"1 per inserire i dati di una squadra." <<endl;
                cout<<"2 per visualizzare la squadra che ha fatto piu' vittorie" <<endl;
                    cout<<"3 per visualizzare la squadra con differen<a reti piu grande" <<endl;
                        cout<<"4 per stampare la classifica mostrando le ultime 3 squadre" <<endl;
                            cout<<"0 per uscire dal programma";  
            cin>>scelta;
            switch (scelta) {
            case 1:
            inseriscisquadra(A,index);
            index++;
                break;
                case 2:
                cout<<squadravittmax(A);
                    break;
                    case 3:
                    cout<<squadradiffmax(A);
                        break;
                        case 4:
                        classifica(A, index);
                            break;
                            case 0:
                                cout<<"Stai uscendo dal programma...";
                                break;
                                    default:
                                        cout<<"Hai scelto u numero non valido..";
                                        break;
            }
    } while (scelta!=0);
    return 0;
}
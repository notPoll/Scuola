function validazione() {

    let Importo=0;
    let Camere="";
    let Nome=document.getElementById("Nome").value;
    let Cognome=document.getElementById("Cognome").value;
    let Data=document.getElementById("Data").value;
    let Notti=document.getElementById("Notti").value;
    let Radio=document.getElementsByName("Radio")
    if(Nome=="" || Cognome=="" || Data=="" || Notti=="") {
        alert("Inserisci tutti i campi");
    }
    let Trovato=false;
        for (inti=0; i<Radio.length; i++) {
            if(Radio[i].checked) {
                Trovato=true;
            }
        }
            if (Trovato=false) {
                alert("Selezionare almeno un radio");
                return false;
            }
            Notti=parseInt(Notti);
            if (Document.getElementById("Singola").checked) {
                Importo=Notti*30;
            }
            else {
                Importo=Notti*60;
            }
            alert("Nome" + Nome +  "Cognome:" + Cognome + "Data:" + Data + "Numero notti:" + Notti + "Camera" + Camere + "Importo" + Importo );
            alert(Stampa)
            document.getElementById("Par").innerHTML=Stampa;
}

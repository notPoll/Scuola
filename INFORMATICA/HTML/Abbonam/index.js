function validazione() {
    let Nome=document.getElementById("Nome").value;
    let Cognome=document.getElementById("Cognome").value;
    let Data=document.getElementById("Data").value;
    let Giorni=document.getElementById("nGiorni").value;
    let NomeQuotidiano=document.getElementById("NomeQuotidiano").value;
    if(Nome="") {
        alert("Mancante");
    }
    if(Cognome="") {
        alert("Mancante");
    }
}
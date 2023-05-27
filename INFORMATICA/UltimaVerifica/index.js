function Premuto() {
    //let importo=0;
    let nome = document.getElementById("Nome").value;
    let cognome = document.getElementById("Cognome").value;
    let codfisc = document.getElementById("CodFisc").value;
    let provres = document.getElementById("ProvRes").value;
    let data = document.getElementById("Data").value;
    let durata = document.getElementsByName("Durata");
    let pacchetti = document.getElementsByName("Pack");
    if(nome=="") {
        alert("Inserire nome");
        return false;
    }
    if(cognome=="") {
        alert("Inserire cognome");
        return false;
    }
    if(codfisc=="") {
        alert("Inserire Codice Fiscale");
        return false;
    }
    if(provres=="") {
        alert("Inserire Provincia di residenza");
        return false;
    }
    if(data=="") {
        alert("Inserire data");
        return false;
    }
    let find = false;
    for(let i=0; i<durata.length; i++) {
        if(durata[i].checked) {
            find=true;
        }
        if(find==false) {
            alert("non è stato scelto nessun campo");
            return false;
        }
    }
    let ver = 0;
        for(let i=0; i<pacchetti.length; i++) {
        if(pacchetti[i].checked==true) {
            ver++;
        }
            if(ver>2) {
                alert("Inserire almeno due campi");
                return false;
            }
        }
        let dati= "Nome: " + nome +
        "\n Cognome: " + cognome +
        "\n Codice Fiscale: " + codfisc +
        "\n Provincia: " + provres +
        "\n Data: " + data;
        if(document.getElementById("Mensile").checked) {
            dati+="\nMensile:30g"
        }
        else {
            dati+="\nAnnuale:365g"
        }
        let x=1;
        for(let i=0;i<pacchetti.length;i++) {
            if(pacchetti[i].checked==true) {
                dati+="\nPacchetto "+x+":"+pacchetti[i].value;
                x++;
            }
        }
       /* if(document.getElementById("Mensile").checked) {
            importo= 20;
        }
        if(document.getElementById("Annuale").checked) {
            importo= 120;
        }
        */
    alert(dati);
    //document.getElementById("Importo").innerHTML=importo;
    return true;
}
function send() {
    console.log("boh");
    const pietanze = Document.getElementsByTagName("pietanze");
    let pagamento = Document.getElementById("pagamento").value;
    let pietanzeSelected = [];

    for(let i=0; i<pietanze.length; i++) 
    {
        if(pietanze[i].checked) pietanzeSelected.push(pietanze[i]);
    }

    if(pietanzeSelected.length == 0)
    {
        alert("Scegliere almeno una pietanza");
        return false;
    }
    return true;   
}
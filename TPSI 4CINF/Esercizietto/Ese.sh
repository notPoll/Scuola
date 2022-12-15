for voti in `grep 4Cinf Classe.txt | cut -w -f2`
do
    let somma=somma+voti
    let n=n+1
done
let media=somma/n
echo "la media della classe 4cinf è $media"
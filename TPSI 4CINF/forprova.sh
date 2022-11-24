for voti in `grep pippo Alunni | cut -f3`
do
    let somma=somma+voti
    let n=n+1
done

let media=media/n
echo "la media è=$media"
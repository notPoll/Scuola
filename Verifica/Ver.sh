for trova in `cat Orto.txt | cut -w -f2`
do
    let somma=somma+trova
done
echo "la somma della dispensa è $somma"
for trova in `ls -l $1 | grep .txt | cut -w -f5`
do
    let somma=somma+trova
done
echo "La somma della dimensione è: $somma"

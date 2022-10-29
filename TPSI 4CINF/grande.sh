a=$1
b=$2
FILE=$3
if [ $a -gt $b ]
then
    echo " $a è maggiore di $b"
    if [ -e $FILE ]
    then
        echo " stampo del contenuto del file"
        cat "$FILE"
        else
        ls -l
    fi
else echo " errore $b è maggiore di $a"
fi
read -p "Ho messo in pausa"
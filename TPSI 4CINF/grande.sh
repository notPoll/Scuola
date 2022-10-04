a=$1
b=$2
FILE=$3
if [ $a -gt $b ]
then
if [ $FILE="" ]
then
ls -l
fi
cat "$FILE"
else echo " $b è maggiore di $a"
fi

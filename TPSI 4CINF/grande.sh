a=$1
b=$2
FILE=$3
if [ $a -gt $b ]
then
if [ -e $FILE ]
then
cat "$FILE"
else
ls -l
fi
else echo " $b è maggiore di $a"
fi
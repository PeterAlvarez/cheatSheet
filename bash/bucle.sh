#!/bin/bash

# forech con lista

LISTA="10 9 8 7 6 5 4 3 2 1"
for var in $LISTA
do
    echo $var
done

# num de 1 al 10

for i in `seq 1 10`; do
    echo " $i hola_mundo "
done

#while

CON=0
while [  $CON -lt 10 ]; do
    echo El contador es $CON
    let  CON=CON+1
done

for i in {1..10..2}
do
    echo "fleman"
done

#while true ; do
#	echo "infinity"
#done

for ((i=100;i<=115;i+=1)); do
    echo $i
sleep 1s
    echo $i > /dev/ttyS1
done

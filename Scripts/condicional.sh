#!/bin/bash

#read -p "ingrese num : " n
#read -p "ingrese num2 : " m

# -eq equals
if [ $(date +%e) -eq 1 ];
then
	echo "es primero"
else
	echo "no es primero"
fi

# -eq	Igual que (equal), sólo para números enteros
# -ne	Diferente que (non equal), sólo para números enteros
# -gt	Mayor que (greater than)
# -ge	Mayor o igual que (greater or equal than)
# -lt	Menor que (less than)
# -le	Menor o igual que (less or equal than)


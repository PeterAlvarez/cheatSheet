#!/bin/bash
clear;
read -p 'ingrese nota1 : ' nota1
read -p 'ingrese nota2 : ' nota2
read -p 'ingrese nota3 : ' nota3
sum=$[ $nota1 + $nota2 + $nota3]
echo $sum
let media=sum/3
echo "la media es = $media"

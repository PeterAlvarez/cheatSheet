
n = "N-1=2"
p = re.split('\+|\-|\=' , n)

print(p)>>>['N', '1', '2']

#de list a String
print( ','.join(p).replace(',', ''))>>>N12

############################
print( int( reduce( lambda  a,b : a+b , map( lambda x : ord( x ) , n ) ) / len( n ) ) )
#imprimir
print('Nombre: {} Apellido: {} años:{}'.format(a1 ,a2 ,1))

# String
a1 = """Hola mundo
        Como estas ?"""
# Redondeo
print(round(dat, 1))
#Ingresando datos
a = input() # ingresa String

#if
if (a==b==c) :
    and , or

#*******************************

#Tipos de for
palabra=[1,2,3,"12",True]
palabra = input()
for letra in palabra:
    print(letra)
    #letra po letra del String, para ambos casos
######
for i in range(50,-1,-2):
    print(i)
    ##salida
    # 50 48 46 .... 2 0

#********************************************

#Funciones
def saludo(a = input()):
    return  a*3
print(saludo())

#************************************

#tupla
tupla = (1,2,"e",True)
### una tupla no puede modificar sus valores
###
def enviar_datos():
    nombre = "Tux"
    correo = "tuxPro@gmail.com"
    edad = 20
    ciudad = "La Paz"
    return(nombre, correo,edad, ciudad)

def recibir_datos( datos ):
    print(datos[0])
    print(datos[1])
    print(datos[2])
    print(datos[3])


recibir_datos(enviar_datos())
print(type(enviar_datos()))

###Salida
    # Tux
    # tuxPro@gmail.com
    # 20
    # La Paz
    # <class 'tuple'>

#********************************************
>>> a = 'ZENOVW'
>>> ''.join(sorted(a))
'ENOVWZ'

elemento mas grande de una lista
# print(max(l))
#### Listas
lista = [1,2,3,"h",True]
lista.append("10")
lista.pop()

lisA = [1,5,5,4,5]
lisB = [1000,200,300,300]
lisA.extend(lisB)#Une dos listas
print(lisA)
del lisA[3]#Borra posision de lista
lisA.remove(300)#Borra elemento
lisA.count(5)#Cuenta elemento(5) en la lista
lisA.sort()
print(lisA)
lisA.sort(reverse=True)
print(lisA)
print(lisA[-2])#Imprime el Penultimo elemento
abc.index(i) #indice de un elemento
abc[::-1] # da la vuelta una lista
# Salida
    # [1, 5, 5, 4, 5, 1000, 200, 300, 300]
    # [1, 5, 5, 5, 200, 300, 1000]
    # [1000, 300, 200, 5, 5, 5, 1]
    # 5
#saca cantidad de elementos repetidos de una lista
from statistics import mode
print(mode(lista))
#otra forma
print(max(set(lista), key=lista.count))

# listas
set(lista)=> elimina elemntos repetidos de una lista
lista = [9,2,3,2,4,5,0]
lista2 = [9,2,5,8,10,11]
res = list(set(lista) & set(lista2)) # interseccion iguales de dos listas[9, 2, 5]
res = list(set(lista) | set(lista2)) # union [0, 2, 3, 4, 5, 8, 9, 10, 11]
res = list(set(lista) and set(lista2))# lista2 [2, 5, 8, 9, 10, 11]
res = list(set(lista) or set(lista2)) # lista [2, 3, 4, 5, 8, 9, 10]

#BORRA ELEMENTOS VACIOS DE UNA LISTA
texto="Prueba con     espacios  multiples"
str_list=texto.split(" ")
#este es el mas rapido
str_list = filter(None, str_list) # fastest
#O podemos utilizar este:
str_list = filter(bool, str_list) # fastest
#Este es otra opcion:
str_list = filter(len, str_list) # a bit slower
#O este otro:
str_list = filter(lambda item: item, str_list) # slower than list

#***************************************

#Diccionario
autores = {'libro 1': 'Jose Lujan', 'libro 2': 'Benito Perez', 'libro 3': 'Tux Pro'}
print(autores.values())#valores dicionario
print(autores.keys())#nombre valores dicionario
autores2 = autores.copy()
autores.clear() #vacia Diccionario
for autor in autores:
    print(autor)
print(autores2)
print(autores2.get('libro 2'))#saca un especifico
#actualiza un diccionario
diccionario = {'libro 1': 1000}
autores2.update(diccionario)
print(autores2)
    # ### salida
    #     dict_values(['Jose Lujan', 'Benito Perez', 'Tux Pro'])
    # dict_keys(['libro 1', 'libro 2', 'libro 3'])
    # {'libro 1': 'Jose Lujan', 'libro 2': 'Benito Perez', 'libro 3': 'Tux Pro'}
    # Benito Perez
    # {'libro 1': 1000, 'libro 2': 'Benito Perez', 'libro 3': 'Tux Pro'}

#***************************************
        # a = filter(None, list(map(str,input().split(" "))))
        # a = ' '.join(a)
        # a = ''.join(a)
        # # print(list(a))
        # print(type(a))
#CADENAS
sentence = ' hello  apple'
" ".join(sentence.split())
>>> 'hello apple'
# Convertir mayúsculas a minúsculas y viceversa
>>> cadena = "Hola Mundo"
>>> print cadena.swapcase()
hOLA mUNDO

# Convertir una cadena en Formato Título
>>> cadena = "hola mundo"
>>> print cadena.title()
Hola Mundo

# Centrar un texto
Método: center(longitud[, "caracter de relleno"])

# Retorna: una copia de la cadena centrada.

>>> cadena = "bienvenido a mi aplicación".capitalize()
>>> print cadena.center(50, "=")
===========Bienvenido a mi aplicación============

>>edondeo a 2 decimales y rellena con ceros su es necesario
print("%.2f" % variable)
print('ALTURA = {0:.2f}'.format(variable))

# retorna str llena espacios a la derecha
>>> "ABC".ljust(10)
'ABC       '
>>> "ABC".ljust(10, "#")
'ABC#######'
>>> "ABC".ljust(2, "#")
'ABC'

# retorna str llena espacios a la izquierda
>>> "ABC".rjust(10)
'       ABC'
>>> "ABC".rjust(10, "#")
'#######ABC'
>>> "ABC".rjust(2, "#")
'ABC'

#retorn str llena espacios al medio
>>> "ABC".center(10)
'   ABC    '
>>> "ABC".center(10, "#")
'###ABC####'
>>> "ABC".center(2, "#")
'ABC'

#retorna str llena un`espacios de string especifico
>>> '--12'.zfill(10)
'-000000-12'
>>> '--12'.rjust(10, '0')
'000000--12'


# suma una lista con reduce
suma = reduce(lambda x, y : x+y, map(int,input().split(" ")))



palabra.isalnum()         #verifica que todos los caracteres son alphanumeric
palabra.isalpha()         #verifica si todos los elementos son caracteres alfabeticos
palabra.isdigit()         #prueba si la cadena contiene números
palabra.istitle()         #prueba si la cadena contiene título palabras
palabra.isupper()         #prueba si la cadena contiene mayuscula
palabra.islower()         #prueba si la cadena contiene minuscula
palabra.isspace()         #prueba si la cadena contiene espacios
palabra.endswith('d')     #prueba si la cadena termina con una d
palabra.startswith('H')   #prueba si la cadena inicia con H

import numpy as np
a = ['a', 'l', 3.14, 42, 'u']
I = [0, 2]
np.delete(a, I).tolist()
# Returns: ['l', '42', 'u']

# tabla ascii
print(chr(97)) >> a
print(ord('[')) >> 91



#print
for i in range(3):
    print("Hola ", end="")
# >> Hola Hola Hola

import math
dat = 7.88567
print(round(dat, 2)) #7.89
print(math.ceil(7.3)) #8 entero proximo
print(math.floor(7.9))#7 entero anterior



















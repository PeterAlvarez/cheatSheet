





# ********join mas replace*****
# p="h,ol,a,c,o,m,o,e,s,t,a,===s"
# # p=['30', '12',','] da igual

# print( ','.join(p).replace(',', '').replace('=', ''))
#>> holacomoestas


# ************* Join ************
# myTuple = ("John", "Peter", "Vicky")
# myTuple2 = "hola"

# print("#".join(myTuple2))
# # >>h#o#l#a

# print("#".join(myTuple))
# # >>John#Peter#Vicky

# ************** replace *************
# print( "holahhhh".replace('h', 'H') )
# >>HolaHHHH

# *********split avanzado*********
# import re
# n = "N-1=2.1.2.0"
# p = re.split('\+|\-|\=|\.' , n)
# print(p)
# #>> ['N', '1', '2', '1', '2', '0']

#************** palindromo*************
# w="lasal"
# print( 'true' if w==w[::-1] else 'false' )







#n = int(input())
#sum = 0
#for i in range(n):
#    s = int( input(),2 )
#    if s%2!= 0:
#        sum+=s
#print(sum)



#c = input()
#l = int( input(  ) )
#print( c.center( l , "*" ) if l%2 else "CAN'T" )
#print(  bool(8%2 ))


#print cadena.center(50, "=")
#import re
#n = "N-1=2"
#p = re.split('\+|\-|\=' , n)
#
#print(p)>>>['N', '1', '2']
##de list a String
#print( ','.join(p).replace(',', ''))>>>N12


#from functools import reduce
#n = list( input(  ) )
#n = reduce( lambda ord(a),ord(b) : a+b , n)
#print( n )
#print( int( reduce( lambda  a,b : a+b , map( lambda x : ord( x ) , n ) ) / len( n ) ) )
#print(n)
#n = reduce( lambda a,b : ord(a) + ord(b) , n )


#print( len( filter( lambda num: "1" in str( num ) , list( range( 1 ,10000 ) ) ) ) )

#vec = ['h', 'o', 'l', 'a']
#prueba = "hZZZozzzlzzzza hadasdsaodsadsaldsadsadsaa "
#it=0
#cont=0
#for i in prueba:
#
#    if( it==3 ):
#        it=0
#        cont+=1
#    if( vec[it] == i ):
#        it+=1
#print(cont)



################################

x, y, z = "Orange", "Banana", "Cherry"

################################

x = "awesome"

def myfunc():
    x = "fantastic"
    print("Python is " + x)

myfunc()
print("Python is " + x)


################################
x = str("Hello World")	#str
x = int(20)             #int
x = float(20.5)	        #float
x = complex(1j)	        #complex
x = list(("apple", "banana", "cherry"))	    #list
x = tuple(("apple", "banana", "cherry"))	#tuple
x = range(6)	        #range
x = dict(name="John", age=36)	            #dict
x = set(("apple", "banana", "cherry"))	    #set
x = frozenset(("apple", "banana", "cherry"))#frozenset
x = bool(5)	            #bool
x = bytes(5)	        #bytes
x = bytearray(5)	    #bytearray
x = memoryview(bytes(5))
################################

import random
# for i in range(10):
# print(random.randrange(10, 12))

################################

txt = "The best things in life are free!"
print("free" in txt)

txt = "The best things in life are free!"
print("expensive" not in txt)

################################

a = "Hello, World!"
print(a.upper())

a = "Hello, World!"
print(a.lower())

a = " Hello, World! "
print(a.strip()) # returns "Hello, World!"

a = "Hello, World!"
print(a.replace("H", "J"))

a = "Hello, World!"
print(a.split(",")) # returns ['Hello', ' World!']

age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

#caracte de escape
cad = "We are the so-called \"Vikings\" from the north."

################################
# capitalize()	Converts the first character to upper case
print("hola".capitalize()) #Returns Hola

# casefold()	Converts string into lower case
print( "HoLa como".casefold() ) #Returns hola como

# center()	Returns a centered string
print( "hola".center(30,"=") ) #Returns =============hola=============

# count()	Returns the number of times a specified value occurs in a string
txt = "I love apples, apple are my favorite fruit"
x = txt.count("apple", 10, 20)
print(x)

# encode()	Returns an encoded version of the string

#endswith() Devuelve verdadero si la cadena termina con el valor especificado
txt = "Hello, welcome to my world."
x = txt.endswith("my world.")
print(x)#Returns True
x = txt.endswith("my world.", 5, 11)
print(x)#Returns False


# expandtabs()Establece el tamaño de las pestanias
txt = "H\te\tl\tl\to"
x =  txt.expandtabs(3)
print(x)

# find() Busca en la cadena un valor especificado y devuelve la posición de donde se encontr
txt = "Hello, welcome to my world."
print(txt.find("welcome"))
x = txt.find("me", 5, 10)
print(x) #Returns -1 por que no lo encontro


# format()	Formats specified values in a string
txt1 = "My name is {fname}, I'm {age}".format(fname = "John", age = 36)

txt = "We have {:<8} chickens."
print(txt.format(49))#We have 49       chickens.

txt = "We have {:>8} chickens."
print(txt.format(49))#We have       49 chickens.

txt = "We have {:^8} chickens."
print(txt.format(49))#We have    49    chickens.

txt = "The temperature is {:=8} degrees celsius."
print(txt.format(-3325))#The temperature is -   3325 degrees celsius.

txt = "The temperature is between {:+} and {:+} degrees celsius."
print(txt.format(-2, 7))#The temperature is between -3 and +7 degrees celsius.

txt = "The universe is {:,} years old."
print(txt.format(1380000000))#The universe is 1,380,000,000 years old.

txt = "The binary version of {0} is {0:b}"
print(txt.format(10))#The binary version of 10 is 1010

txt = "We have {:d} chickens."
print(txt.format(0b101))#We have 5 chickens.

txt = "The price is {:f} dollars."
print(txt.format(45))#The price is 45.000000 dollars.

txt = "The Hexadecimal version of {0} is {0:X}"
print(txt.format(255))#The Hexadecimal version of 255 is FF

txt = "The octal version of {0} is {0:o}"
print(txt.format(10))#The octal version of 10 is 12

txt = "You scored {:.0%}"
print(txt.format(0.25))#You scored 25%

# index()	Searches the string for a specified value and returns the position of where it was found
#lo mismo que find


# isalnum()	Returns True if all characters in the string are alphanumeric
txt = "Company 12"
x = txt.isalnum()
print(x)#False

txt = "Company12"
x = txt.isalnum()
print(x)#True


# isalpha()	Returns True if all characters in the string are in the alphabet

txt = "CompanyX"
x = txt.isalpha()
print(x)#True


txt = "Company10"
x = txt.isalpha()
print(x)#False

# isdecimal()	Returns True if all characters in the string are decimals
a = "\u0030" #unicode for 0
b = "\u0047" #unicode for G

print(a.isdecimal())#True
print(b.isdecimal())#False

# isdigit()	Returns True if all characters in the string are digits
txt = "50800"
x = txt.isdigit()
print(x)#True

# isidentifier()	Returns True if the string is an identifier

# islower()	Returns True if all characters in the string are lower case
c = "mynameisPeter"
print(c.islower())#False

# isnumeric()	Returns True if all characters in the string are numeric
e = "1.5"
print(e.isnumeric())#False

# isprintable()	Returns True if all characters in the string are printable

# isspace()	Returns True if all characters in the string are whitespaces
txt = "   "
x = txt.isspace()
print(x)#True

# istitle()	Returns True if the string follows the rules of a title
a = "HELLO, AND WELCOME TO MY WORLD"
b = "Hello Como Estas" #Formato title
print(a.istitle())#False
print(b.istitle())#True

# isupper()	Returns True if all characters in the string are upper case
txt = "THIS IS NOW!"
x = txt.isupper()
print(x)#True

# join()	Joins the elements of an iterable to the end of the string
mytuple = ("john", "peter", "vicky")
x = "#".join(mytuple)
print(x)#john#peter#vicky


myDict = {"name": "John", "country": "Norway"}
mySeparator = "TEST"
x = mySeparator.join(myDict)
print(x)#nameTESTcountry


myArray = [ "john", "peter", "vicky" ]
x = "#".join(myArray)
print(x)#john#peter#vicky


# ljust()	Returns a left justified version of the string
txt = "banana"
x = txt.ljust(20, "O")
print(x, "is my favorite fruit.")#bananaOOOOOOOOOOOOOO is my favorite fruit.

# lstrip()	Returns a left trim version of the string
txt = ",,,,,ssaaww.....banana"
x = txt.lstrip("a,sw.")
print(x)#banana

# lower()	Converts a string into lower case



# maketrans()	Returns a translation table to be used in translations
txt = "Hi Sam!"
x = "mSa"
y = "eJo"
mytable = txt.maketrans(x, y)
print(txt.translate(mytable))#Hi Joe!

# partition()	Returns a tuple where the string is parted into three parts
txt = "I could eat bananas all day"
x = txt.partition("bananas")
print(x)#('I could eat ', 'bananas', ' all day')

# replace()	Returns a string where a specified value is replaced with a specified value
txt = "one one was a race horse, two two was one too."
x = txt.replace("one", "three", 2)
print(x)#three three was a race horse, two two was one too."

# rfind()	Searches the string for a specified value and returns the last position of where it was found
# string.rfind(value, start, end)
txt = "Hello, welcome to my world."
x = txt.rfind("e", 5, 10)
print(x)#8

# rindex()	Searches the string for a specified value and returns the last position of where it was found
txt = "Mi casa, su casa."
x = txt.rindex("casa")
print(x)#12

# rjust()	Returns a right justified version of the string
txt = "banana"
x = txt.rjust(20, "O")
print(x)#OOOOOOOOOOOOOObanana

# rsplit()	Splits the string at the specified separator, and returns a list
txt = "apple, banana, cherry, Orange, Fruty"
# setting the maxsplit parameter to 1, will return a list with 2 elements!
x = txt.rsplit(", ", 2)
print(x)# ['apple, banana, cherry', 'Orange', 'Fruty']

# rstrip()	Returns a right trim version of the string
txt = "banana,,,,,ssqqqww....."
x = txt.rstrip(",.qsw")
print(x)#banana

# split()	Splits the string at the specified separator, and returns a list
txt = "apple#banana#cherry#orange"
# setting the maxsplit parameter to 1, will return a list with 2 elements!
x = txt.split("#", 1)
print(x)#['apple', 'banana#cherry#orange']

# splitlines()	Splits the string at line breaks and returns a list

# startswith()	Returns true if the string starts with the specified value
txt = "Hello, welcome to my world."
x = txt.startswith("Hello")
print(x)#True

# strip()	Returns a trimmed version of the string
txt = ",,,,,rrttgg.....banana....rrr"
x = txt.strip(",.grt")
print(x)#banana

# swapcase()	Swaps cases, lower case becomes upper case and vice versa
txt = "Hello My Name Is PETER"
x = txt.swapcase()
print(x)#hELLO mY nAME iS peter

# title()	Converts the first character of each word to upper case
txt = "Welcome to my world"
x = txt.title()
print(x)# Welcome To My World

# translate()	Returns a translated string
mydict = {83:  80}
txt = "Hello Sam!"
print(txt.translate(mydict))#Hello Pam!

# upper()	Converts a string into upper case
txt = "Hello my friends"
x = txt.upper()
print(x)#HELLO MY FRIENDS

# zfill()	Fills the string with a specified number of 0 values at the beginning
txt = "50"
x = txt.zfill(10)
print(x)#0000000050
# ==============================Boleanos
#Todo da False
bool(False) #
bool(None)
bool(0)
bool("")
bool(())
bool([])
bool({})

print(15//7)#7

# LIST es una colección ordenada y modificable. Permite miembros duplicados.
# TUPLE es una colección ordenada e inmutable. Permite miembros duplicados.
# SET es una colección que no está ordenada ni indexada. No hay miembros duplicados.
# DICTIONARY es una colección desordenada y modificable. No hay miembros duplicados.

thislist = ["apple", "banana", "cherry"]
if "apple" in thislist:
    print("Yes, 'apple' is in the fruits list")#True

thislist = ["apple", "banana", "cherry"]
thislist[1:2] = ["blackcurrant", "watermelon"]
print(thislist)#['apple', 'blackcurrant', 'watermelon', 'cherry']


thislist = ["apple", "banana", "cherry"]
thislist.insert(2, "watermelon")
print(thislist)#['apple', 'banana', 'watermelon', 'cherry']

thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)#['apple', 'banana', 'cherry', 'orange']

thislist = ["apple", "banana", "cherry"]
thistuple = ("mango", "pineapple", "papaya")
thislist.extend(thistuple)
print(thislist)#['apple', 'banana', 'cherry', 'mango', 'pineapple', 'papaya']

thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")
print(thislist)#['apple', 'cherry']

thislist = ["apple", "banana", "cherry"]
thislist.pop(1)#Sin parametro borra el ultimo
print(thislist)#['apple', 'cherry']

thislist = ["apple", "banana", "cherry"]
del thislist[0]
print(thislist)#['banana', 'cherry']


thislist = ["apple", "banana", "cherry"]
thislist.clear()
print(thislist)#[]


thislist = ["apple", "banana", "cherry"]
[print(x) for x in thislist]
# apple
# banana
# cherry


fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
newlist = [x.upper() for x in fruits if "a" in x]
print(newlist)# ['APPLE', 'BANANA', 'MANGO']

newlist = [x for x in range(10) if x%2==0]
print(newlist)


#ordena la lista segun lo serca que este de 50
def myfunc(n):
    return abs(n - 50)

thislist = [100, 50, 65, 82, 23]
thislist.sort(key = myfunc)
print(thislist)#[50, 65, 23, 82, 100]

# thislist.sort(reverse = True)
# thislist.sort(key = str.lower)

thislist = ["banana", "Orange", "Kiwi", "cherry"]
thislist.reverse()
print(thislist)#['cherry', 'Kiwi', 'Orange', 'banana']

thislist = ["apple", "banana", "cherry", "banana"]
mylist = thislist.copy()
print(mylist)#["apple", "banana", "cherry"]

# append()    #Adds an element at the end of the list
# clear()     #Removes all the elements from the list
# copy()  	  #Returns a copy of the list
# count()	  #Returns the number of elements with the specified value
# extend()    #Add the elements of a list (or any iterable), to the end of the current list
# index()	  #Returns the index of the first element with the specified value
# insert()    #Adds an element at the specified position
# pop()   	  #Removes the element at the specified position
# remove()    #Removes the item with the specified value
# reverse()   #Reverses the order of the list
# sort()	  #Sorts the list


# ===================== Tupplas
fruits = ("apple", "banana", "cherry", "strawberry", "raspberry")
(green, yellow, *red) = fruits
print(green)#apple
print(yellow)#banana
print(red)#['cherry', 'strawberry', 'raspberry']


fruits = ("apple", "banana", "cherry")
mytuple = fruits * 2
print(mytuple)#('apple', 'banana', 'cherry', 'apple', 'banana', 'cherry')



thistuple = (1, 3, 7, 8, 7, 5, 4, 6, 8, 5)
x = thistuple.count(5)
print(x)#2


thistuple = (1, 3, 7, 8, 7, 5, 4, 6, 8, 5)
x = thistuple.index(8)
print(x)#3

# ====================== Conjuntos
# Los elementos del conjunto están desordenados, no se pueden cambiar
# y no permiten valores duplicados
# Los conjuntos no se pueden cambiar, lo que significa que no podemos
# cambiar los elementos una vez creado el conjunto.
# Una vez que se crea un conjunto, no puede cambiar sus elementos, pero puede agregar elementos nuevos.
# No se permiten duplicados

thisset = {"apple", "banana", "cherry", "apple"}
print(thisset)#{'banana', 'cherry', 'apple'}

thisset = set(("apple", "banana", "cherry")) # note the double round-brackets
print(thisset)

# Una vez que se crea un conjunto, no puede cambiar sus elementos, pero puede agregar elementos nuevos.
thisset = {"apple", "banana", "cherry"}
thisset.add("orange")
print(thisset)#{'orange', 'cherry', 'banana', 'apple'}


thisset = {"apple", "banana", "cherry"}
tropical = {"pineapple", "mango", "papaya"} #Con list es lo mismo
thisset.update(tropical)
print(thisset)#{'apple', 'mango', 'cherry', 'pineapple', 'banana', 'papaya'}


thisset = {"apple", "banana", "cherry"}
thisset.remove("banana")
print(thisset)# {'cherry', 'apple'}

thisset = {"apple", "banana", "cherry"}
x = thisset.pop()
print(x) #removed item banana como es desordenado no se sabe cual elimina
print(thisset) #the set after removal {'cherry', 'apple'}



# ====================== Conjuntos
# Un conjunto es una colección que está desordenada y no indexada .
# Los conjuntos se escriben con llaves.

set1 = {"a", "b" , "c"}
set2 = {1, 2, 3 , "a"}
set3 = set1.union(set2)
print(set3)# {1, 'a', 3, 2, 'c', 'b'}


set1 = {"a", "b" , "c"}
set2 = {1, 2, 3}
set1.update(set2) #El método update () inserta los elementos de set2 en set1:
print(set1)#{'b', 'a', 1, 2, 'c', 3}

x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
x.intersection_update(y)
print(x)#{'apple'}


x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
z = x.intersection(y)
print(z)#{'apple'}


# Conserve los elementos que no están presentes en ambos conjuntos:
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple", "banana"}
x.symmetric_difference_update(y)
print(x)# {'microsoft', 'cherry', 'google'}

x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
z = x.symmetric_difference(y)
print(z)#{'google', 'banana', 'microsoft', 'cherry'}


conj = { 1, "Hola", "mundo", 12, 10}
# add()  Agrega un elemento al conjunto
conj.add("add")
print(conj)

# clear()Elimina todos los elementos del conjunto

# copy() Devuelve una copia del conjunto

# difference()Devuelve un conjunto que contiene la diferencia
# entre dos o más conjuntos.

# difference_update()Elimina los elementos de este conjunto
# que también están incluidos en otro conjunto especificado

# discard() Eliminar el elemento especificado
conj.discard("elemento a liminar de conj")


# intersection() Devuelve un conjunto, que es la
# intersección de otros dos conjuntos
x = {"apple", "banana", "cherry", "peter"}
y = {"google", "microsoft", "apple" , "peter"}
z = x.intersection(y)
print(z)# {'apple', 'peter'}


# intersection_update() Elimina los elementos de este conjunto
# que no están presentes en otros conjuntos especificados
# set.intersection_update(set1, set2 ... etc)

# isdisjoint() Devuelve True si no hay elementos en el

# set.isdisjoint(set)

# issubset() Devuelve Verdadero si todos los elementos
# del conjunto x están presentes en el conjunto y:

# issuperset()
x = {"a", "b", "c"}
y = {"f", "e", "d", "c", "b", "a"}
z = x.issubset(y)
print(z)#True

# pop()Eliminar un elemento aleatorio del conjunto:
fruits = {"apple", "banana", "cherry"}
fruits.pop()
print(fruits)#{'banana', 'cherry'}

fruits = {"apple", "banana", "cherry"}
x = fruits.pop()
print(x)#Devuelve el elemento eliminado

# remove()Remove "banana" from the set
# set.remove(item)
fruits = {"apple", "banana", "cherry"}
fruits.remove("banana")
print(fruits)#{'apple', 'cherry'}

# symmetric_difference() Devuelve un conjunto con las
# diferencias simétricas de dos conjuntos.

# symmetric_difference_update() inserta las diferencias
# simétricas de este conjunto y otro
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
x.symmetric_difference_update(y)
print(x)#{'microsoft', 'banana', 'google', 'cherry'}

# union()
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
z = x.union(y)
print(z)#{'microsoft', 'cherry', 'google', 'banana', 'apple'}

# update() Inserte los elementos del conjunto y en el conjunto x:
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
x.update(y)
print(x)# {'google', 'apple', 'cherry', 'microsoft', 'banana'}


# =============================== Diccionario
# Un diccionario es una colección ordenada
# modificable y que no admite duplicados.
# A partir de la versión 3.7 de Python, los diccionarios están ordenados
# En Python 3.6 y versiones anteriores, los diccionarios están desordenados .

# List es una colección ordenada y modificable. Permite miembros duplicados.
# Tuple es una colección ordenada e inmutable. Permite miembros duplicados.
# Set es una colección desordenada y no indexada. No hay miembros duplicados.
# Dictionary es una colección desordenada y modificable. No hay miembros duplicados.

thisdict = {
    "brand": "Ford",
    "electric": False,
    "year": 1964,
    "colors": ["red", "white"]
}

# Imprima el número de elementos en el diccionario
print(len(thisdict))

#Sacar Obtenga el valor de la clave "brand"
x = thisdict["brand"]
print(x)#Ford
x = thisdict.get("brand")
print(x)#Ford


# Obtenga una lista de las claves
x = thisdict.keys()
print(x)# dict_keys(['brand', 'electric', 'year', 'colors'])

# Agregue un nuevo elemento al diccionario original
thisdict["model"] = "Mustang"
print(x)#dict_keys(['brand', 'electric', 'year', 'colors', 'model'])

# Obtenga una lista de los valores:
x = thisdict.values()
print(x)#dict_values(['Ford', False, 1964, ['red', 'white'], 'Mustang'])

thisdict["year"] = "2020"
print(x)# dict_values(['Ford', False, '2020', ['red', 'white'], 'Mustang'])

# Obtenga una lista de los pares clave: valor
x = thisdict.items()
print(x)

# Comprueba que modelo se encuentra en thisdict
if "model" in thisdict:
    print("Si se encuentra en thisdict")

# Actualice el "año" del automóvil mediante el update() método:
thisdict.update({"year":2021})
print(thisdict)
# {'brand': 'Ford', 'electric': False, 'year': 2021,
# 'colors': ['red', 'white'], 'model': 'Mustang'}

# Agregue un elemento de color al diccionario mediante el update() método:
thisdict.update({"Dueño":"Peter"})
print(thisdict)
# {'brand': 'Ford', 'electric': False, 'year': 2021, 'colors': ['red', 'white'],
# 'model': 'Mustang', 'Dueño': 'Peter'}

# El pop()método elimina el elemento con el nombre de clave especificado:
thisdict.pop("Dueño")
print(thisdict)
# {'brand': 'Ford', 'electric': False, 'year': 2021,
# 'colors': ['red', 'white'], 'model': 'Mustang'}

# tambien del podria eliminar el diccionario completo
del thisdict["model"]
print(thisdict)
# {'brand': 'Ford', 'electric': False, 'year': 2021, 'colors': ['red', 'white']}

# El clear()método vacía el diccionario:
# thisdict.clear()
print(thisdict)#{}

# imprimir todas las claves de un diccionario
for x in thisdict.keys():
    print(x)
# brand
# electric
# year
# colors

# for it in thisdict:
# print(it)
# brand
# electric
# year
# colors

# imprime valores de un diccionario
for it in thisdict.values():
    print(it)
# Ford
# False
# 2021
# ['red', 'white']

# for it in thisdict:
# print(thisdict[it])
# Ford
# False
# 2021
# ['red', 'white']

# imprimir clave valor con for
for x , y in thisdict.items():
    print(x, y)
# brand Ford
# electric False
# year 2021
# colors ['red', 'white']

# copiar un diccionario
mydict = thisdict.copy()
mydict = dict(thisdict)
print(mydict)

# diccionario anidados
myfamily = {
    "child1" : {
        "name" : "Emil",
        "year" : 2004
    },
    "child2" : {
        "name" : "Tobias",
        "year" : 2007
    },
    "child3" : {
        "name" : "Linus",
        "year" : 2011
    }
}

print(myfamily)
# {'child1': {'name': 'Emil', 'year': 2004},
 # 'child2': {'name': 'Tobias', 'year': 2007},
 # 'child3': {'name': 'Linus', 'year': 2011}}

# anidar diccionarios
child1 = {
    "name" : "Emil",
    "year" : 2004
}
child2 = {
    "name" : "Tobias",
    "year" : 2007
}
child3 = {
    "name" : "Linus",
    "year" : 2011
}

myfamily = {
    "child1" : child1,
    "child2" : child2,
    "child3" : child3
}

print(myfamily)
# {'child1': {'name': 'Emil', 'year': 2004},
 # 'child2': {'name': 'Tobias', 'year': 2007},
 # 'child3': {'name': 'Linus', 'year': 2011}}

# clear()	Removes all the elements from the dictionary
# copy()	Returns a copy of the dictionary

# fromkeys()	Returns a dictionary with the specified keys and value
prueba = dict.fromkeys(thisdict, "hola")
print(prueba)
# {'brand': 'hola', 'electric': 'hola', 'year': 'hola', 'colors': 'hola'}

# get()	Devuelve una lista que contiene una tupla para cada par clave-valor
# items()	Returns a list containing a tuple for each key value pair
# keys()	Returns a list containing the dictionary's keys
# pop()	Removes the element with the specified key
# popitem()	Removes the last inserted key-value pair
# setdefault()	Devuelve el valor de la clave especificada. Si la clave no existe: inserte la clave, con el valor especificado
# update()	Updates the dictionary with the specified key-value pairs
# values()	Returns a list of all the values in the dictionary



#Miselanea
# print("A") if a > b else print("=") if a == b else print("B") #=
# if b > a:
  # pass

# for x in "banana":
  # if x == "a":
    # continue
  # print(x)

for x in range(2, 15, 3):
    print("{} ".format(x) , end="")#2 5 8 11 14
else:
    print("\nFinal for" ) # Si el bucle se rompe, el bloque else no se ejecuta.


#=============Funciones================
# Si se desconoce el número de argumentos, agregue un *antes del nombre del parámetro
def my_function(*kids):
  print("The youngest child is " + kids[2])
my_function("Emil", "Tobias", "Linus") #The youngest child is Linus

# También puede enviar argumentos con la sintaxis clave = valor .
# De esta forma no importa el orden de los argumentos.
def my_function(child3, child2, child1):
  print("The youngest child is " + child3)
my_function(child1 = "Emil", child2 = "Tobias", child3 = "Linus")

# Si se desconoce el número de argumentos de palabras clave,
# agregue un doble **antes del nombre del parámetro
def my_function(**kid):
  print("His last name is " + kid["lname"])
my_function(fname = "Peter", lname = "Alvarez")

# valor predeterminada de una funccion
def my_function(country = "Norway"):
  print("I am from " + country)
my_function("Sweden")#I am from Sweden
my_function("India")
my_function()#I am from Norway
my_function("Brazil")


#=============== funciones lambda==============00

print( (lambda x: x + 2)(2)) # 4

x=lambda a, b: a+10+b
print(x(10 , 5)) # 25

li=[1,2,4,-4]
lo=[3,4,-2,4]

print( list(map(lambda x,y: x+y , li,lo) ) )#[4, 6, 2, 0]

def myfunc(n):
  return lambda a : a * n
mytripler = myfunc(2)
print(mytripler(21))#42

#================Objetos=============
class MyClass:
  x = 5
p1 = MyClass()
print(p1.x)#5

# Cree una clase llamada Persona, use la función __init __ ()
# para asignar valores para el nombre y la edad:
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
# Nota: La función __init __ () se llama automáticamente
# cada vez que se usa la clase para crear un nuevo objeto.
    def myfunc(self):
        print("Hola mi nombre es " + self.name)
    # Nota: El parámetro self es una referencia a la instancia actual de
    # la clase y se usa para acceder a las variables que pertenecen a la clase
p1 = Person("John", 36)
p2 = Person("Peter", 24)
print(p1.name, p1.age)# John 36
print(p2.name, p2.age)# Peter 24
p1.myfunc()#Hola mi nombre es John
p2.myfunc()#Hola mi nombre es Peter

# Modificando age
p1.age = 40
print(p1.name, p1.age)# John 40

# eliminando age
# del p1.age
# del p1

# class Person:
  # pass

#==============Herencia====================
# Cuando agrega la función __init __ (), la clase secundaria
# ya no heredará la función __init __ () del padre.

# Nota: La __init__() función del hijo anula
# la herencia de la __init__()función del padre .

# Para mantener la herencia de la __init__() función del padre ,
 # agregue una llamada a la __init__()función del padre :

class Person:
    def __init__(self, fname, lname):
        self.firstname = fname
        self.lastname = lname

    def printname(self):
        print(self.firstname, self.lastname)

class Student(Person):
    def __init__(self, fname, lname, year):
        super().__init__(fname, lname)
        self.graduationyear = year

    def welcome(self):
        print("Welcome", self.firstname, self.lastname, "to the class of", self.graduationyear)
        # Welcome Mike Olsen to the class of 2019

x = Student("Mike", "Olsen", 2019)
x.welcome()


#=================Iterator===============
mytuple = ("apple", "banana", "cherry")
myit = iter(mytuple)

print(next(myit))#apple
print(next(myit))#banana
print(next(myit))#cherry



#=================Global===============

# def myfunc():
    # global x
    # x = "fantastic"
# myfunc()
# print("Python is " + x)


x = "awesome"
def myfunc():
    global x #sobre escribe la variable arriba
    x = "fantastic"
myfunc()
print("Python is " + x)

#importado desde el archivo mymodule
import mymodule
mymodule.greeting("Peter")#Hello Peter
a = mymodule.person1["age"]
print(a)

# renombrar un modulo con as
import mymodule as mx
a = mx.person1["age"]
print(a)

import platform
x = platform.system()
print(x)#Linux

# Enumera todos los nombres de funciones (o nombres de variables)
# en un módulo. La función dir ()
import platform
x = dir(platform)
print(x)

#Puede elegir importar solo partes de un módulo, utilizando la palabra clave from
from mymodule import person1
print(person1["name"])#John

import datetime
x = datetime.datetime.now()
print(x)

print(x.year)
print(x.strftime("%A"))
print(x.day)

import datetime
x = datetime.datetime(2020, 5, 17)
# x = datetime.datetime(year, month, day)
print(x)

#================ math ================
x = min(5, 10, 25)
y = max(5, 10, 25)
print(x)#5
print(y)#25

x = abs(-7.25)
print(x)#7.25

x = pow(4, 3)
print(x)#64

import math
x = math.sqrt(64)
print(x)#8

x = math.ceil(1.4)
y = math.floor(1.4)

print(x) # returns 2
print(y) # returns 1

x = math.pi
print(x)#3.141592653589793

#===================== Expreciones Regulares========
#libreria para trabajar con expresiones regulares
import re
# lab = [int(item) for item in input().split(sep=None)]
######## Metacaracteres
# [] Un conjunto de personajes
txt = "The rain in Spain"
# Busque todos los caracteres en minúscula alfabéticamente entre "a" y "m":
x = re.findall("[a-z]", txt)#solo saca las minusculas
print(x)

# / Señala una secuencia especial
# también se puede usar para escapar de caracteres especiales
txt = "That 12 will be 59 dolla12r1s"
#Encuentra todos los caracteres de dígitos
x = re.findall("\d", txt)
print(x)#['1', '2', '5', '9', '1', '2', '1']

# . Cualquier carácter (excepto el carácter de nueva línea)
txt = "hello world"
#Busque una secuencia que comience con "he",
# seguida de dos (cualquiera) caracteres y una "o":
x = re.findall("he..o.w", txt)#['hello w']
print(x)

# ^  Empieza con
txt = "hello world"
#Compruebe si la cadena comienza con 'hola':
x = re.findall("^hello", txt)
print(x)
print("Si,comienza con 'hello'") if x else print("No match")#Yes

# $ Termina con
txt = "hello world"
# Compruebe si la cadena termina con 'mundo':
x = re.findall("ld$", txt)
print("Si, termina con 'world'") if x else print("No match")#Yes

# * Cero o más ocurrencias
txt = "The rain in Spain falls mainly in the plain!"
#Compruebe si la cadena contiene "ai" seguida de 0 o más caracteres "x"
x = re.findall("inx*", txt)
print(x)#['in', 'in', 'in', 'in', 'in', 'in']

# + Una o más ocurrencias
txt = "The rain in Spain falls mainly in the plain!"
#Compruebe si la cadena contiene "ai" seguida de 1 o más caracteres "x":
x = re.findall("n +", txt)
print(x)#['n ', 'n ', 'n ', 'n ']

# {} Exactamente el número especificado de ocurrencias
txt = "The rain in Spain falls mainly in the plain!"
# Compruebe si la cadena contiene "a" seguida de exactamente dos caracteres "l":
x = re.findall("al{2}", txt)
print(x)#['all']

txt = "The rain in Spain stays mainly in the plain!"
# Compruebe si la cadena contiene "falls" o "stays":
x = re.findall("falls|stays", txt)
print(x)#['stays']


#============== Secuencias especiales ===============
# Una secuencia especial es una \ seguida de uno de los caracteres
# de la lista siguiente y tiene un significado especial:

# \ A Devuelve una coincidencia si los caracteres especificados están
# al principio de la cadena
txt = "The rain in Spain"
#Compruebe si la cadena comienza con "The":
x = re.findall("\AThe", txt)
print(x)#['The']

#\b Devuelve una coincidencia en la que los caracteres especificados
# están al principio o al final de una palabra.
# (la "r" al principio se asegura de q la cadena se trate como una "cadena sin formato")
txt = "The bain in Spain"
#Compruebe si "ain" está presente al principio de una PALABRA:
x = re.findall(r"\bain", txt)
print(x)#[]
#Compruebe si "ain" está presente al final de una PALABRA:
x = re.findall(r"ain\b", txt)
print(x)#['ain', 'ain']

# \B Devuelve una coincidencia en la que están presentes los caracteres
# especificados, pero NO al principio (o al final) de una palabra
# (la "r" al principio se asegura de que la cadena se trate como una "cadena sin formato")
txt = "The rain in Spain"
#Compruebe si "ain" está presente, pero NO al principio de una palabra:
x = re.findall(r"\Bain", txt)
print(x)#['ain', 'ain']
#Compruebe si "ain" está presente, pero NO al final de una palabra:
x = re.findall(r"ain\B", txt)
print(x)#[]

# \d Devuelve una coincidencia donde la cadena contiene dígitos (números del 0 al 9)
txt = "The r12ain in Spain"
#Compruebe si la cadena contiene dígitos (números del 0 al 9):
x = re.findall("\d", txt)
print(x)#['1', '2']

# \D Devuelve una coincidencia donde la cadena NO contiene dígitos
txt = "Rain in Spain"
# Devuelve una coincidencia en cada carácter sin dígitos:
x = re.findall("\D", txt)
print(x)#['R', 'a', 'i', 'n', ' ', 'i', 'n', ' ', 'S', 'p', 'a', 'i', 'n']

# \s Devuelve una coincidencia donde la cadena contiene un
# carácter de espacio en blanco
txt = "The rain in Spain"
# Devuelve una coincidencia en cada carácter de espacio en blanco:
x = re.findall("\s", txt)
print(x)#[' ', ' ', ' ']

# \S Devuelve una coincidencia donde la cadena NO contiene
# un carácter de espacio en blanco
txt = "The rain in Spain"
#Return una coincidencia en cada carácter que NO sea un espacio en blanco:
x = re.findall("\S", txt)
print(x)#['T', 'h', 'e', 'r', 'a', 'i', 'n', 'i', 'n', 'S', 'p', 'a', 'i', 'n']

# \w Devuelve una coincidencia donde la cadena contiene cualquier carácter de palabra
# (caracteres de la A a la Z, dígitos del 0 al 9 y el carácter de subrayado _)

txt = "Th3 ra1n _ i.n"
# Devuelva una coincidencia en cada carácter de palabra
# (caracteres de la A a la Z, dígitos del 0 al 9 y el carácter de subrayado _):
x = re.findall("\w", txt)
print(x)#['T', 'h', '3', 'r', 'a', '1', 'n', '_', 'i', 'n' ]

# \ W Devuelve una coincidencia donde la cadena NO contiene
# ningún carácter de palabra
txt = "The! rain in Spain?"
# Devuelva una coincidencia en cada carácter que NO sea una palabra
# (caracteres que NO estén entre la a y la Z. Como "!", "?" Espacio en blanco, etc.):
x = re.findall("\W", txt)
print(x)#['!', ' ', ' ', ' ', '?']

# \z devuelve una coincidencia si los caracteres especificados
# están al final de la cadena
txt = "The rain in Spain"
#compruebe si la cadena termina con "españa"
x = re.findall("Spain\Z", txt)
print(x)#['Spain']


#=============Conjuntos=============
# Un conjunto es un conjunto de caracteres dentro de un par de
# corchetes [] con un significado especial:

# [arn] Devuelve una coincidencia en la que está presente uno de
# los caracteres especificados (a, r o n)
txt = "The rain in Spain"
#Compruebe si la cadena tiene caracteres a, r o n:
x = re.findall("[anr]", txt)
print(x)#['r', 'a', 'n', 'n', 'a', 'n']

# [a-n] Devuelve una coincidencia para cualquier carácter
# en minúscula, alfabéticamente entre a y n
txt = "The rain in Spain"
#Compruebe si la cadena tiene caracteres entre ayn:
# x = re.findall("[0-9]", txt)saca numeros del 0 al 9
x = re.findall("[a-n]", txt)
print(x)#['h', 'e', 'a', 'i', 'n', 'i', 'n', 'a', 'i', 'n']


# [^ arn] Devuelve una coincidencia para cualquier carácter EXCEPTO a, r y n
txt = "The rain in Spain"
#Compruebe si la cadena tiene otros caracteres además de a, r o n:
x = re.findall("[^arn]", txt)
print(x)#['T', 'h', 'e', ' ', 'i', ' ', 'i', ' ', 'S', 'p', 'i']

# Devuelve una coincidencia donde está presente cualquiera de
# los dígitos especificados (0, 1, 2 o 3)
txt = "Th1e3 rain in Spai998989n"
#Compruebe si la cadena tiene 0, 1, 2 o 3 dígitos:
x = re.findall("[0123]", txt)
print(x)# ['1', '3']

# [0-5] [0-9] Devuelve una coincidencia para cualquier
# número de dos dígitos entre 00 y 59
txt = "8 times before 11:45 AM"
# Compruebe si la cadena tiene números de dos dígitos, del 00 al 59
x = re.findall("[0-5][0-9]", txt)
print(x)#['11', '45']

# [a-zA-Z] Devuelve una coincidencia para cualquier carácter
# alfabéticamente entre a y z, minúsculas O mayúsculas
txt = "8 times before 11:45 AM"
#Compruebe si la cadena tiene caracteres de la A a la Z en
# minúsculas y de la A a la Z en mayúsculas:
x = re.findall("[a-zA-Z]", txt)
print(x)#['t', 'i', 'm', 'e', 's', 'b', 'e', 'f', 'o', 'r', 'e', 'A', 'M']


# [+] En conjuntos, +, *,., |, (), $, {} No tiene un significado especial,
# por lo que [+] significa: devuelve una coincidencia para cualquier
# carácter + en la cadena
txt = "8 times before 11:45 AM+"
#Compruebe si la cadena tiene caracteres +:
x = re.findall("[+M]", txt)
print(x)#['M', '+']


#########The findall() Function
# La función findall () devuelve una lista que contiene todas las coincidencias.
#Return a list containing every occurrence of "ai":
txt = "The rain in Spain"
x = re.findall("ai", txt)
print(x)#['ai', 'ai']
#Compruebe si "Portugal" está en la cadena:
txt = "The rain in Portugal"
x = re.findall("Portugal", txt)
print(x)


######### search() Function
# La función search () busca en la cadena una coincidencia
# y devuelve un objeto Match si hay una coincidencia.
# Si hay más de una coincidencia, solo se devolverá
# la primera aparición de la coincidencia:
txt = "The rain in Spain"
x = re.search("in", txt)
print("El primer carácter de 'Sp' se encuentra en la posición:", x.start())#6
#Devuelve Nonse si no encuentra coincidencias


######### split() Function
# La función split () devuelve una lista donde
 # la cadena se ha dividido en cada coincidencia:
# Divida la cadena en cada carácter de espacio en blanco:
txt = "The rain in Spain"
x = re.split("\s", txt)
print(x)# ['The', 'rain', 'in', 'Spain']
# Divida la cadena en el primer carácter de espacio en blanco:
x = re.split("\s", txt, 1)
print(x)#['The', 'rain in Spain']

########## The sub() Function #######
#La función sub () reemplaza las coincidencias con el texto de su elección:
# Reemplace todos los caracteres de espacio en blanco con el dígito "9":
txt = "The rain in Spain"
x = re.sub("\s", "9", txt)

# Puede controlar el número de
# reemplazos especificando el parámetro de recuento:

x = re.sub("\s", "9", txt, 2)
print(x)

########## match object
# .span () devuelve una tupla que contiene las posiciones inicial y final de la coincidencia.
# .string devuelve la cadena pasada a la función
# .group () devuelve la parte de la cadena donde hubo una coincidencia


#.span()
#\b Devuelve una coincidencia en la que los caracteres especificados
# \w Devuelve una coincidencia donde la cadena contiene cualquier carácter de palabra
# x = re.search(r"\bS\w+", txt)#ejemplo valido pero con errores
# (la "r" al principio se asegura de q la cadena se trate como una "cadena sin formato")
txt = "The rain in rn  Spain"
# con w aseguramos que la coincidencia(r) se encuentre al inicio
x = re.search(r"\br\w+", txt)
print(x.span())#(4, 8)
print(x.string)#The rain in Spain
print(x.group())#rain

#·············· Try_except
try:
    print("Hello")
except:
    print("Something went wrong")
else:
    print("Nothing went wrong")
# Hello
# Nothing went wrong

# Para lanzar (o aumentar) una excepción, use la palabra clave raise.
# Genere un error y detenga el programa si x es menor que 0:
x = -1
# if x < 0:
    # raise Exception("Sorry, no numbers below zero")

#·············· Format
# Puede utilizar números de índice (un número dentro de las llaves {0})
# para asegurarse de que los valores se coloquen en los marcadores de posición
# correctos:
diner = 36
name = "Peter"
txt = "Mi nombre es {1}. {1} tengo dinero {0:.2f} Bs"
print(txt.format(age, diner))

myorder = "I have a {carname}, it is a {model}."
print(myorder.format(carname = "Ford", model = "Mustang"))

#············Python como?
#Eliminamos duplicados de una lista y ordenamos
mylist = ["a", "b", "a", "c", "c","b"]
mylist = list(dict.fromkeys(mylist))
print(mylist)# ['a', 'b', 'c']

mylist2 = list(set(mylist))
mylist2.sort()
print(mylist2)# ['a', 'b', 'c']










# yy	copiar la URL de la página actual al portapapeles
# d	desplazarse media página hacia abajo
# u	desplazarse media página hacia arriba
# yy	copiar la URL de la página actual al portapapeles
# d	desplazarse media página hacia abajo
# u	desplazarse media página hacia arriba
# o habre link desde el historial
# O habre link en una nueva ventana desde el historial
# H       go back in history
# L       go forward in history
# yt      duplicate current tab
# x       close current tab
# gu	subir una ruta en la URL
# T buffer
# o HIstorial

# sirven para expresar expresioes regulares

valores = {'A': 4, 'E': 3, 'I': 1, 'O': 0}
for k, v in valores.items():
    print('k=', k, ', v=', v)

# k= A , v= 4
# k= E , v= 3
# k= I , v= 1
# k= O , v= 0

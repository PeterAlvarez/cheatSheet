from xml.etree.ElementTree import parse
import json
import csv


#Archivos
#w sobre escribe el archivo y crea si no lo hay
#r solo lectura
#a continua escribiendo sobre el archivo
def crear_archivo():
                    #Ruta
    archivo = open( 'datos.txt', 'w' )
    archivo.close()

def escribir_archivo():
    archivo = open( "datos.txt", 'a')
    archivo.write( "Juan Perez\n" )
    archivo.write( "79845613\n" )
    archivo.write( "Cancun\n" )
def leer_archivo():
    archivo = open("datos.txt", 'r')
    linea = archivo.readline()
    while linea != '':
        print(linea)
        linea = archivo.readline()
    archivo.close()

# crear_archivo()
# escribir_archivo()
# leer_archivo()
#xml
doc = parse("archivo.xml")
for elemento in doc.findall("nombre"):
    print(elemento.text)

#archivo json
# with open('archivo.json' ) as file:
#     dato = json.load(file)
# print(dato)
# print(dato['nombres'] [0] ['apellido'])

#archivo csv
doc_csv = open("archivo.csv", "w")
csv_data = csv.writer(doc_csv)
lista = ["Jose", 123321]
csv_data.writerow(lista)
doc_csv.close()


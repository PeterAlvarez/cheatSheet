dato = input()
dato2 =input()
print(len(dato), len(dato2))

aux = ""
if(len(dato) < len(dato2)):
    aux = dato
    dato = dato2
    dato2 = aux

print(len(dato), len(dato2))
print("Hola mundo")
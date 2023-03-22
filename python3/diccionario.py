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
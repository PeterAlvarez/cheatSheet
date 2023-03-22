from itertools import permutations

numeros = [ 7 , 1 , 4 , 8 ]
for i in permutations( numeros , 3 ):
    print(i)







# def potencia(c):
    # """Calcula y devuelve el conjunto potencia del
       # conjunto c.
    # """
    # if len(c) == 0:
        # return [[]]
    # r = potencia(c[:-1])
    # return r + [s + [c[-1]] for s in r]
# def imprime_ordenado(c):
    # # """Imprime en la salida estándar todos los
       # # subconjuntos del conjunto c (una lista de
       # # listas) ordenados primero por tamaño y
       # # luego lexicográficamente. Cada subconjunto
       # # se imprime en su propia línea. Los
       # # elementos de los subconjuntos deben ser
       # # comparables entre sí, de otra forma puede
       # # ocurrir un TypeError.
    # # """
    # for e in sorted(c, key=lambda s: (len(s), s)):
        # print(e)
# def combinaciones(c, n):
    # # """Calcula y devuelve una lista con todas las
       # # combinaciones posibles que se pueden hacer
       # # con los elementos contenidos en c tomando n
       # # elementos a la vez.
    # # """
    # return [s for s in potencia(c) if len(s) == n]
# imprime_ordenado( combinaciones(['Juan', 'Maria', 'Lucas', 'David', 'Lucia'], 2))





elem = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

def calcular( out , indice):
    aux=0
    for i in range(len(out)):
        aux += elem.index(out[i]) + indice + i
    return aux

for x in range(int(input())):
    aux=0
    for i in range(int(input())):
        out = input()
        aux += calcular(out,i)
    print(aux)


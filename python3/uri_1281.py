casos = int(input())
for x in range(casos):
    vec=[]
    pro = int(input())
    for i in range(pro):
        aux1, aux2 = map(str, input().split(' '))
        vec.append(aux1)
        vec.append(float(aux2))
    comp = int(input())
    suma = 0
    for i in range(comp):
        aux1, aux2 = map(str, input().split(' '))
        suma += vec[vec.index(aux1)+1]*float(aux2)
    print('R$ {0:.2f}'.format(suma))

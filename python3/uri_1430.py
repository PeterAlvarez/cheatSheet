lista = ['W', 1, 'H', 0.5, 'Q',0.25, 'E', 0.125, 'S', 0.0625, 'T', 0.03125, 'X', 0.015625]
while True:
    cad = input()
    if cad=='*': break
    cad = cad[1:-1].split('/')
    total=0
    for i in cad:
        sum=0
        for j in range(len(i)):
            sum += lista[lista.index(i[j])+1]
        if sum==1:
            total +=1
    print(total)

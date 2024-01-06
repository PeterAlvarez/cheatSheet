while True:
    lista = []
    aux = 0
    aux2 = ""
    con = 0
    dat = int(input())
    if dat == 0:
        break
    cad = input()
    for x in range(len(cad)):
        if (x + 1) % dat == 0:
            lista.append(cad[aux : x + 1])
            aux += dat

    for x in range(len(lista)):
        if x % 2 != 0:
            lista[x] = str(lista[x][::-1])

    for x in range(dat):
        for j in range(len(lista)):
            aux2 += str(lista[j][con])
            con += 1
    print(aux2)

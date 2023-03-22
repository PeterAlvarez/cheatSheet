abc = "abcdefghijklmnopqrstuvwxyz"
for i in range(int(input())):
    cad = list(set(input()))

    c = 0
    for j in cad:
        if j in abc:
            c+=1

    if c == 26:
        print('frase completa')
    elif c > 13:
        print('frase quase completa')
    else:
        print('frase mal elaborada')
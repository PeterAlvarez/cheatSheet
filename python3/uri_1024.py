import math
cad = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
for j in range(int(input())):
    en = input()
    acii = []
    sal = []
    out=''
    for i in range(len(en)):
        if en[i] in cad:
            acii.append(chr(ord(en[i])+3))
        else:
            acii.append(chr(ord(en[i])))

        if i < len(en)/2:
            sal.append(chr(ord(acii[i])-1))
        else:
            sal.append(acii[i])

        out += sal[i]

    print(out[::-1])

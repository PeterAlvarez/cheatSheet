abc = "¿ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for x in range(int(input())):
    out=""
    cad = list(input())
    des = int(input())
    for i in range(len(cad)):
        if( (abc.index(cad[i])-des) > 0 ):
            out += abc[(abc.index(cad[i])-des)]
        else:
            out += abc[26+(abc.index(cad[i])-des)]
    print(out)


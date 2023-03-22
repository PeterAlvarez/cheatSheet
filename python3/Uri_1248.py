for i in range(int(input())):
    d = input()
    a = input()+input()
    aux = True
    for j in a:
        if j not in d:
            aux = False
            break
        d = d.replace(j, "")
    print( ''.join(sorted( a )) if aux else "CHEATER" )

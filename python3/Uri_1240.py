for x in range(int(input())):
    a, b = map(str,(input().strip().split(" ")))
    a=a[::-1]
    b=b[::-1]
    # print(a,b)
    bol=True
    if( len(a) < len(b) ):
        print("nao encaixa")
    else:
        for x in range(len(b)):
            if( a[x] != b[x] ):
                bol=False
        if( bol ):
            print("encaixa")
        else:
            print("nao encaixa")
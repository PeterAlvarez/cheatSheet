for i in  range( int(input()) ):
    a, b = map(int,(input().strip().split(" ")))
    out1 = out2 =""
    for it in range(a, b+1):
        out1 =out1+str(it)

    for it in range(b, a-1 , -1):
        out2 = out2+str( it )[::-1]
    print( out1+out2 )

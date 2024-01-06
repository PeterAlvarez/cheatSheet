for i in range(int(input())):
    lis = list()
    for j in range(int(input())):
        lis.append(input())
    print("ingles" if len( set( lis ) )>1 else lis[0] )

print("ingles" if len( set( lis ) )>1 else lis[0] )

lis=[]

while True:
    try:
        inp = input()
        if inp:
            lis.append(int(inp))
    except EOFError:
        lis.pop(0)
        lis.sort()
        break

while True:
    if( lis != [] ):
        print("{} aparece {} vez(es)".format(lis[0],lis.count(lis[0])))
        for x in range(lis.count(lis[0])):
            lis.remove(lis[0])
    else:
        break

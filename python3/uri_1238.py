for x in range(int(input())):
    out=''
    a, b = map(str, input().strip().split(" "))
    for x in range(0, 51):
        if( len(a) == x ):
            out += b[x:len(b)]
            break
        elif( len(b) == x ):
            out += a[x:len(a)]
            break
        out += a[x]+b[x]
    print(out)
# u='123456789'
# print(u[4:len(u)])
# print(u is None)

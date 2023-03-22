ss, tv, zh = map(int, input().strip().split(' '))

if( ss==0 ): ss=24

suma=ss+tv+zh
if( suma > 23 ):
    print(abs(suma-24))
elif( suma==24 ):
    print(0)
else:
    print(suma)
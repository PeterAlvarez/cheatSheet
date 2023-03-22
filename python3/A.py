
def sum( a , b , c ) :
    return c*c  - ( b*b + a*a )

while True:
    li = list(map(int, input().split(" ")))
    li.sort()
    if len(li) == 1 :
        break
    res=sum( li[0] , li[1] , li[2] )

    print( "right" if res==0 else "wrong")



def suma(a, b):
    print("hola")
    if a == b:
        return a + b

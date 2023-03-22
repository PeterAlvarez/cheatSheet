while True:
    try:
        a,b,c = map(int,input().strip().split(" "))
        if( a==b==c ):
            print("*")
        elif( a==b and c != a ):
            print("C")
        elif( a==c and b != a ):
            print("B")
        elif( b==c and a != b ):
            print("A")
    except EOFError :
        break

#Uri_1546
# for i in range(int(input())):
#     a, b = map(int,input().strip().split(" "))
#     print("{} cm2".format(int((a*b)/2)))
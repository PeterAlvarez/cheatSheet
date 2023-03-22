while True:
    inp = list(input().strip().split(" "))

    x1 = int(inp[0])
    y1 = int(inp[1])
    x2 = int(inp[2])
    y2 = int(inp[3])

    if( x1+y1+x2+y2 == 0 ): break;
    # print(x1 ,y1 ,x2 ,y2)
    if(x1==x2 and y2==y1):
        print(0)
    elif( x1+y1==x2+y2 ) or ( x1==x2 or y1==y2) or ((x1+y2)%2==(x2+y1)%2) or ( x1+x2==y1+y2 ):
        print(1)
    else:
        print(2)









# 4 4 6 2
# 3 5 3 5
# 5 5 4 3
# 0 0 0 0
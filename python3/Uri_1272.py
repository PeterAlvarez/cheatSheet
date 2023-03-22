for x in range(int(input())):
    dat=list(input().strip().split(" "))
    arr=""
    for i in range(len(dat)):

        if(dat[i]!=""):
            arr+=dat[i][0]
    print(arr)


#1198
# while True:
#     try:
#         a, b =map(int, input().strip().split())
#         print(abs(a-b))
#     except EOFError:
#         break
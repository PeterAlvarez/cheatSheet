while True:
    M, N = map(int, input().split(" "))
    if(M==N==0): break
    print(str(M+N).replace("0",""))


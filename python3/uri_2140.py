billetes = [2, 5, 10, 20, 50, 100]
while True:
    ban=False
    n, m = map(int, input().split(" "))
    if n==0==m : break
    for i in billetes:
        for j in billetes:
            if i!=j and (i+j==m-n):
                ban = True
                break
    print('possible'if ban else'impossible')
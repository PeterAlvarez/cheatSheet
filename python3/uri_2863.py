while True:
    try:
        dat=[]
        for i in range(int(input())):
            dat.append(float(input()))
        dat.sort()
        print(dat[0])
    except EOFError:
        break
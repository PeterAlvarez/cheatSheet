while True:
    try:
        j, num = map(str, input().split(" "))
        cj=0
        for i in range(int(j)):
            datos = input()
            if datos[:4]==num and datos[5:]=='0':
                cj += 1
        print(cj)
    except EOFError:
        break
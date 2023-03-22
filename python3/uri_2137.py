while True:
    try:
        datos = []
        for x in range(int(input())):
            datos.append(str(input()))
        datos.sort()
        for i in datos:
            print(i)
    except EOFError:
        break
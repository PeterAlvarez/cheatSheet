while True:
    try:
        H, P = map(float, input().strip().split(" "))
        dato = str(round((H/P), 2))
        if(len(dato)==3):
            print(dato+"0")
        else:
            print(dato)
    except EOFError:
        break

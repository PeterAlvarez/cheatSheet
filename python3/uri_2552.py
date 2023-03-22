while True:
    try:
        fil, col = map(int, input().split(" "))
        v = []

        for f in range(0,fil):
            v.append(list(map(int, input().split(' '))))

        for i in v:
            print(i)
        # for i in range(fil):
        #     for j in range(col):

    except EOFError:
        break
while True:
    try:
        a, b = map(int , input().strip().split(" "))
        print( (a*2)*b )
    except EOFError:
            break

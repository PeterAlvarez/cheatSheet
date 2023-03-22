for i in range( int( input() ) ):
    a, b, c = map(int, input().split(" "))
    print("Sim" if 200<=a<=300 and b>=50 and c>=150 else "Nao")

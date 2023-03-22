while True:
    try:
        cad = input()
        num = int(input())
        cad = cad.replace('R'*num,'W')
        cad = cad.replace('RRRRRRRRRRR','W')
        cad = cad.replace('RRRRRRRRRR','W')
        cad = cad.replace('RRRRRRRRR','W')
        cad = cad.replace('RRRRRRRR','W')
        cad = cad.replace('RRRRRRR','W')
        cad = cad.replace('RRRRRR','W')
        cad = cad.replace('RRRRR','W')
        cad = cad.replace('RRRR','W')
        cad = cad.replace('RRR','W')
        cad = cad.replace('RR','W')
        cad = cad.replace('R','W')
        print(cad.count('W'))

    except EOFError:
        break
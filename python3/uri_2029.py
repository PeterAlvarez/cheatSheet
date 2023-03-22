while True:
    try:
        v = float(input())
        d = float(input())
        r = d/2
        print('ALTURA = {:.2f}'.format(round(v/(3.14*r*r),2)))
        print('AREA = {:.2f}'.format(round((3.14*r*r),2)))
    except EOFError:
        break

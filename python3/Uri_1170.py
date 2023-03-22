v1=0
dat = int(input())
for x in range(dat):
    dato = float(input())
    while int(dato)>=1:
        dato = dato/2
        v1+=1
    print(v1,"días")
    v1=0

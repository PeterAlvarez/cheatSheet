fact = [40320, 5040, 720, 120, 24, 6, 2, 1]

n = int(input())

aux = i = 0

while True:

    if n==0: break

    if n >= fact[i]:
        n -= fact[i]
        aux+=1
        if i == 0:
            i=0
        elif i>0:
            i-=1
    else:
        i+=1
print(aux)

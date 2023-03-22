dat = list(map(int, input().split(" ")))

def cons(dat):
    aux=[]
    cont=1
    for i in range(0,len(dat)-1):
        if( dat[i]==(dat[i+1]-1) ):
            cont+=1
        else:
            aux.append(cont)
            cont=1
    return max(aux)


dat2 = dat[::-1]

print('hola mundo como estas?')
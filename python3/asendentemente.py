dat = list(map(int, input().split(" ")))
del dat[0]
par=[]
imp=[]
for i in dat:
    if i%2==0:
        par.append(i)
    else:
        imp.append(i)
par.extend(imp)
print(par)
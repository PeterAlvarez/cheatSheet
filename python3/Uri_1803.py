a = input()
b = input()
c = input()
d = input()
li = list()
for i in range(len(a)):
    li.append(a[i] + b[i] + c[i] + d[i])
li = list( map(int, li) )
a=""
for i in range(1, len(li)-1 ):
    a = a+chr( (li[0]*li[i]+li[-1])%257 )
print( a )

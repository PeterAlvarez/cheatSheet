s=""
while True:
    dat = int(input())
    if dat == 0 : break
    l=list()
    for i in range( dat ):
        l.append(' '.join(input().split()))
    a = 0
    for i in l:
        a = max(a, len(i))
    for i in l:
        s = s + str(i).rjust(a , " ")+'\n'
    s = s + '\n'

print(s.rstrip())



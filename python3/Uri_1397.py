v1=0
v2=0
while True:
    dat = int(input())
    if(dat==0): break
    for x in range(dat):
        j1, j2 = map(int,input().strip().split(" "))
        if(j1>j2):
            v1+=1
        elif(j1<j2):
            v2+=1
    print(v1,v2)
    v1=0
    v2=0


#EPIFANIA
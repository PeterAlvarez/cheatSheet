from statistics import mode
dat=int(input())
vec = list(map(int, input().split(" ")))
aux=[]
for i in range(len(vec)):
    for j in range(i+1,len(vec)):
        print(vec[i]+vec[j])
        aux.append(vec[i]+vec[j])
print(mode(aux))
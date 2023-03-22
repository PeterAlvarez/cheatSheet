pes, dat = map(int, input().split(" "))

for x in range(dat):
    ac = str(input())
    if ac=='fechou':
        pes+=1
    else:
        pes-=1
print(pes)
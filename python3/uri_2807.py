vec=[]
for i in range(int(input())):
    if i==0 or i==1:
        vec.append(1)
    else:
        vec.append(vec[i-1]+vec[i-2])
print( (str(vec[::-1]))[1:-1].replace(',','') )

c = int(input())
inp = list(input().split(" "))
aux = ""
for x in range(len(inp)):

    if(len(inp[x])==3):
            if(inp[x][0]=='U' and inp[x][1]=='R'):
                aux += "URI "
            elif(inp[x][0]=='O' and inp[x][1]=='B'):
                aux += "OBI "
            else:
                aux += str(inp[x]) + " "
    elif(len(inp[x])>=3):
            aux += str(inp[x]) + " "
print(aux.strip())
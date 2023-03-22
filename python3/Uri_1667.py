inp = ""
while True:
    try:
        inputs = input()
        if inputs:
            inp = inp+" "+inputs
    except EOFError:
        break

inp = inp.replace('<br>','\n ')
inp = inp.replace('<hr>','--------------------------------------------------------------------------------')
inp = inp.split(" ")
aux = ""

for x in range(len(inp)-1):
    aux += str(inp[x])+" "
    if ( len(inp[x])+len(inp[x+1]) > 80) :
        print(aux.strip())
        aux=""
    if (inp[x]=='\n'):
        print(aux.strip())
        print("\n")

    # aux += str()
aux += str(inp[len(inp)-1])
print(aux.strip())
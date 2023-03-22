while True:
    inp = list(input().split(" "))
    if (inp[1] =="0"== inp[0]):
        break;
    aux = inp[1].replace(inp[0],"")
    if aux=="":
        aux=0
    print(int(aux))
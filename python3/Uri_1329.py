m = 0
j = 0
while True:
    # try:
    dat = input()
    if(dat == "0"):
        break
    else:
        jug = list(input().split(' '))
    for x in range(len(jug)):
        if(jug[x]=="0"):
            m+=1
        else:
            j+=1
    if( dat=="0" ):
        break
    else:
        print("Mary won {} times and John won {} times".format(m,j))
        j = 0
        m = 0
    # except EOFError:
    #     break

#EPIFANIA

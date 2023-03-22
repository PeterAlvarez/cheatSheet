minus ="abcdefghijklmnopqrstuvwxyz"
mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for x in range(int(input())):
    dat = str(input())
    if( dat[0]==dat[2] ):
        print(int(dat[0])*int(dat[2]))
    elif dat[1] in mayus:
        print(int(dat[2])-int(dat[0]))
    elif dat[1] in minus:
        print(int(dat[0])+int(dat[2]))


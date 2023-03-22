out=""
while True:
    try:
        num = int( input() )
        for i in range(1 , num+1 , 2):
            out = out+( "*"*i ).center( num, " " ).rstrip()+'\n'
        if i==num:
            out = out +("*".center( num , " " ).rstrip())+'\n'
            out = out +(("***").center( num , " ").rstrip())+'\n'+'\n'

    except EOFError:
        print( out, end="")
        break

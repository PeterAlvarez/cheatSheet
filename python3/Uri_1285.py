while True:
    try:
        n1, n2 = map(int,input().split(" "))
        c=0
        s=""
        for x in range(n1,n2+1):
            s=str(x)
            if( x<=10 ):
                c=0
            elif( x<=99  ):
                if(s[0]==s[1]):
                    c=c+1
            elif( x<=999 ):
                if( s[0]==s[1]) or (s[0]==s[2]) or (s[1]==s[2] ):
                    c=c+1
            elif( x<5001):
                if( s[0]==[1]) or (s[0]==s[2]) or (s[0]==s[3]) or (s[1]==s[2]) or (s[1]==s[3]) or (s[2]==s[3] ):
                    c=c+1
        print(((n2+1)-n1)-c)
    except EOFError :
        break
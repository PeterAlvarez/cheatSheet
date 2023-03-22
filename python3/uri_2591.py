for x in range(int(input())):
    dat = str(input())
    dat = dat[1::].replace("me",'').split('k')
    print('k'+('a')*len(dat[0])*len(dat[1]))

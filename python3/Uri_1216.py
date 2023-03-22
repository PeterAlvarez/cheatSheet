ban = 1
sum = 0
while True:
    try:
        dat=input()
        if(ban%2==0):
            sum += int(dat)
        ban += 1
    except EOFError:
        break

dat = (sum*2)/(ban-1)
print(round(dat, 1))

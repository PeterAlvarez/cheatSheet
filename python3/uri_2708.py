cj=0
ct=0
while True:
    dat = input()
    if dat=='ABEND': break
    jeep = dat[:6]
    tur = int(dat[7:])
    if jeep=='SALIDA':
        cj += 1
        ct += tur
    else:
        cj -= 1
        ct -=tur
print(ct)
print(cj)
bina = input()
c = 0
for i in range(len(bina)):
    if bina[i]== '1':
        c+=1
print(bina.ljust(len(bina)+1, '0') if c%2==0 else bina.ljust(len(bina)+1, '1'))

en1 = list(map(int, input().split(" ")))
en2 = list(map(int, input().split(" ")))
ban = True
for x in range(0, 5):
    if( en1[x] == en2[x] ):
        ban= False

print('Y'if ban else'N')
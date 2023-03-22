while True:
    try:
        inpS = str(input())
        inpD = int(input())
        inpN = list(str(input()).strip().split(" "))
        ou = ""
        ind = 0
        for x in range(len(inpN)):
            ou += inpS[int(inpN[x])-1]
        print(ou.strip())
    except EOFError:
        break

# ABCDEFGHIJKLMNOPQRSTUVWXYZ
# 4
# 8 5 12 16
# QWERTYUIOPASDFGHJKLZXCVBNM
# 10
# 16 3 19 19 9 2 9 4 19 13

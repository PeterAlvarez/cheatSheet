inp = ""
while True:
    try:
        inputs =  input()
        if inputs:
            inp = inp+" "+inputs
    except EOFError:
        break

inp = list( inp.split(" ") )
dia = 0
hI  = 0
hF  = 0
dia = ( int( inp[9] )-int( inp[2] ) )*60*60*24 # segundos
hI  = ( int( inp[3] )*60*60 )+( int( inp[5] )*60 ) +int( inp[7] )
hF  = ( int( inp[10] )*60*60 )+( int( inp[12] )*60 )+int( inp[14] )



#338460

# h = 0
# h = 86400-hI+hF
# print(dia)
# ou = dia-(86400-(hI+hF))
# print(int(ou/86400))
# ou = ou%86400

# print(int(h/3600))
# h = h%3600
# print(int(h/60))
# h = h%60
# print(h)
# print(hI)
# print(hF)



#input
# Dia 5
# 08 : 12 : 23
# Dia 9
# 06 : 13 : 23

#abril = 30
#  0
# Dia 1
# 5 2
# 08 3
# : 4
# 12 5
# : 6
# 23 7
# Dia 8
# 9 9
# 06 10
# : 11
# 13 12
# : 13
# 23 14


# 3 dia(s)
# 22 hora(s)
# 1 minuto(s)
# 0 segundo(s)

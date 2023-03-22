##Ejercicio 5
#Variacion con repeticion
from itertools import product
out=[]
for it in product( ["A" , "B" , "C" ] , repeat=4 ):
    out.append(''.join( it ))
print( len( out ) )




#from itertools import combinations
#num = [ "A" , "B" , "C" ]
#for it in combinations(num,2):
#    print(it)

##EJERCICIO 3
#print(1*2*3*4*5*6*7*8*9*10*11*12*13)


##EJERCICIO 2
#print( len( filter( lambda num: "1" in str( num ) , list( range( 1 ,10000 ) ) ) ) )

## EJERCICIO 1
#def binario( n ):
#    out = []
#    for it in range( 128 , 256 ):
#        if n == "11":
#            if( "11" in bin( it )[2::] ): out.append( bin( it )[2::] )
#        else:
#            if( 0== bin( it )[2::].find( n ) ): out.append( bin( it )[2::] )
#    return out
#
## muestra el resultado e imprime los 1ros 10 y el ultimo valor
#def ouput( n ):
#    n = binario( n )
#    ##Quitar la siguiente linea para ver todos los resultados
#    del n[10:-1]
#    return n
#
##Comienza por 1100
#print( ouput("1100") )
##comienza con 1
#print( ouput("1") )
##tiene al menos dos 1 (11)
#print( ouput("11") )

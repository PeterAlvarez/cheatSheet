def mayus( cad ):
    return any( it.isupper() for it in cad )

def minus( cad ):
    return any( it.islower() for it in cad )

def number( cad ):
    return any(chr.isdigit() for chr in cad)

def range( cad ):
    return (len( cad ) > 5 and len( cad )<33)

def spac( cad ):
    aux ="1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for it in cad:
        if it not in aux:
            return False
    return True

while True:
    ban = True;
    try:
        cad = input()
        # print(spac(cad))
        if mayus(cad) and minus(cad) and number(cad) and range(cad) and spac(cad):
            print( "Senha valida." )
        else:
            print( "Senha invalida." )
    except EOFError:
            break


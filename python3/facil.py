import string
while True:
    var = input()
    if var=='fin':break
    abc=list( string.ascii_lowercase )
    def vocalTest( inp  ):
        for it in range( len( inp ) ):
            if inp[ it ] in "aeiou": return True
        return False

    abc.remove( 'e' )
    abc.remove( 'o' )
    def dualRepet( inp  ):
        for it in range( len( abc ) ):
            if abc[ it ]*2 in inp: return False
        return True

    def treeRepet( inp ):
        vocal = conso = 0
        for it in range( len( inp ) ):
            if inp[ it ] in "aeiou":
                vocal+=1
                conso=0
            else:
                conso+=1
                vocal=0
            if vocal>2 or conso>2: return False
        return True

    out = 'es aceptable.' if vocalTest( var ) and dualRepet( var ) and ( treeRepet( var ) ) else 'no es aceptable.'
    print('<{}> {}'.format( var , out ) )


vec = ['a','e','i','o','u','A','E','I','O','U']
while True:
    try:
        dat = str(input())
        cont=0
        for i in dat:
            if i in vec:
                cont+=1
        print(cont)
    except EOFError:
        break
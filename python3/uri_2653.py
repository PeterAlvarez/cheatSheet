dat=[]
out=[]
while True:
    try:
        dat.append(str(input()))
    except EOFError:
        break



# elimina elementos de una lista y crea una nueva lista
# for i in dat:
#     if( not i in out):
#         out.append(i)

# otra manera de eliminar elementos repetidos
print(len(set(dat)))
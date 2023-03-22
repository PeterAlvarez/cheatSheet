lista = [1,2,3,"h",True]
lista.append("10")
lista.pop()

lisA = [1,5,5,4,5]
lisB = [1000,200,300,300]
lisA.extend(lisB)#Une dos listas
print(lisA)
del lisA[3]#Borra posision de lista
lisA.remove(300)#Borra elemento
lisA.count(5)#Cuenta elemento(5) en la lista
lisA.sort()
print(lisA)
lisA.sort(reverse=True)
print(lisA)
print(lisA[-2])#Imprime el Penultimo elemento

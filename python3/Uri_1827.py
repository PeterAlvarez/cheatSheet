# lee el número de niños que no enviaron una carta a Santa
n = int(input())

# inicializa contadores para los juguetes de los niños
toys_boy = 0  # para los niños varones (toy car)
toys_girl = 0  # para las niñas (doll)

# itera a través de cada niño que no envió una carta
for i in range(n):
    # lee el nombre del niño y el tipo de letra ('M' para niño varón, 'F' para niña)
    name, letter = input().split()
    
    # incrementa el contador correspondiente basado en el tipo de letra
    if letter == 'M':
        toys_boy += 1
    else:
        toys_girl += 1

# imprime el número de juguetes para cada género
print(f"{toys_boy} carrinhos")  # toy car en portugués es "carrinhos"
print(f"{toys_girl} bonecas")  # doll en portugués es "bonecas"

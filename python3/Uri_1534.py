def crear_matriz(filas, columnas):
    matriz = []
    for i in range(filas):
        fila = []
        for j in range(columnas):
            if i==j :
                valor = 1
            else:
                valor = 3
            if i + j == filas - 1:
                valor = 2
            fila.append(valor)
        matriz.append(fila)
    return matriz

def imprimir_matriz(matriz):
    for fila in matriz:
        print("".join(map(str, fila)))

def main():

    while True:
        try:
            filas = int(input())
            columnas = filas
            matriz = crear_matriz(filas, columnas)
            imprimir_matriz(matriz)

        except EOFError:
            break
if __name__ == "__main__":
    main()

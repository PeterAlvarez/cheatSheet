def crear_matriz(filas, columnas):
    matriz = []
    for i in range(filas):
        fila = []
        for j in range(columnas):
            if i ==j:
                valor = 1
            elif i > j:
                valor = ( i+1 ) - j
            elif j > i:
                valor = ( j+1 ) - i
            else:
                valor = 0
            fila.append(valor)
        matriz.append(fila)
    return matriz


def main():
    salida = ""
    while True:
        filas = int(input())
        if filas == 0:
            print(salida)
            break

        columnas = filas
        matriz = crear_matriz(filas, columnas)

        for fila in matriz:
            salida +=  "  "+"   ".join(map(str, fila))+"\n"
        salida += "\n"


if __name__ == "__main__":
    main()

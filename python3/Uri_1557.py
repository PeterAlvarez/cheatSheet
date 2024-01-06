serie = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096,
8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576,
2097152, 4194304, 8388608, 16777216, 33554432, 67108864,
134217728, 268435456, 536870912]


while True:
    tam = int(input())

    if tam == 0: break

    matriz = []
    tam_space = serie[(tam*2)-2]
     
    for i in range(tam):
        matriz.append(list(serie[i:i+tam]))

    for fila in matriz:
        print(" ".join(str(numero).rjust(len(str(tam_space))) for numero in fila))
    print()

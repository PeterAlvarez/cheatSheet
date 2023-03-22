def enviar_datos():
    nombre = "Tux"
    correo = "tuxPro@gmail.com"
    edad = 20
    ciudad = "La Paz"
    return(nombre, correo,edad, ciudad)

def recibir_datos( datos ):
    print(datos[0])
    print(datos[1])
    print(datos[2])
    print(datos[3])

recibir_datos(enviar_datos())
print(type(enviar_datos()))

def hol(datos):
    print(sep=..., end=..., file=..., flush=...)

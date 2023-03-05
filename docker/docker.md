# docker cheatsheet

## docker ps

mostrar los contenedores q estan corriendo en ese momento

##docker ps -a | head
muestar los primeros 10 contenedores muertos o no

##docker pull [contenedor]
Descargar una imagen de docker

##docker run [contenedor] [comando que quieres corre ejemplo] ls -l
correr un comando dentro de un contenedor docker

##docker run [contenedor] [comando que quieres correr]:[version] comand
ejermplo $docker run midebian:1.0 figlet "hola mundo"

## docker run -it [contenedor] sh

#-it => iteractivo y cree una terminal
#sh => shell
ingresa al contenedor y te da una shell de inicio

## docker exec -it [id del contenedor] sh

#exec => parametro para ejecutar un comando en un contenedor que esta corriendo

## docker search [images]

busca imagenes de contenedores en docker hub

## docker commit [id de tu contenedor modificada]

#listar con "docker ps -a"
comitea un contenedor

##docker image ls | head

# head => visualiza los 10 primeros

lista tus contenedores comiteados

##docker image tag [id image] [nombre para tu image]
#tag => para ponerle nombre a un imagen commiteados para encontarlo mas facil

##docker image tag [id image] [nombre de tu image]:1.0
#:1.0=> podremos darle una nueva version que se guardara en otra imagen

##docker build -t [nombre para tu image]:[version] [ruta del Dockerfile]
#-t => tag para agregar nombre a tu image
#: => agrega version al tag creado
#build compila un archivo Dockerfile debes darle la ruta al final
crea otra version de imagen desde una ya creada anteriormente ahorra tiempo
$docker build -t midocker:1.2 => teniendo en cuenta que existe un midocker:1.1

## docker image history [id image]

muestra el historial de comando de una imagen pasmos como parametro
el id de la imagen listando con "docker image ls"

##dockerFile => serie de instrucciones para crear una image

## docker system prune

limpiar imágenes, contenedores, volúmenes y dispositivos de red, que no
estén asociadas a ningún contenedor.

## docker stop [id container]

para un contenedor que esta corriendo

##docker run -v [Ruta del archivo o directorio a montar]:[destino dentro del
##contenedor donde sera montado el archivo o el directorio]:ro -p 8080:80 -d ##[Tu imagen donde sea montada el archivo o directorio]

# -v => para montar volumenes a un contenedor

# ro => para aseguarse que los procesos de un contenedor no puedan escribir en

# el archivo o directorio que vamos a montar

# -p => expone un puerto del contenedor hacia el host

# 8080:80 puerto 8080 de la maquina apunta al 80 del contenedor

# -d => para que corra en background( en 2do plano )

docker run -v ~/myCode/Docker/index.html:/usr/share/nginx/html/index.html:ro -d
nginx:1.15.7

##docker system prune
Borrar todos los contenedores que no hayan sido commiteados ni tagleados[alert]

## docker rm [id contenedor]

Borrar un contenedor que no se este ejecutando

## docker rmi [id image]

borra una imagen [alert]
##docker inspect [id contenedor]
informacion de una contenedor

##docker stats [id contenedor]
para ver el status de un contenedor

## docker stats

mostrar estadisticas de contenedores en ejecucion

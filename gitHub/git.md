## git config --global user.name "TU NOMBRE"

agregar nombre a tu configuracion git

## git config --global user.email "TU CORREO"

agregar correo a tu configuracion git

## git config --list

## git config -l

ver configuracion de git

## git init

crea un nuevo repositorio en el archivo q te encuentras

##git status
estado de nuestro repositorio

##git add -A
agrega todos los archivos que no estan seguidos por git

##git rm --cached [nombrearchivo]=>contrario del anteriora
borra un archivo del staging

##git commit -m "MESAJE DEL COMMITA"
comitear un repositorio

##git log
##git log --oneline
historial de los commit

##git clone
clona un repositorio

##git diff
muestra los cambios de un archivo

##git push origin master
subir tu codigo a github

##git push
actualiza tu repositori a la ultima version

##git branch [nombreDE RAMA]
crea una nueva rama de un repositorio

##git branch
muestra las ramas

##git push -u origin [tu rama]
linkea tu rama con el repositorio del servidor

##git checkout master
moverse a la rama master

##git pull origin master
para actualizar el ropositorio a la ultima version

##git branch --merged
las branch mergeadas asta el momento

##git merge [nombre de tu rama de trabajo]
mete tus cambios de la rama de trabajo a la rama master

##git push -u origin master
sube tu codigo del local al servidor

configuracion git master

## agregamos un nuevo token tutorial

https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token

## agregamos el token generado a nuestro git local de nuestra computadora

git config user.password [tokken generado en git.com]

##guardamos en cache el token para que no tengamos que reescribir
git config --global credential.helper cache

##unir dos repositorios git
git subtree add -P gitNeo ../gitNeo/ HEAD

-----con esa configuracion tendrias que tener tu gitconfigurado xd...

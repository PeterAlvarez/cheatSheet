#Auditoria seo

#imports#
import urllib.request as request
from urllib.request import urlopen
import os
from bs4 import BeautifulSoup
#*********Vereficar HTTPS**************
print('Auditoria a python.org')
req = request.Request('http://python.org')
resultado = request.urlopen(req)
print('HTTP or HTTPS ',resultado.geturl())

#*********Peso de la pagina*************
url = resultado.geturl()
print('url', url)
site = request.urlopen( url )
meta = site.info()
                                    #emcabezado site
print("Content-Length: ",site.headers['content-length'])

f = open('out.txt', 'r')
print('File on disk: ',len(f.read()))
f.close()

f = open('out.txt', 'wb')
f.write(site.read())
site.close()
f.close()

f = open('out.txt', 'r')
print('File on disk after download: ', len(f.read()))
f.close()

print('os.stat().st_size return: ',os.stat('out.txt').st_size)

#*************verificar www ********************#
req = request.Request('http://python.org')
resultado = request.urlopen(req)
print('Verificamos si tiene www:',resultado.geturl())

#***************Verificar descripcion**************
site = request.urlopen('https://python.org')
soup = BeautifulSoup(site)
description = soup.find('meta',attrs={'name':'description'})
print('El tamaño de descripcion es: ',len(description.get('content')))

if( len(description.get('content'))) < 154:
    print('La descripcion es menor a 154')

#**************** Verificar etoqueta title************
# html = urlopen('https://python.org')
# soup = BeautifulSoup(html.read())
# print("El tamaño del title es: ", len(suop.html.head.title.string))
# print("El title es python.org", soup.html.head.title.string)

#***************** Palabras claves******************
site = request.urlopen('http://python.org')
soup = BeautifulSoup(site)
keywords = soup.find('meta',attrs={'name':'keywords'})
print('Keywords: ', keywords.get('content'))

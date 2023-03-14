# La bios

La BIOS reside en la placa base en ROM (Memoria de solo lectura) comúnmente en la
“memoria de solo lectura programable y borrable electrónicamente” (EEPROM)
también llamada memoria flash.
Cuando se enciende un ordenador la BIOS realiza un test de encendido, inicializa el
hardware a un estado operacional conocido, carga el gestor de arranque desde el
dispositivo de inicio (normalmente el primer disco duro) y pasa el control al gestor de
arranque para que cargue el sistema operativo.

///Habilitar y deshabilitar dispositivos hardware

Una característica clave de la BIOS es habilitar o deshabilitar componentes conectados
a la placa base. Las más modernas proporcionan una gran amplitud de dispositivos
incluyendo controladores de disco duro, puertos serie, paralelos, usb, ethernet,
hardware de audio e incluso de vídeo.

#IRQS
Una petición de interrupción o IRQ (interrupt request) es una señal enviada a la CPU
en la que se le indica que debe suspender su actividad actual y encargarse de algún
evento externo como por ejemplo una entrada desde teclado, reanudando
posteriormente la actividad que estuviera realizando.


#Direcciones de Entrada/Salida

Las direcciones de Entrada/Salida son localizaciones únicas en memoria que están
reservadas para comunicaciones entre la CPU y dispositivos hardware específicos.
Como las IRQs, las direcciones de Entrada/Salida están casi siempre asociadas a
dispositivos específicos y no deberían ser compartidas en la mayoría de los casos.
En un sistema Linux que está funcionando se pueden explorar qué direcciones de
entrada/salida se están utilizando. Para ello hay que examinar el fichero /proc/ioports
con el comando cat.

******Dispositivos Coldplug y Hotplug
Sysfs --> informacion acerca de los dispositivos y sus controladores

D-bus --> proporciona notificaciones de nuevos eventos
Udev---> gestor de dispositivos usado por el kernel
permite avisar a las aplicaciones de estos eventos gracias a D­Bus. Se puede
configurar udev a través de ficheros en /etc/udev, pero la configuración estándar
normalmente es suficiente para el hardware común.


********TARJETAS PCI

La mayoría de las BIOS tienen opciones PCI que cambian la forma en que estos
recursos son localizados. Ajustar estas opciones ayudará en el caso de que existan
extraños problemas de hardware con los dispositivos PCI. Estas opciones afectan solo
al sistema de detección de la BIOS y los dispositivos PCI suelen funcionar solamente
seleccionando BIOS como el método de detección PCI en el Kernel.
Algunos drivers de Linux soportan opciones que configuran el hardware para usar
recursos particulares. Se deben consultar los archivos de documentación de los drivers
para ver los detalles sobre las opciones que soportan. A continuación deben pasarse
estas opciones al Kernel usando un cargador de arranque o como módulos.


*****  MODULOS

El hardware en Linux es manipulado por los drivers del kernel. Algunos de ellos
aparecen en forma de “módulos del kernel”.
Los módulos del Kernel son ficheros de drivers almacenados normalmente en el
directorio /lib/modules y pueden ser cargados o descargados para proporcionar
acceso al hardware. Normalmente Linux carga los módulos que necesita durante el
inicio del sistema pero es posible que sea necesario cargar módulos adicionales
manualmente.
Con el comando lsmod se mues
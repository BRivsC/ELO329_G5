Tarea 1 ELO329, Grupo 5, Etapa 1
Integrantes: Héctor Cepeda, Bastián Rivas, Martín Alonso, Claudio Zanetta
-------------------------------------------------------------------------
Archivos que componen la etapa:
Comida.java
Estado.java
Inventario.java
Item.java
Juguete.java
Main.java
Makefile
Mascota.java
Medicina.java
readme.md

------------------------------------------------------------------------
# Compilación y ejecución de la etapa:

Para compilar esta etapa:
* Dirigirse al directorio de aragorn donde se guardó la etapa a ejecutar y su makefile respectivo.
* Utilizar el comando "make" para ejecutar el archivo makefile
* Utilizar el comando "make run" para ejecutar el código mediante el Makefile
* Si se utiliza el comando "make clear", se eliminarán todos los archivos de tipo .class y si se quiere correr nuevamente el código, se deberá volver a hacer uso del comando "make"

# Ejecución y función de la etapa.

Esta etapa del programa incluye todo lo anterior y agrega la capacidad de usar un inventario que agrupa a los elementos internamente como un ``ArrayList`` de ``Item``. 
También se agrega el paso del tiempo y los efectos que este tiene sobre la mascota.

Para interactuar con el inventario, esperar a que aparezca el mensaje pidiendo entradas e ingresar el número correspondiente a la id del objeto a usar.

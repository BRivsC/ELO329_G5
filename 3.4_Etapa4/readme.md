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
ultima_partida.csv

------------------------------------------------------------------------
# Compilación y ejecución de la etapa:

Para compilar esta etapa:
* Dirigirse al directorio de aragorn donde se guardó la etapa a ejecutar y su makefile respectivo.
* Utilizar el comando "make" para ejecutar el archivo makefile
* Utilizar el comando "make run" para ejecutar el código mediante el Makefile
* Si se utiliza el comando "make clear", se eliminarán todos los archivos de tipo .class y si se quiere correr nuevamente el código, se deberá volver a hacer uso del comando "make"

# Ejecución y función de la etapa.

Esta etapa del programa incluye todo lo anterior y agrega el uso de un archivo externo de tipo .csv que permite modificar desde fuera del programa el inventario. Además, incluye el funcionamiento extra mencionado en la tarea.

Para interactuar con el inventario, esperar a que aparezca el mensaje pidiendo entradas e ingresar el número correspondiente a la id del objeto a usar. Se ofrece también la función de ``dormir (0)``, ``continuar (c)`` o ``terminar anticipadamente (x)``.

El bonus consta de implementar en el código la creación de un archivo de formato .csv que muestre los atributos de la mascota en cada intante de tiempo duran la simulación. Una vez termina la ejecución, se genera el archivo ``ultima_partida.csv`` donde se guardan los atributos correspondientes a la edad.

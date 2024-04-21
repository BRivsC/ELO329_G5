-------------------------------------------------------------------------
Tarea 1 ELO329, Grupo 5 
Integrantes: Hector Cepeda, Bastian Rivas, Martin Alonso, Claudio Zanetta
-------------------------------------------------------------------------
Archivos que componen la tarea:
Comida.java
Estado.java
Inventario.java
Item.java
Juguete.java
Main.java
Mascota.java
Medicina.java
config.csv
# Se creara un archivo llamado ultima_partida.csv
# Se incluyen 4 archivos makefile llamados "Makefile", cada uno en la carpeta que corresponda a su etapa respectiva.
------------------------------------------------------------------------
# Compilacion y ejecucion de etapas:

Para compilar cada una de las etapas:
se tiene que ir al directorio en aragon en el cual se encuentra la etapa que se quiera compilar y su makefile respectivo<>.
utilizar el "comando make"
luego se utiliza el comando "make run"
Si se utiliza el comando "make clear", se eliminaran todos los archivos de tipo .class y si se quiere correr nuevamente el codigo, se debe volver a hacer el comando "make"

# Ejecucion y funcion de cada etapa

# Etapa 1:
La funcion de este codigo es mostrar los atributos iniciales de la mascota virtual "Garfield"

# Etapa 2:
La funcion de este codigo es mostrar la existencia y efectos que tienen acciones que puede tomar la mascota, como comer, jugar con un juguete, tomar medicina y dormir.

# Etapa 3:
Esta etapa implementa el paso del tiempo y sus efectos en las estadisticas de acuerdo con su salud y edad, ademas de integrar una interfaz en el terminal para que el usuario pueda
decidir que accion tomar de las implementadas en la etapa anterior y se implementa el uso de un inventario de los objetos disponibles. Si se ingresa la letra "c", se avanzara en 0,5 el paso del tiempo y si se ingresa la letra "x", se finalizara la simulacion.

# Etapa 4:
La ultima etapa del programa incluye el uso de un archivo externo de tipo .csv que permite modificar desde fuera del programa el inventario.
# Etapa 5 Bonus
El bonus consta de implementar en el codigo la creacion de un archivo de formato .csv que muestre los atributos de la mascota en cada intante de tiempo duran la simulacion.
Esta etapa esta implementada en conjunto con la etapa 4.
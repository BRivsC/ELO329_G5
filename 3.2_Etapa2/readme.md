Tarea 1 ELO329, Grupo 5, Etapa 2
Integrantes: Hector Cepeda, Bastian Rivas, Martin Alonso, Claudio Zanetta
-------------------------------------------------------------------------
Archivos que componen la etapa:
Comida.java
Estado.java
Item.java
Juguete.java
Main.java
Makefile
Mascota.java
Medicina.java
readme.md

------------------------------------------------------------------------
# Compilacion y ejecucion de la etapa:

Para compilar esta etapa:
* Dirigirse al directorio de aragorn donde se guardó la etapa a ejecutar y su makefile respectivo<>.
* Utilizar el comando "make" para ejecutar el archivo makefile
* Utilizar el comando "make run" para ejecutar el código mediante el Makefile
* Si se utiliza el comando "make clear", se eliminarán todos los archivos de tipo .class y si se quiere correr nuevamente el codigo, se deberá volver a hacer uso del comando "make"

# Ejecucion y funcion de la etapa.

Esta etapa del programa incluye todo lo anterior y agrega la creación de la clase abstracta Item, de la cual se extienden las clases Comida, Medicina y Juguete.
En la clase item, además de atributos, se define el método usarItem, el cual cada clase heredada implementará de forma distinta. Este método recibe una Mascota y un Item a usar.

Por otro lado, se implementan una serie de métodos para actualizar los atributos de una Mascota dada, de tal forma se logra simular la interacción entre un Item y una Mascota, ya que al emplear el método usaritem, la mascota actualizará sus atributos acorde a este y se imprimirá por consola un mensaje declarando el objeto utilizado.

Finalmente se implementa el método dormir para Mascota, el cual también actualiza los parámetros de la misma e imprime por consola un mensaje declarando que la mascota está durmiendo.

En la ejecución se apecia como la mascota al interactuar con cada Item o al dormir, actualiza sus atributos.


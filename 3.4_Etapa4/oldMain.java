public class Main {
    public static void main(String[] args) {
           // Revisar si se ingresó la cantidad correcta de argumentos al correr el código
           if(args.length != 1){
            System.out.println("Uso: java Main <config.csv>");
            return;
        }
        
        // Lectura de archivo .csv
        String csvFile = args[0];
        String line = "";
        String csvSplitBy = ",";
        String nombreMascota = "";  

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Registrar la primera línea como nombre de la mascota
            nombreMascota = br.readLine();

            // Revisar las líneas sucesivas para guardar los nuevos items
            while ((line = br.readLine()) != null) {
                // Coma como separador para dividir la línea en campos
                String[] datos = line.split(csvSplitBy);
                
                // Registrar desde la segunda línea en adelante como nuevo ítem
                // 1er dat0 = id, 2do dato = nombre, 3er dato = cantidad
                // Guarda cada valor en variables separadas
                int id = Integer.parseInt(datos[0]);
                String nombreItem = datos[1];
                int cantidad = Integer.parseInt(datos[2]);
                System.out.println(); // Salto de línea para la siguiente fila
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //instanccia de las clases de item : jugete, comida, medicina
        //Jugete jugete = new Jugete(1, "pelota", 4);
        // Comida comida = new Comida(2, "Pan", 4);
        //Comida comida = new Comida(3, "Queso", 4);
        //Medicina medicina = new Medicina(4, "Jarabe", 4);

        //Apllicar cada item de la mascota


        // Mostrar atributos iniciales de la mascota
        //mostrarAtributos(mascota);

        //mascota.dormir();
        System.out.println("Atributos Iniciales:");
        System.out.println(mascota);
        System.out.println("------------------");

// PENDIENTE Agregar menu que recibe por teclado la opcion de continuar o salirse del juego.


        // Simular el paso del tiempo
        for (int i = 0; i < 5; i++) {
            // Mostrar el paso del tiempo actual
            System.out.println("Paso del tiempo: " + (i + 1));

            // Simular interacciones con la mascota
            mascota.actualizarSalud(-5); // Reducir la salud de la mascota
            mascota.actualizarEnergia(-5); // Reducir la energía de la mascota
            mascota.actualizarFelicidad(-5); // Reducir la felicidad de la mascota

            // Mostrar información de la mascota después del paso del tiempo
            System.out.println("Información de la mascota después del paso del tiempo: ");
            System.out.println(mascota);
            //System.out.println(comida);

        }    // Hacer que la mascota duerma para recuperar energía y salud
        mascota.dormir();

            // Mostrar información de la mascota después de dormir
        System.out.println("Información de la mascota después de dormir: ");
        System.out.println(mascota);
        
    }




}

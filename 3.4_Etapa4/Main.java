import java.util.Scanner;
// Etapa 4
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Revisar si se ingresó la cantidad correcta de argumentos al correr el código
        if(args.length != 1){
            System.out.println("Uso: java Main <config.csv>");
            return;
        }
        //Definir inventario
        Inventario inventario = new Inventario();

        // Lectura de archivo .csv
        String csvFile = args[0];
        String line = "";
        String csvSplitBy = ";";
        String nombreMascota = "";  
    
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Registrar la primera línea como nombre de la mascota
            nombreMascota = br.readLine();
            // Revisar las líneas sucesivas para guardar los nuevos items
            while ((line = br.readLine()) != null) {
                // Coma como separador para dividir la línea en campos
                String[] datos = line.split(csvSplitBy);
                    
                // Registrar desde la segunda línea en adelante como nuevo ítem
                // 1er dato = id, 2do dato = tipo, 3er dato = nombre, 4to dato = cantidad
                // Guarda cada valor en variables separadas

                // Obtener la info necesaria desde config
                int id = Integer.parseInt(datos[0]);
                String tipoObjeto = datos[1];
                String nombreItem = datos[2];
                int cantidad = Integer.parseInt(datos[3]);
                    
                // Generar objeto nuevo según su tipo
                if (tipoObjeto.equals("Juguete")) {
                    inventario.agregarItem(new Juguete(id, nombreItem, cantidad));

                } else if (tipoObjeto.equals("Medicina")) {

                    inventario.agregarItem(new Medicina(id, nombreItem, cantidad));
                } else if (tipoObjeto.equals("Comida")) {

                    inventario.agregarItem(new Comida(id, nombreItem, cantidad));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        inventario.mostrarInventario();;
        // Se crea una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota(nombreMascota);


        // variables para controlar el tiempo simulado
        float tiempoSimulado = 0.0f;
        final float tiempoIncremento = 0.5f;

        // leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);



        while(true){

        if( mascota.getEstado() == Estado.MUERTO) {
            System.out.println("Se te murio la wea");
            break;
        }
        //mostrar el tiempo 
        System.out.println("Tiempo simulado :" + tiempoSimulado );

        //Mostrar los atributos de la mascota
        System.out.println("------------------");
        System.out.println(mascota);
        System.out.println("------------------");

        //Mostrar estado del inventario y la opcion de dormir
        System.out.println("Acciones");
        System.out.println("------------------");
        System.out.println("0: dormir");
        inventario.mostrarInventario();
           

        System.out.println(" Seleccione un elemento del inventario, 'c' para continuar y 'x' para salir:");
        //leer lo escogido por consola
        String opcion= scanner.nextLine();

        //Procesar la opción seleccionada por el usuario

        if( opcion.equalsIgnoreCase ("x") ){

            System.out.println("Fin de la simulacion");
            break;

        } else if (  opcion.equalsIgnoreCase ("c") ) {
            System.out.println("Continuar");

            tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado
            mascota.envejecer( tiempoIncremento );
                    
            } else {
                // Intentar convertir la opción ingresada a un entero
                int opcionId;
                try {
                    opcionId = Integer.parseInt(opcion);
                } catch (NumberFormatException e) {
                    System.out.println("Opción inválida");
                    continue; // Continuar con la siguiente iteración del bucle
                }

                if (opcionId == 0) {
                    mascota.envejecer( tiempoIncremento );
                    tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado
                    mascota.dormir();
                } else if ( inventario.existeItem( opcionId) == 1 ){
                    // Procesar la opción seleccionada por el usuario
                    mascota.envejecer( tiempoIncremento );
                    inventario.usarItem_Inventario(mascota, opcionId);
                    tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado

                } else {
                    System.out.println("Opcion Invalida");
            }
        }

    }



    scanner.close();

    }


}






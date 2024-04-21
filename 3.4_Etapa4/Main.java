import  java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

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
                // Guarda cada valor en variables separadas desde config
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
            return;
        }
        // Se crea una instancia de la mascota con el nombre desde config.csv
        Mascota mascota = new Mascota(nombreMascota);
        
        // variables para controlar el tiempo simulado
        System.out.println();
        float tiempoSimulado = 0.0f;
        final float tiempoIncremento = 0.5f;

        // Incremento de tiempo del inicio de partida
        tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado
        mascota.envejecer( tiempoIncremento );
        
        // leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);


        // Bonus: Generar un archivo .csv con el resumen de la última partida
        // Formato: Edad; Salud; Energía; Felicidad
        // Escritura de encabezados
        String outputCSV = "ultima_partida.csv"; // .csv con el resumen
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputCSV))) {
            // Escribir encabezados
            bw.write("Edad; Salud; Energia; Felicidad\n");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        // Fin de parte Bonus


        while(true){
            
            if( mascota.getEstado() == Estado.MUERTO) {
                System.out.println(mascota.getNombre()+" ha muerto. Que en paz descanse");
                break;
            }
            //mostrar el tiempo 
            System.out.println("Tiempo simulado : " + tiempoSimulado );
            
            //Mostrar los atributos de la mascota
            System.out.println(mascota);

            // Bonus: Escritura de atributos
            // Formato: Edad; Salud; Energía; Felicidad
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputCSV, true))) {
                // Registrar atributos
                bw.write(mascota.getEdad()+";"+ mascota.getSalud()+";"+ mascota.getEnergia()+";"+ mascota.getFelicidad()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            // Fin de bonus

            //Mostrar estado del inventario y la opcion de dormir
            System.out.println("Acciones");
            System.out.println("------------------");
            System.out.println("0: dormir");
            inventario.mostrarInventario();
            
            
            System.out.print("Seleccione un elemento del inventario, 'c' para continuar y 'x' para salir: ");
            //leer lo escogido por consola
            String opcion = scanner.nextLine();
            
            //Procesar la opción seleccionada por el usuario
            
            if( opcion.equalsIgnoreCase ("x") ){
                
                System.out.println("\nFin de la simulación\n");
                break;
                
            } else if (  opcion.equalsIgnoreCase ("c") ) {
                System.out.println();
                
                tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado
                mascota.envejecer( tiempoIncremento );
                
            } else {
                // Intentar convertir la opción ingresada a un entero
                int opcionId;
                try {
                    opcionId = Integer.parseInt(opcion);
                } catch (NumberFormatException e) {
                    System.out.println("\nOpción inválida\n");
                    continue; // Continuar con la siguiente iteración del bucle
                }
                // Acción de dormir
                if (opcionId == 0) {
                    mascota.dormir();
                    mascota.envejecer( tiempoIncremento );
                    tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado

                // Número escogido corresponde a algo dentro del inventario
                } else if ( inventario.existeItem( opcionId) == 1 ){
                    // Procesar la opción seleccionada por el usuario
                    inventario.usarItem_Inventario(mascota, opcionId);
                    mascota.envejecer( tiempoIncremento );
                    tiempoSimulado += tiempoIncremento; // Incrementar el tiempo simulado
                    
                } else {
                    System.out.println("\nOpción Inválida\n");
                }
            }
        }
        scanner.close();
    }
}






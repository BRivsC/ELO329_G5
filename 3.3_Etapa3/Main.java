import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota("Garfield");

        //instanccia de las clases de item : jugete, comida, medicina
        Juguete pelota = new Juguete(1, "Pelota", 4);
        Comida queso = new Comida(2, "Queso", 5);
        Comida pan = new Comida(3, "Pan", 3);
        Medicina jarabe = new Medicina(4, "Jarabe", 4);


        Inventario inventario = new Inventario();
        inventario.agregarItem(pelota);
        inventario.agregarItem(queso);
        inventario.agregarItem(pan);
        inventario.agregarItem(jarabe);

        Medicina clona = new Medicina(5, "clona", 2);
        inventario.agregarItem(clona);

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

  //          if( mascota.getEstado() == Estado.MUERTO) {
    //            System.out.println("Se te murio la wea");
      //          break;
        //    }

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

                    }
                    else if ( inventario.existeItem( opcionId) == 1 ){
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






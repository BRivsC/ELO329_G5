import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota("Garfield");
        
        //instancia de las clases de item : jugete, comida, medicina
        Juguete pelota = new Juguete(1, "Pelota", 4);
        Comida queso = new Comida(2, "Queso", 5);
        Comida pan = new Comida(3, "Pan", 3);
        Medicina jarabe = new Medicina(4, "Jarabe", 4);
        
        
        Inventario inventario = new Inventario();
        inventario.agregarItem(pelota);
        inventario.agregarItem(queso);
        inventario.agregarItem(pan);
        inventario.agregarItem(jarabe);
        
        
        // variables para controlar el tiempo simulado
        float tiempoSimulado = 0.0f;
        final float tiempoIncremento = 0.5f;
        
        // leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        
        
        while(true){
            
            if( mascota.getEstado() == Estado.MUERTO) {
                System.out.println(mascota.getNombre()+" ha muerto. Que en paz descanse");
                break;
            }
            //mostrar el tiempo 
            System.out.println("Tiempo simulado: " + tiempoSimulado );
            
            //Mostrar los atributos de la mascota
            System.out.println(mascota);
            
            //Mostrar estado del inventario y la opcion de dormir
            System.out.println("Acciones");
            System.out.println("------------------");
            inventario.mostrarInventario();
            
            
            System.out.print("Seleccione un elemento del inventario: ");
            //leer lo escogido por consola
            String opcion= scanner.nextLine();
            
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






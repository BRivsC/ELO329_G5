public class Main {
    public static void Main(String[] args) {
        // Se crea una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota("Garfield");


        //instanccia de las clases de item : jugete, comida, medicina
        Jugete jugete = new Jugete(1, "pelota", 4);
       // Comida comida = new Comida(2, "Pan", 4);
        Comida comida = new Comida(3, "Queso", 4);
        Medicina medicina = new Medicina(4, "Jarabe", 4);

        //Apllicar cada item de la mascota
        aplicarItem(mascota, jugete);
        aplicarItem(mascota, comida);
        aplicarItem(mascota, medicina);

        // Mostrar atributos iniciales de la mascota
        mostrarAtributos(mascota);

        mascota.dormir();
        System.out.println("Atributos de la mascota luego de dormir:");
        mostrarAtributos(mascota);

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
            System.out.println(comida);

            // Hacer que la mascota duerma para recuperar energía y salud
            mascota.dormir();

            // Mostrar información de la mascota después de dormir
            System.out.println("Información de la mascota después de dormir: ");
            System.out.println(mascota);
        }
    }
}



    // Método para aplicar un ítem a la mascota
    private static void aplicarItem(Mascota mascota, Item item) {
        if (item instanceof Comida) {
            mascota.actualizarSalud(20);
            mascota.actualizarEnergia(20);
            System.out.println("Dando de comer " + item.getNombre() + " a " + mascota.getNombre());
        } else if (item instanceof Medicina) {
            mascota.actualizarSalud(40);
            System.out.println("Aplicando medicamento " + item.getNombre() + " a " + mascota.getNombre());
        } else if (item instanceof Jugete) {
            mascota.actualizarFelicidad(30);
            System.out.println("Usando juguete " + item.getNombre() + " con " + mascota.getNombre());
        } else {
            System.out.println("Ítem no reconocido.");
        }
    }


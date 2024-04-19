public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota("Garfield");

        // Mostrar información inicial de la mascota
        System.out.println(mascota);

// Agregar menu que recibe por teclado la opcion de continuar o salirse del juego.


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

            // Hacer que la mascota duerma para recuperar energía y salud
            mascota.dormir();

            // Mostrar información de la mascota después de dormir
            System.out.println("Información de la mascota después de dormir: ");
            System.out.println(mascota);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota("Garfield");
        


        //instanccia de las clases de item : jugete, comida, medicina
        Juguete juguete = new Juguete(1, "pelota", 4);
        Comida comida = new Comida(2, "Queso", 4);
        Medicina medicina = new Medicina(4, "Jarabe", 4);

        //Apllicar cada item de la mascota
        System.out.println("Atributos Iniciales:");
        System.out.println("------------------");
        System.out.println(mascota);
        System.out.println("------------------");

        comida.usarItem(mascota, comida);
        System.out.println(mascota);

        medicina.usarItem(mascota, medicina);
        System.out.println(mascota);

        juguete.usarItem(mascota, juguete);
        System.out.println(mascota);
        //Se aplicara el metodo dormir
        mascota.dormir();
        System.out.println(mascota);
    }


}






public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la mascota con el nombre "Garfield"
        Mascota mascota = new Mascota("Garfield");
        


        //instanccia de las clases de item : jugete, comida, medicina
        Juguete pelota = new Juguete(1, "Pelota", 4);
        Comida queso = new Comida(2, "Queso", 5);
        Comida pan = new Comida(3, "Pan", 3);
        Medicina jarabe = new Medicina(4, "Jarabe", 4);

        //Apllicar cada item de la mascota
        System.out.println("Atributos Iniciales:");
        System.out.println("------------------");
        System.out.println(mascota);
        System.out.println("------------------");

        Inventario inventario = new Inventario();
        inventario.agregarItem(pelota);
        inventario.agregarItem(queso);
        inventario.agregarItem(pan);
        inventario.agregarItem(jarabe);

        inventario.mostrarInventario();

        Medicina clona = new Medicina(5, "clona", 2);
        System.out.println(mascota);

        inventario.agregarItem(clona);
        inventario.usarItem_Inventario(mascota, 1);

        inventario.mostrarInventario();

        System.out.println(mascota);
        

        //System.out.println();

        /* System.out.println(juguete.getCantidad());
        System.out.println(comida.getCantidad());
        System.out.println(medicina.getCantidad());

        inventario.usarItem(1);
        inventario.usarItem(3);
        inventario.usarItem(4);

        System.out.println(juguete.getCantidad());
        System.out.println(comida.getCantidad());
        System.out.println(medicina.getCantidad()); */



        /* comida.usarItem(mascota, comida);
        System.out.println(mascota);

        medicina.usarItem(mascota, medicina);
        System.out.println(mascota);

        juguete.usarItem(mascota, juguete);
        System.out.println(mascota);

        mascota.dormir();
        System.out.println(mascota); */
    }


}






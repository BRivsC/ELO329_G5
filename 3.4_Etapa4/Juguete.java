public class Juguete extends Item {
    // Constructor de juguete
    //  id, el cual se utilizará para poder acceder a cada ítem.
    //  cantidad, correspondiente a la cantidad de elementos existente para dicho elemento.
    //  nombre, correspondiente al nombre de dicho ítem.
    public Juguete(int id, String nombre, int cantidad) {
        super(id, nombre, cantidad);
    }
    
    // Método abstracto para definir sus efectos
    // Efectos del juguete: +30 felicidad
    public void usarItem(Mascota mascota, Item item){
        // + 30 Felicidad
        System.out.println("Usando Juguete " + item.getNombre() + "...");
        mascota.actualizarFelicidad(30);
        
    }
}
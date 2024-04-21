public class Medicina extends Item {
    // Constructor de medicina
    //  id, el cual se utilizará para poder acceder a cada ítem.
    //  cantidad, correspondiente a la cantidad de elementos existente para dicho elemento.
    //  nombre, correspondiente al nombre de dicho ítem.
    public Medicina(int id, String nombre, int cantidad) {
        super(id, nombre, cantidad);
    }

    // Método abstracto para definir sus efectos
    // Efectos de la medicina: +40 Salud
    public void usarItem(Mascota mascota, Item item){
        // +40 Salud
        System.out.println("\nAplicando medicamento " + item.getNombre() + "...");
        mascota.actualizarSalud(40);
        
    }
}


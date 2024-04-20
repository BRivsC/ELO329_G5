public class Comida extends Item {
    // Constructor de comida
    //  id, el cual se utilizará para poder acceder a cada ítem.
    //cantidad, correspondiente a la cantidad de elementos existente para dicho elemento.
    //nombre, correspondiente al nombre de dicho ítem.
    public Comida(int id, String nombre, int cantidad) {
        super(id, nombre, cantidad);
    }
    
    // Método abstracto para definir sus efectos
    // Efectos de la comida: +20 energía, +20 salud
    public void usarItem(Mascota mascota, Item item){
        // + 20 Energía
        int nuevaEnergia = mascota.getEnergia();
        nuevaEnergia+=20;
        mascota.setEnergia(nuevaEnergia);

        // + 20 Salud
        int nuevaSalud = mascota.getSalud();
        nuevaSalud+=20;
        mascota.setSalud(nuevaSalud);
        
    }
}

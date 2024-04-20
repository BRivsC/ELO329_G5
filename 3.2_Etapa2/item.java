public abstract class Item {
    private int id;
    private String nombre;
    private int cantidad;

    public Item(int id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Método abstracto para aplicar el efecto a la mascota
    // Dentro de cada subclase se pueden definir sus efectos sobre la mascota
    public abstract void usarItem(Mascota mascota, Item item);

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

// class Alimento extends Item
// {
//     public Alimento(int id, String nombre, int cantidad) {
//         super(id, nombre, cantidad);
//     }

//     public void usarItem(Mascota.getEnergia){
        

//     }
// }

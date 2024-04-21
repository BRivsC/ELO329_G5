import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    private ArrayList<Item> items;  //Se define que el inventario tendrá un Array de Item

    public Inventario() {
        this.items = new ArrayList<>();  //Se define un nuevo array vacío
    }

    public void agregarItem(Item item) {  //Se agregan los Item definidos previamente en el main
        items.add(item);

    }


    public int existeItem(int id_in){
        for (Item item : items){
            if (item.getId() == id_in){
                return 1;
            }
        }
        return 0;
    }

    public void usarItem_Inventario(Mascota mascota, int id) {  //Método usarItem, recorre la lista de Item y si el ID coincide con el entregado, se consume un Item
        Iterator<Item> iterator = items.iterator();             
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getId() == id){
                item.consumir();
                item.usarItem(mascota, item);
                 if (item.getCantidad() == 0){
                    iterator.remove();
                 }

            }
        }
    
    }

    public void borrarItem(Item item){
        items.remove(item); 
    }


    public void mostrarInventario(){
        for (Item item : items) {
            System.out.println((item.getId()) + ": " + item.getNombre() + ", cantidad " + item.getCantidad());
        }
    }
}


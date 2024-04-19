public class Mascota {

    private String nombre; // nombre mascota 
    private float edad; // en unidades de tiempo de simulación
    private int salud; // toma valores entre 0 y 100 puntos
    private int energia; // toma valores entre 0 y 100 puntos
    private int felicidad; // toma valores entre 0 y 100 puntos
    private Estado estado; // toma valores entre 0 y 100 puntos
    
        public Mascota(String nombre) {
            this.nombre = nombre;
            this.edad = 0.0f;
            this.salud = 100;
            this.energia = 100;
            this.felicidad = 50;
            this.estado = Estado.MEH;
        }


        @Override
        public String toString(){
            String estadoString;
            switch (estado){
                case MEH:
                    estadoString = "(-__-) Meh....";
                   break;
                case WEEEH:
                    estadoString = "\\(^_^)/ Weeeeeh!";
                    break;
                case SNIF:
                    estadoString = "(._.) snif....";
                    break;
                case HAMBRE:
                    estadoString = "(OoO) hambre hambre!";
                    break;
                case GRRRR:
                    estadoString = "(ôwô) grrrr....";
                    break;
                case CANSADO:
                    estadoString = "(=_=) zzzz....";
                    break;
                case MUERTO:
                    estadoString = "(x.x) fin del juego";
                    break;
                default:
                    estadoString = "Estado desconocido";
                    break;
            }
            return "Mascota Virtual" +
                    "\n" +
                    "\nAtributos" +
                    "\n---------" +
                    "\nnombre = " + nombre +
                    "\nedad = " + edad +
                    "\nsalud = " + salud +
                    "\nenergia = " + energia +
                    "\nfelicidad = " + felicidad +
                    "\nestado = " + estadoString +
                    "\n";
        }
}
    
    
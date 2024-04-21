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
    
        // Getters y setters
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public float getEdad() {
            return edad;
        }
    
        public void setEdad(float edad) {
            this.edad = edad;
        }
    
        public int getSalud() {
            return salud;
        }
    
        public void setSalud(int salud) {
            this.salud = salud;
        }
    
        public int getEnergia() {
            return energia;
        }
    
        public void setEnergia(int energia) {
            this.energia = energia;
        }
    
        public int getFelicidad() {
            return felicidad;
        }
    
        public void setFelicidad(int felicidad) {
            this.felicidad = felicidad;
        }
    
        public Estado getEstado() {
            return estado;
        }
    
        public void setEstado(Estado estado) {
            this.estado = estado;
        }
    
        // Métodos para actualizar los indicadores
    
        public void actualizarSalud(int deltaSalud) {
            
            salud = salud + deltaSalud;
            if(salud > 100){
                salud = 100;
            }
            else if(salud < 0){
                salud = 0;
            }
            actualizarEstado();
        }
    
        public void actualizarEnergia(int deltaEnergia) {
            energia = energia + deltaEnergia;
            if(energia > 100){
                energia = 100;
            }
            else if(energia < 0){
                energia = 0;
            }
            actualizarEstado();
        }
    
        public void actualizarFelicidad(int deltaFelicidad) {
            felicidad = felicidad + deltaFelicidad;
            if(felicidad > 100){
                felicidad = 100;
            }
            else if(felicidad < 0){
                felicidad = 0;
            }
            actualizarEstado();
        }

        public void actualizarEdad(float deltaEdad) {
            edad = edad + deltaEdad;
            if(edad > 15){
                edad = 15;
            }
            actualizarEstado();
        }


        public void envejecer(float tiempoIncremento){
            actualizarSalud(-5);
            actualizarEnergia(-5);
            actualizarFelicidad(-5);
            actualizarEdad( tiempoIncremento );
        }
    
        // Método para actualizar el estado
    
        private void actualizarEstado() {
            if ( edad >= 15 || salud <= 0  || energia <= 0){
                estado = Estado.MUERTO;
            } else if (felicidad >= 60) {
                estado = Estado.WEEEH;
            } else if (felicidad <= 20) {
                estado = Estado.SNIF;
            } else if (salud <= 20 && edad <= 5) {
                estado = Estado.HAMBRE;
            } else if (salud <= 50 && edad > 5 && energia <= 30) {
                estado = Estado.GRRRR;
            } else if (energia <= 15) {
                estado = Estado.CANSADO;
            } else {
                estado = Estado.MEH;
            }
        }
    
        // Método para dormir
    
        public void dormir() {
            System.out.println(nombre + " ha dormido como un tronco!");
            energia = 100;
            actualizarSalud(15);
            actualizarFelicidad(15);
            actualizarEstado();
        }
    
        // Método para mostrar información de la mascota
    
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
            return  "\nAtributos" +
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
    

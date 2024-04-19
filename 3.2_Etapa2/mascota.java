javpublic class Mascota {

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
            salud = Math.max(0, salud + deltaSalud);
            actualizarEstado();
        }
    
        public void actualizarEnergia(int deltaEnergia) {
            energia = Math.max(0, energia + deltaEnergia);
            actualizarEstado();
        }
    
        public void actualizarFelicidad(int deltaFelicidad) {
            felicidad = Math.max(0, felicidad + deltaFelicidad);
            actualizarEstado();
        }
    
        // Método para actualizar el estado
    
        private void actualizarEstado() {
            if (edad <= 5 && salud <= 10) {
                felicidad -= 20;
            } else if (edad <= 10 && salud <= 50) {
                felicidad -= 20;
                energia -= 10;
            } else if (salud <= 50) {
                felicidad -= 30;
                energia -= 20;
            }
    
            if (felicidad >= 60) {
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
            energia = 100;
            salud += 15;
            felicidad += 15;
            actualizarEstado();
        }
    
        // Método para mostrar información de la mascota
    
        public String toString() {
            return "Mascota{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", salud=" + salud +
                    ", energia=" + energia +
                    ", felicidad=" + felicidad +
                    ", estado=" + estado +
                    '}';
        }
    }
    
package ejercicio;

public class Persona {
    
    int edad; 
    String nombre;
    int telefono;

    public Persona() {
    }

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("edad=").append(edad);
        sb.append(", nombre=").append(nombre);
        sb.append(", teléfono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}


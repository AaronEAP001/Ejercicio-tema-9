package ejercicio;

public class Trabajador extends Persona{
    
    Double salario;

    public Trabajador() {
    }

    public Trabajador(Double salario, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Super( "+super.toString()+", Trabajador{" + "credito=" + getSalario() + "} )";
    }
    
}

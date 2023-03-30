package ejercicio;

public class Cliente extends Persona{
    
    Double credito;

    public Cliente(Double credito, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Super( "+super.toString()+", Cliente{" + "credito=" + credito + "} )";
    }

    
}

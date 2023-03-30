package ejercicio;

public class main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente(1500.3, 23, "Maria", 934782346);
        System.out.println(c1.toString());
        
        Trabajador t1 = new Trabajador(2330.98, 25, "Mario", 934132540);
        System.out.println(t1.toString());
        
    }
}

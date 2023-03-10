// Clase Secretario
public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void imprimir() {
        System.out.println("Secretario:");
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Fax: " + fax);
    }

    public void incrementarSalario() {
        super.incrementarSalario(0.05);
    }
}


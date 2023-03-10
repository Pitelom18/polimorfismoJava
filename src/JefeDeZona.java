import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    private Secretario secretario;
    private ArrayList<Vendedor> listaDeVendedores;
    private Coche coche;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.listaDeVendedores = new ArrayList<>();
    }

    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    public void darDeAltaVendedor(Vendedor vendedor) {
        this.listaDeVendedores.add(vendedor);
    }

    public void darDeBajaVendedor(Vendedor vendedor) {
        this.listaDeVendedores.remove(vendedor);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de zona");
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public ArrayList<Vendedor> getListaDeVendedores() {
        return listaDeVendedores;
    }

    public Coche getCoche() {
        return coche;
    }

    public void incrementarSalario() {
        super.incrementarSalario(1.2);
    }
}


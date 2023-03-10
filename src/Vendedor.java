import java.util.ArrayList;

public class Vendedor extends Empleado {
    private String cocheMatricula;
    private String cocheMarca;
    private String cocheModelo;
    private String telefonoMovil;
    private String areaVenta;
    private ArrayList<String> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String cocheMatricula, String cocheMarca, String cocheModelo, String telefonoMovil, String areaVenta, double comision) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.cocheMatricula = cocheMatricula;
        this.cocheMarca = cocheMarca;
        this.cocheModelo = cocheModelo;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.clientes = new ArrayList<>();
        this.comision = comision;
    }

    public void darDeAltaCliente(String nombreCliente) {
        clientes.add(nombreCliente);
        System.out.println("Cliente " + nombreCliente + " añadido con éxito.");
    }

    public void darDeBajaCliente(String nombreCliente) {
        if (clientes.contains(nombreCliente)) {
            clientes.remove(nombreCliente);
            System.out.println("Cliente " + nombreCliente + " eliminado con éxito.");
        } else {
            System.out.println("Cliente " + nombreCliente + " no encontrado.");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Vendedor:");
        super.imprimir();
        System.out.println("Coche Matrícula: " + cocheMatricula);
        System.out.println("Coche Marca: " + cocheMarca);
        System.out.println("Coche Modelo: " + cocheModelo);
    }
}




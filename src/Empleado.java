
public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int antiguedad;
    private String telefono;
    public double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
        System.out.println("Antigüedad: " + antiguedad);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.nombre);
        }
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void incrementarSalario(double porcentaje) {
        salario *= (1 + porcentaje);
    }
}





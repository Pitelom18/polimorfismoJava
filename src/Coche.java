public class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}


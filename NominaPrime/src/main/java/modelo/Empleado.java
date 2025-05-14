package modelo;

public class Empleado extends Persona {
    private double salarioBasico;
    private int dias;
    private int edad;

    public Empleado() {
        // Constructor por defecto
    }

    // Constructor principal con todos los atributos
    public Empleado(String nombre, String id, int edad, double salarioBasico, int dias) {
        super(id, nombre);
        this.edad = edad;
        this.salarioBasico = salarioBasico;
        this.dias = dias;
    }

    // Constructor auxiliar para solo ID y nombre
    public Empleado(String id, String nombre) {
        super(id, nombre);
    }

    // Getters y Setters
    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Empleado [salarioBasico=" + salarioBasico +
               ", dias=" + dias +
               ", edad=" + edad + "]";
    }
}

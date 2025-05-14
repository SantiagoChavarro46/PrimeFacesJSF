package modelo;

public class Nomina extends Empleado {

    public Nomina(String nombre, String id, int edad, double salarioBasico, int dias) {
        super(nombre, id, edad, salarioBasico, dias);
    }

    public double getAuxilioTransporte() {
        final double SALARIO_MINIMO = 1300606;
        final double AUXILIO_TRANSPORTE = 162000;

        if (getSalarioBasico() <= 2 * SALARIO_MINIMO) {
            return (AUXILIO_TRANSPORTE / 30) * getDias();
        } else {
            return 0.0;
        }
    }

    public double getSalud() {
        final double PORCENTAJE_SALUD = 0.04;
        final double SALARIO_MINIMO = 1300606;
        final double MAX_BASE = 25 * SALARIO_MINIMO;

        double base = Math.min(getSalarioBasico(), MAX_BASE);
        return base * PORCENTAJE_SALUD;
    }

    public double getPension() {
        final double PORCENTAJE_PENSION = 0.04;
        final double SALARIO_MINIMO = 1300606;
        final double MAX_BASE = 25 * SALARIO_MINIMO;

        if (getEdad() > 65) {
            return 0.0;
        }

        double base = Math.min(getSalarioBasico(), MAX_BASE);
        return base * PORCENTAJE_PENSION;
    }

    public double calcularSalario() {
        return getSalarioBasico() + getAuxilioTransporte() - getSalud() - getPension();
    }
}

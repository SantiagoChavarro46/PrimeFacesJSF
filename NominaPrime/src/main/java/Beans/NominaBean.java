package Beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import modelo.Empleado;
import modelo.Nomina;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class NominaBean implements Serializable {

    private String nombre;
    private String id;
    private int edad;
    private double salarioBasico;
    private int dias;

    private Empleado empleado;
    private Nomina nomina;
    private double salarioTotal;
    private String error;

    private List<Nomina> historialNominas = new ArrayList<>();

    public String calcular() {
        try {
            empleado = new Empleado(nombre, id, edad, salarioBasico, dias);
            nomina = new Nomina(nombre, id, edad, salarioBasico, dias); // constructor corregido
            salarioTotal = nomina.calcularSalario();
            historialNominas.add(nomina);
            error = null; // Limpiar mensaje de error
            return "resultado?faces-redirect=true";
        } catch (Exception e) {
            error = "Error al procesar los datos. Verifique la información ingresada.";
            return null;
        }
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Nomina> getHistorialNominas() {
        return historialNominas;
    }

    public void setHistorialNominas(List<Nomina> historialNominas) {
        this.historialNominas = historialNominas;
    }
}

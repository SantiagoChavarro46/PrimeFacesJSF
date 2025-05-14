package modelo;

public class Persona {
    private String nombre;
    private String id;

    public Persona() {
        // Constructor por defecto
    }

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
}

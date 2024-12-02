package Semana_03.arquitecturaJava;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        super();    // Con super()
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

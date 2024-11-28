package Semana_03;

public class Persona {

    private String nombre;
    private String pais;
    private int edad;

    public Persona() {

    }

    // Getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Saludar(){
        System.out.println("Hola");
    }

    public void Comer(){
        System.out.println("Comer");
    }

    public void Cantar(){
        System.out.println("Cantar");
    }

}

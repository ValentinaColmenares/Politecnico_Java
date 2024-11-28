package Semana_03;

public class Perro {

    final private String raza = "Perro";
    private String nombre;
    private int edad;
    private String encargada;

    public Perro() {

    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, int edad, String encargada){
        this.nombre = nombre;
        this.edad = edad;
        this.encargada = encargada;
    }

    public void ladrar(){
        System.out.println("Gau!, gau!");
    }

    public void pasear(){
        System.out.println("Ir al parque");
    }

    // Getters y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEncargada(String encargada) {
        this.encargada = encargada;
    }

    public String getEncargada() {
        return encargada;
    }

    public String getRaza() {
        return raza;
    }

}

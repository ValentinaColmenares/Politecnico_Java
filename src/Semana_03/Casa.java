package Semana_03;

public class Casa {

    private String color;
    private int cuartos;
    private int habitantes;
    private String ciudad;
    private int precio;
    private String propietario;

    public Casa() {
        this.ciudad = "Medellin";
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void pintarDeBlanco(){
        color = "Blanco";
    }

    public void cambiarPropietario(String propietario){
        this.propietario = propietario;
    }

    public void mostrarCiudad(){
        System.out.println("La ciudad es: " + ciudad);
    }

    public int aumentarPrecio(int precio){
        return this.precio += precio;
    }

    public int cantidadDeCuartosPorHabitante(){
        return cuartos/habitantes;
    }

    public int valorCasa(){
        return precio;
    }

}

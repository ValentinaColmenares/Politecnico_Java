package Semana_03.EjerciciosClasesAtributosConstructores.EjercicioCiudad;

public class Ciudad {

    private String nombre;
    private int poblacion;
    private String pais;
    private String presidente;

    public Ciudad() {
    }

    public Ciudad(String nombre, String pais, int poblacion, String presidente) {
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
        this.presidente = presidente;
    }

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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
}

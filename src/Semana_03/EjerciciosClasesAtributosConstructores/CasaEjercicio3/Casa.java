package Semana_03.EjerciciosClasesAtributosConstructores.CasaEjercicio3;

public class Casa {

    private String ciudad;
    private String barrio;
    private String color;
    private int habitaciones;
    private int pisos;
    private int banos;
    private int cocinas;

    public Casa(String ciudad, String barrio, String color) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    public Casa(String barrio, String color, int pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public Casa(int pisos, int habitaciones, int banos, int cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
    }

    public int getBanos() {
        return banos;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCocinas() {
        return cocinas;
    }

    public String getColor() {
        return color;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getPisos() {
        return pisos;
    }
}

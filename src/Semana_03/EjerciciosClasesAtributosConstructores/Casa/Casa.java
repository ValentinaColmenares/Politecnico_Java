package Semana_03.EjerciciosClasesAtributosConstructores.Casa;

public class Casa {

    final private String ciudad = "Medellin";
    final private String barrio = "Belen";
    final private String color = "Azul";
    final private int habitaciones = 5;
    final private int pisos = 3;
    final private int banos = 2;
    final private int cocinas = 1;

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

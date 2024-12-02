package Semana_03.EjerciciosClasesAtributosConstructores.CasaEjercicio3;

public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa("Cali","Aguablanca","Verde");
        Casa casa2 = new Casa("Alameda","Blanco",2);
        Casa casa3 = new Casa(4,6,4,3);

        System.out.println("Casa 1 ------------");
        System.out.println("Ciudad: " + casa1.getCiudad());
        System.out.println("Barrio: " + casa1.getBarrio());
        System.out.println("Color: " + casa1.getColor());
        System.out.println();

        System.out.println("Casa 2 ------------");
        System.out.println("Barrio: " + casa2.getBarrio());
        System.out.println("Color: " + casa2.getColor());
        System.out.println("Pisos: " + casa2.getPisos());
        System.out.println();

        System.out.println("Casa 3 ------------");
        System.out.println("Pisos: " + casa3.getPisos());
        System.out.println("Habitaciones: " + casa3.getHabitaciones());
        System.out.println("Baños: " + casa3.getBanos());
        System.out.println("Cocinas: " + casa3.getCocinas());

    }
}

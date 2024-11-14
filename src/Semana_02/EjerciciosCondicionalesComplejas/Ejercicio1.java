package Semana_02.EjerciciosCondicionalesComplejas;

public class Ejercicio1 {
    public static void main(String[] args) {

        int edad = 9;

        if (edad >= 0 && edad <= 5){
            System.out.println("Pertenece a la categoría Infante.");
        } else if (edad >= 6 && edad <= 10){
            System.out.println("Pertenece a la categoría Niño.");
        } else if (edad >= 11 && edad <= 15){
            System.out.println("Pertenece a la categoría Pre adolescente.");
        } else if (edad >= 16 && edad <= 18){
            System.out.println("Pertenece a la categoría Adolescente.");
        } else if (edad >= 19 && edad <= 25){
            System.out.println("Pertenece a la categoría Pre adulto.");
        } else if (edad >= 26 && edad <= 40){
            System.out.println("Pertenece a la categoría Adulto.");
        } else if (edad >= 41 && edad <= 55){
            System.out.println("Pertenece a la categoría Pre anciano.");
        } else if (edad >= 56){
            System.out.println("Pertenece a la categoría Anciano.");
        }

    }
}

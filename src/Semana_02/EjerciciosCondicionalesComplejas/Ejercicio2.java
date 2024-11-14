package Semana_02.EjerciciosCondicionalesComplejas;

public class Ejercicio2 {
    public static void main(String[] args) {

        int x = 214;
        int cifras = (int) Math.log10(x) + 1;

        if (cifras <= 4){
            System.out.println("El número tiene " + cifras + " cifras.");
        } else {
            System.out.println("El número supera las 4 cifras.");
        }

    }
}

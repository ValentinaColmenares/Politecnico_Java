package Semana_02.EjerciciosCondicionalesSimples;

public class Ejercicio1 {
    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100);

        if (aleatorio < 50){
            System.out.println("El número " + aleatorio + " es menor a 50.");
        } else {
            System.out.println("El número " + aleatorio + " es mayor a 50.");
        }

    }
}

package Semana_02.EjerciciosCondicionalesSimples;

public class Ejercicio5 {
    public static void main(String[] args) {

        double nota = 6.9;

        if (nota >= 7 && nota <= 10){
            System.out.println("¡Aprobó!");
        } else if (nota >= 0 && nota < 7) {
            System.out.println("Reprobó :(");
        }

    }
}

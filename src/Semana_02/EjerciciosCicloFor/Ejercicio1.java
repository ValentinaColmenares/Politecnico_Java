package Semana_02.EjerciciosCicloFor;

public class Ejercicio1 {
    public static void main(String[] args) {

        int num = 6;
        int factorial = 1;

        for (int i = num; i > 1; i--){
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}

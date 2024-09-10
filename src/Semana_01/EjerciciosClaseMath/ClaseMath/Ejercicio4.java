package Semana_01.EjerciciosClaseMath.ClaseMath;

public class Ejercicio4 {
    public static void main(String[] args) {

        double num1 = (Math.random() * 50) + 1;
        double num2 = (Math.random() * 50) + 1;
        num1 = Math.round(num1);
        num2 = Math.floor(num2);
        double mayor = Math.max(num1, num2);
        System.out.println("El número mayor es: " + mayor);

    }
}

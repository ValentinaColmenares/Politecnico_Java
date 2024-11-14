package Semana_02.EjerciciosCondicionalesComplejas;

public class Ejercicio3 {
    public static void main(String[] args) {

        int num1 = 48;
        int num2 = 928;
        int num3 = 814;
        int mayor = num1;

        if (num2 > mayor){
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

    }
}

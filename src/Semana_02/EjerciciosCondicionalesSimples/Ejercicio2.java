package Semana_02.EjerciciosCondicionalesSimples;

public class Ejercicio2 {
    public static void main(String[] args) {

        int num1 = 3, num2 = 9, mayor, menor;

        if(num1 > num2){
            mayor = num1;
            menor = num2;
        } else{
            mayor = num2;
            menor = num1;
        }

        System.out.println("Potencia: " + Math.pow(mayor, menor));

    }
}

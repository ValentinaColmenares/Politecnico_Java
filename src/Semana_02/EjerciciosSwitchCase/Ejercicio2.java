package Semana_02.EjerciciosSwitchCase;

public class Ejercicio2 {
    public static void main(String[] args) {

        double num1 = 8;
        double num2 = 3;
        char operacion = '+';
        double resultado = 0;

        switch(operacion){
            case('+'):
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case('-'):
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            case('*'):
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case('/'):
                resultado = num1 / num2;
                System.out.println("La división es: " + resultado);
                break;
            case('%'):
                resultado = num1 % num2;
                System.out.println("El módulo es: " + resultado);
                break;
            default:
                System.out.println("La operación no es válida");
        }

    }
}

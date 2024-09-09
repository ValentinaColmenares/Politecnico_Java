package Semana_01;

public class Ejercicios_Modulo1 {
    public static void main(String[] args) {

        // 1.  Con base en dos números enteros, realiza las cinco operaciones
        // básicas vistas hasta el momento y muestra el resultado.
        int num1 = 12;
        int num2 = 2;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado del producto es: "+producto);
        System.out.println("El resultado de la division es: "+division);
        System.out.println("El resultado del modulo es: "+modulo);

        // 2. Crea una operación utilizando números enteros y los símbolos
        // aritméticos.

        double operacion = 9/3*5-3+8*2;
        System.out.println("El resultado de la operación es: "+operacion);
    }
}

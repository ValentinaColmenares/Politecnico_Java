package Semana_02.EjerciciosCicloFor;

public class Ejercicio4 {
    public static void main(String[] args) {

        int num = 2;
        int suma = 0;
        int factorial = 1;
        int divisores = 0;

        for(int i = 0; i <= num; i++){
            suma += i;
        }

        System.out.println("La raíz cuadrada es: " + Math.sqrt(suma));
        System.out.println("Número aleatorio: " + Math.random() * suma);
        System.out.println("Sumatoria de la iteraciones: " + suma);
        System.out.print("Divisores ");

        for (int i = 1; i <= (suma/2); i++){
            if(suma % i == 0){
                System.out.print(i + " ");
                divisores += i;
            }
        }

        System.out.println(suma);

        for(int i = suma; i > 1; i--){
            factorial *= i;
        }

        System.out.println("El factorial es: " + factorial);

        if(divisores == suma){
            System.out.println("El número " + suma + " es perfecto");
        }else{
            System.out.println("El número " + suma + " no es perfecto");
        }

    }
}

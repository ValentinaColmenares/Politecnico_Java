package Semana_02.EjerciciosCicloFor;

public class Ejercicio3 {
    public static void main(String[] args) {

        int num = 2821;
        int sum = 0;

        for (int i = 1; i <= (num/2); i++){

            if(num % i == 0){
                sum += i;
            }

        }

        if(sum == num){
            System.out.println("El número " + num + " es perfecto.");
        }else{
            System.out.println("El número " + num + " no es perfecto.");
        }

    }
}

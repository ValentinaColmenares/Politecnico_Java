package Semana_02.EjerciciosCicloFor;

public class Ejercicio2 {
    public static void main(String[] args) {

        int num = 54;

        for (int i = 1; i <= (num/2); i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }

        System.out.print(num);

    }
}

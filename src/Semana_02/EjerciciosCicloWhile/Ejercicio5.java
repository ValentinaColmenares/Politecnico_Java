package Semana_02.EjerciciosCicloWhile;

// Generar un número random de 1 al 100 y encontrar un número perfecto siguiente al número generado.

public class Ejercicio5 {
    public static void main(String[] args) {

        int numRandom = (int)(Math.random() * 100);
        int divisores = 0;
        boolean flag = false;

        // En caso de que el número generado sea 0, sumar 1 unidad
        numRandom = numRandom == 0 ? numRandom + 1 : numRandom;

        System.out.println("El número generado es: " + numRandom);
        while(!flag){
            for (int i = 1; i <= (numRandom/2); i++){
                if(numRandom % i == 0){
                    divisores += i;
                }
            }
            if (divisores == numRandom){
                System.out.println("El número perfecto es: " + numRandom);
                flag = true;
            }else{
                numRandom++;
                divisores = 0;
            }
        }

    }
}

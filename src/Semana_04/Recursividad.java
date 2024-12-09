package Semana_04;

// Tema 5: Recursividad

public class Recursividad {

    // Ejercicio de factorial

    public int factorial(int numero){
        if ((numero <= 1)){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }

}

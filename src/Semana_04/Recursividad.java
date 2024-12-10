package Semana_04;

// Tema 5: Recursividad

public class Recursividad {

    // Ejercicio de factorial

    public int factorial(int numero){
        if (numero == 1){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }

    public int sumatoria(int numero){
        if (numero <= 1){
            return 1;
        }else{
            return numero + sumatoria(numero - 1);
        }
    }

    public void recorrerArray(int[] array, int indice){
        if(indice != array.length){
            System.out.print(array[indice] + " ");
            recorrerArray(array,indice+1);
        }
    }

    public void buscarElementoEnArray(int[] array, int indice, int numero){
        if(indice == array.length || array[indice] == numero){
            if (indice == array.length){
                System.out.println("No encontré el elemento");
            }else {
                System.out.println("Encontré el número: " + numero + " en la posicion " + indice);
            }
        }else{
            buscarElementoEnArray(array,indice+1, numero);
        }
    }

    public void recorrerMatrizRecursivo(int[][] matriz, int i, int j){
        System.out.print(matriz[i][j] + " ");
        if (i != matriz.length - 1 || j != matriz[i].length - 1) {
            if (j == matriz[i].length - 1) {
                i++;
                j = 0;
                System.out.println("");
            } else {
                j++;
            }
            recorrerMatrizRecursivo(matriz, i, j);
        }
    }

    public int fibonacciHastaPosicion(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciHastaPosicion(n - 1) + fibonacciHastaPosicion(n - 2);
        }
    }

}

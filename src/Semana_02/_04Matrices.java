package Semana_02;

// Tema 4: Matrices

public class _04Matrices {
    public static void main(String[] args) {

        //Forma 1:
        int matrizNumeros1[][] = new int[4][5];
        //Forma 2:
        int [][]matrizNumeros2 = new int[4][5];
        //Forma 3:
        int[][] matrizNumeros3 = new int[4][5];
        //Forma 4:
        int matrizNumeros4[][];
        //Forma 5:
        int matrizNumeros5[][] = {};
        //Forma 6:
        int matrizNumeros6[][] = {{1,2},{3,9}};
        //Forma 7:
        int matrizNumeros7[][] = new int[][]{{6,2},{2,7}};

        // Recorrido de matriz

        int edades[][] = {{19,18,16},{15,14,12},{12,11,18}};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(edades[i][j] + " ");
            }
            System.out.println("");
        }

        // Almacenar números del 0 al 100 en matriz 5*4. Suma, resta,
        // multiplicación, raíz cuadrada de la suma, división de la
        // multiplicación por la suma

        int suma = 0, resta = 0;
        int multiplicacion = 1;
        double division;
        double raiz;
        int matriz[][] = new int[5][4];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = (int) Math.ceil(Math.random()*100);
                suma += matriz[i][j];
                resta -= matriz[i][j];
                multiplicacion *= matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        division = multiplicacion/suma;
        raiz = Math.sqrt(suma);

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("La raíz cuadrada es: " + raiz);

    }
}

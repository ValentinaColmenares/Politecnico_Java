package Semana_02.EjerciciosMatrices;

public class Ejercicio3 {
    public static void main(String[] args) {

        int n = 3, m = 4;
        int matriz[][] = new int[n][m];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = (int) (Math.random()*30);
            }
        }

        System.out.println("Matriz:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Primera fila:");
        for (int i = 0; i < m; i++){
            System.out.print(" " + matriz[0][i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Segunda columna:");
        for(int i = 0; i < n; i++){
            System.out.println(matriz[i][1]);
        }
        System.out.println();
        System.out.print("Tercera fila:");
        for (int i = 0; i < m; i++){
            System.out.print(" " + matriz[2][i]);
        }

    }
}

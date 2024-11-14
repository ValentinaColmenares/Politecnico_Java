package Semana_02.EjerciciosMatrices;

public class Ejercicio2 {
    public static void main(String[] args) {

        int n = 5, m = 3;
        int matriz[][] = new int[n][m];
        int mayor = 0;

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = (int) (Math.random()*50);
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("El número mayor en la matriz es: " + mayor);

    }
}

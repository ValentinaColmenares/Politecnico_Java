package Semana_02.EjerciciosMatrices;

public class Ejercicio1 {
    public static void main(String[] args) {

        int n = 3, m = 4;
        int matrizUno[][] = new int[n][m];
        int matrizDos[][] = new int[n][m];
        int matrizTres[][] = new int[n][m];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrizUno[i][j] = (int) (Math.random()*100);
                if ((matrizUno[i][j] % 2) != 0){
                    matrizUno[i][j]++;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrizDos[i][j] = (int) (Math.random()*50);
                if (matrizDos[i][j] != 50 && ((matrizDos[i][j] % 2) == 0)){
                    matrizDos[i][j]++;
                } else if (matrizDos[i][j] == 50) {
                    matrizDos[i][j]--;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrizTres[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        System.out.println("Matriz A:");
        System.out.println();

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrizUno[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matriz B:");
        System.out.println();

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrizDos[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Suma:");
        System.out.println();

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrizTres[i][j] + " ");
            }
            System.out.println();
        }

    }
}

package Semana_02.EjerciciosVectores;

public class Ejercicio2 {
    public static void main(String[] args) {

        double grupoA[] = {10,9,5,3,8,7,10,7,10,9};
        double grupoB[] = {1,10,8,2,9,6,6,7,10,10};
        double promedioA = 0, promedioB = 0, promedioAB = 0;


        for (int i = 0; i < grupoA.length; i++){
            promedioA += grupoA[i];
            promedioB += grupoB[i];
        }

        promedioA /= grupoA.length;
        promedioB /= grupoB.length;
        promedioAB = (promedioA + promedioB) / 2;

        System.out.println("El promedio general de A es: " + promedioA);
        System.out.println("El promedio general de B es: " + promedioB);
        System.out.println("El promedio general de ambos grupos es: " + promedioAB);

        if (promedioA > promedioB){
            System.out.println("El grupo con mejor promedio es el A");
        }else{
            System.out.println("El grupo con mejor promedio es el B");
        }




    }
}

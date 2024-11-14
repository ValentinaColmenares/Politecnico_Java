package Semana_02.EjerciciosVectores;

public class Ejercicio1 {
    public static void main(String[] args) {

        float peso[] = {85.3f,95.8f,62.4f,47.9f,87.0f};
        float promedio = 0;
        int superior = 0, inferior = 0;

        for (int i = 0; i < peso.length; i++){
            promedio += peso[i];
        }

        promedio /= peso.length;

        for (int i = 0; i < peso.length; i++){
            if(peso[i] > promedio){
                superior++;
            } else if (peso[i] < promedio) {
                inferior++;
            }
        }

        System.out.println("El promedio es: " + promedio);
        System.out.println("El número de personas que superan el promedio es: " + superior);
        System.out.println("El número de personas inferiores al promedio es: " + inferior);

    }
}

package Semana_02.EjerciciosCondicionalesComplejas;

public class Ejercicio4 {
    public static void main(String[] args) {

        int preguntas = 10, correctas = 9;
        double porcentaje = (correctas * 100) / preguntas;

        if (porcentaje >= 90){
            System.out.println("El postulante tiene Nivel máximo.");
        } else if (porcentaje >= 75 && porcentaje < 90) {
            System.out.println("El postulante tiene Nivel medio.");
        } else if (porcentaje >= 50 && porcentaje < 75) {
            System.out.println("El postulante tiene Nivel regular.");
        } else {
            System.out.println("El postulante está Fuera de nivel.");
        }


    }
}

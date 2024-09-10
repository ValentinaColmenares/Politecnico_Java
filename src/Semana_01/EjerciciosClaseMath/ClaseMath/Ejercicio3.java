package Semana_01.EjerciciosClaseMath.ClaseMath;

public class Ejercicio3 {
    public static void main(String[] args) {

        double nota1 = Math.random()*10;
        double nota2 = Math.random()*10;
        double nota3 = Math.random()*10;
        double nota4 = Math.random()*10;
        double nota5 = Math.random()*10;
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("El promedio es: " + promedio);

    }
}

package Semana_01.EjerciciosOperadores;

public class Ejercicio6 {
    public static void main(String[] args) {

        int ladoCuadrado = 8;
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = ladoCuadrado * 4;

        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2.0;
        double perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;

        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = (baseRectangulo * 2) + (alturaRectangulo * 2);

        System.out.println("El area del cuadrado es: " + areaCuadrado);
        System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
        System.out.println("El area del triangulo es: " + areaTriangulo);
        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
        System.out.println("El area del rectangulo es: " + areaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);

    }
}

package Semana_01.EjerciciosOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {

        int numeroUno = 8;
        int numeroDos = 2;
        int aux = numeroDos;
        numeroDos = numeroUno;
        numeroUno = aux;
        System.out.println("El número 1 es: " + numeroUno);
        System.out.println("El número 2 es: " + numeroDos);

    }
}

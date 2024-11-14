package Semana_02.EjerciciosCicloWhile;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contador = 1, serie = 11;

        while(contador < 25){
            System.out.print(serie + " - ");
            serie += 11;
            contador++;
        }
        System.out.println(serie);
    }
}

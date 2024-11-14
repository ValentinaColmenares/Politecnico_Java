package Semana_02.EjerciciosCicloWhile;

public class Ejercicio1 {
    public static void main(String[] args) {

        String palabra = "Programación";
        String invertida = "";
        int aux = palabra.length() - 1;

        while (aux >= 0){
            invertida += palabra.charAt(aux);
            aux--;
        }

        System.out.println(invertida);
    }
}

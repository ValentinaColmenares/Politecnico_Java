package Semana_02.EjerciciosCicloWhile;

public class Ejercicio2 {
    public static void main(String[] args) {

        String palabra = "anikna";
        int aux1 = 0;
        int aux2 = palabra.length() - 1;
        while (aux1 < (palabra.length()/2)){
            if(palabra.charAt(aux1) != palabra.charAt(aux2)){
                System.out.println("La palabra " + palabra + " no es palíndroma");
                break;
            }
            if (aux1 == (palabra.length()/2-1) && palabra.charAt(aux1) == palabra.charAt(aux2)){
                System.out.println("La palabra " + palabra + " es palíndroma");
            }
            aux1++;
            aux2--;
        }


    }
}

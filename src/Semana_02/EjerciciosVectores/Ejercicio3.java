package Semana_02.EjerciciosVectores;

public class Ejercicio3 {
    public static void main(String[] args) {

        String palabra = "America";
        char letras[] = new char[palabra.length()];

        for(int i = 0; i < palabra.length(); i++){
            letras[i] = palabra.charAt(i);
        }

        for(int i = 0; i < palabra.length(); i++){
            System.out.println("Caracter: " + letras[i]);
        }

    }
}

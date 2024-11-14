package Semana_02.EjerciciosCicloWhile;

public class Ejercicio3 {
    public static void main(String[] args) {

        String parrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas " +
                "risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. " +
                "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie " +
                "euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non " +
                "proin aliquet scelerisque nam maecenas elit cum.";
        int aux = 0;
        int contador = 0;

        while (aux < parrafo.length()){
            if(parrafo.charAt(aux) == 'a' || parrafo.charAt(aux) == 'e' || parrafo.charAt(aux) == 'i' ||
                    parrafo.charAt(aux) == 'o' || parrafo.charAt(aux) == 'u'){
                contador++;
            }
            aux++;
        }
        System.out.println("El número de vocales en el párrafo es: " + contador);
    }
}

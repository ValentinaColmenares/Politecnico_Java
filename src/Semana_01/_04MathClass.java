package Semana_01;

// Tema 4: Math

public class _04MathClass {
    public static void main(String[] args) {

        double valorPi = Math.PI;
        System.out.println(valorPi);

        double raiz = Math.sqrt(25);
        System.out.println(raiz);

        // Más métodos en Math_Metodos en carpeta imágenes o en el sitio web:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

        System.out.println("Valor absoluto = " + Math.abs(-123));
        System.out.println("Hipotenusa = " + Math.hypot(15, 9)) ;
        System.out.println("Logarítmo Natural = " + Math.log(4));
        System.out.println("Número mayor = " + Math.max(4, 9));
        System.out.println("Número menor = " + Math.min(4, 9));
        System.out.println("Potencia = " + Math.pow(5, 4));
        System.out.println("Numero aleatorio = " + Math.random()*100);
        System.out.println("Numero redondeado = " + Math.round(Math.random()*10));
        System.out.println("Raiz cuadrada = " + Math.sqrt(121));

        // Palabras reservadas en Palabras_Reservadas en carpeta imágenes. True, false y null lo son. Ya no se usa const y goto

        int num1 = 2;
        Integer num2 = 3;
        num1 = num2;
        System.out.println(num1);
    }

}

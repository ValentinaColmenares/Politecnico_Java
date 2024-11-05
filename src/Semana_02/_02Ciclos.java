package Semana_02;

// Tema 2: Ciclos

public class _02Ciclos {
    public static void main(String[] args) {

        // Ciclo for, se conocen las iteraciones

        for(int i = 0; i < 10; i++){
            System.out.println("Número: " + i);
        }

        for (int i = 20; i >= 0; i-=2){
            System.out.print(i + " ");
        }

        int suma = 0;
        for (int i = 7; i <= 1000; i+=7){
            suma++;
        }
        System.out.println();
        System.out.println("Múltiplos de 7: " + suma);

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

        // Ciclo while, solo una condición, se desconocen las iteraciones

        boolean x = true;

        while(x){
            System.out.println("Ciclo While");
            x = false;
        }

        //numeros del 1 al 10

        int i1 = 0;

        while(i1 < 10){
            System.out.println(i1);
            i1++;
        }

        // números impares de 1 al 25

        i1 = 1;

        while(i1 <= 25){
            System.out.print(i1 + " ");
            i1 += 2;
        }
        System.out.println();

        // descomposición de palabras

        String palabra = "Politécnico de Colombia";
        i1 = 0;

        while(i1 < palabra.length()){
            if (palabra.charAt(i1) != ' '){
                System.out.print(palabra.charAt(i1) + " ");
            }
            i1++;
        }
        System.out.println();

        // Cantidad de carácteres de cadena y posición

        palabra = "Diego";
        i1 = 0;
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " caracteres");

        while(i1 < palabra.length()){
            System.out.println(palabra.charAt(i1) + " en la posición: " + i1);
            i1++;
        }

        // Programa que se detiene al generar un múltiplo de 10. Del 1 al 50

        x = true;
        while(x){
            double n = Math.ceil(Math.random()*50);
            System.out.println(n);
            if(n % 10 == 0){
                x = false;
            }
        }

        // Ciclo do while

        do{
            System.out.println("Do While");
        }while(false);

        i1 = 0;
        do{
            System.out.println(i1);
            i1++;
        }while(i1 > 5);

    }
}

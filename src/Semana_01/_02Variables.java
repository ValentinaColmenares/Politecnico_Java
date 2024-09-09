package Semana_01;

// Tema 2: Variables y tipos de datos

public class _02Variables {

    public static void main(String[] args) {

        //Datos primitivos en Java
        // Números enteros

        // byte: Emplea un sólo byte (8 bits) de almacenamiento.
        // Esto permite almacenar valores entre [-128, 127].
        byte numeroByte = 9;

        // short: Emplea el doble almacenamiento de (byte).
        // Esto permite almacenar valores entre [-32.768, 32.767].
        short numeroShort = 32767;

        // int: Emplea un tamaño mayor, 4 bytes (32 bits).
        // Esto permite almacenar valores entre [-2147483648, 2147483647].
        int numeroInt = 41825;

        // long: Emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits).
        // Esto permite almacenar valroes entre [-9223372036854775808, 9223372036854775807].
        long numeroLong = 926465464697266565L;

        // Números flotantes

        //float: Emplea un tamaño de 32 bits (4 bytes).
        //Esto permite almacenar valores entre [-3.4028234+8, 1.40239846E-45].
        float numeroFloat = 5976464F;

        //double: Emplea un tamaño de 64 bits (8 bytes).
        //Esto permite almacenar valores entre [-1.7976931348623157E+309, 4.94065645841246544E-324]
        double numerDouble =2654792142478F;

        // Booleanos y caracteres

        //boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos (booleanos).
        //Se traducen sus valores en true/falso.
        boolean variableBoolean = true;

        //Datos estructurados en Java
        //Cadenas de caracteres

        //char: Se emplea para almacenar caracteres individuales (letras, aunque puede contener números).
        //Utiliza 16 bits y se códifica sobre UTF-16 Unicode.
        char numeroChar = 1;
        char letraChar = 'D';

        //String: Se emplea creando una instancia de la clase String,
        //aunque parezca trabajar con datos primitivos.
        String variableString = "Hola a todos.";

        // Vectores - arrays

        //Vector - Arreglo: Se emplea para almacenar
        //un grupo de datos del mismo tipo.
        // Forma 1:
        int vectorNumeros1[] = new int[10];
        //Forma 2:
        int []vectorNumeros2 = new int [10];
        //Forma 3:
        int[] vectorNumeros3 = new int[10];
        //Forma 4:
        int vectorNumeros4[];
        //Forma 5:
        int vectorNumeros5[] = {};
        //Forma 6:
        int vectorNumeros6[] = {9,8,7,6,5,4,3,2,1,0};
        //Forma 7:
        int vectorNumeros7[] = new int[]{9,8,7,6,5,4,3,2,1,0};

        //Matriz: Se emplea para almacenar un grupo de datos del mismo
        //e forma bidimensional basados en [x], [y]
        //Forma 1:
        int matrizNumeros1[][] = new int[4][5];
        //Forma 2:
        int [][]matrizNumeros2 = new int[4][5];
        //Forma 3:
        int[][] matrizNumeros3 = new int[4][5];
        //Forma 4:
        int matrizNumeros4[][];
        //Forma 5:
        int matrizNumeros5[][] = {};
        //Forma 6:
        int matrizNumeros6[][] = {{1,2}, {3,9}};
        //Forma 7:
        int matrizNumeros7[][] = new int[][]{{6,2},{2,7}};

        //Tipos estructurados definidos por el usuario
        /*
        //Variable de tipo persona (Persona es una clase);
        Persona P;
        //Variable de tipo animal (Animal es una clase);
        Animal A;
        //Variable de Java de la clase Math.
        Math M;
        //Variable de Java de la clase Scanner.
        Scanner S;
        //Variable de Java de la clase BufferedReader
        BufferedReader B;
         */

        //Wrappers

        //Estos tipos son equivalentes a los primitivos pero en forma
        //de objetos son: Byte, Short, Integer, Long, Float, Double,
        //Boolean y Character (8 igualmente).

        //Representación de byte en Byte.
        /*
        Byte numeroByte = 1;
        //Representación de short en Short.
        Short numeroShort = 2416;
        //Representación de int en Integer.
        Integer numeroInteger = 95256712;
        //Representación de long en Long.
        Long numeroLong = 5213714121L;
        //Representación de float en Float.
        Float numeroFloat = 6591342543251F;
        //Representación de double en Double.
        Double numeroDouble = 9.3;
        //Representación de boolean en Boolean.
        Boolean variableBoolean = true;
        //Representación de char en Character.
        Character variableCharacter = 'A';
        Character numeroCharacter = 2;
        */

        //REGLAS
        //Se pueden crear dos variables del mismo tipo contiguamente:
        int a = 8, b = 9;
        String j,h;

        //Se puede castear el valor de las variables, es decir, pasar
        //de int a double, de string a int, entre otras combinaciones:
        String edadTexto = "19";
        int edadNumero = Integer.parseInt(edadTexto);
        String alturaDouble = "182";
        double alturaEntera = Double.parseDouble(alturaDouble);
        double numeroDouble = 9.2;
        int numeroEntero = (int) numeroDouble;
        int numeroEntero1 = 9;
        double numeroDouble1 = (double)numeroEntero1;

        //Constantes
        final int documento = 921474159;
        final char letraA = 'A', letraB = 'B', letrac = 'C';
        final String acronimo = "CC";
        final float pi;
        pi = 3.1415F;

    }

}

package Semana_02;

// Tema 3: Vectores

public class _03Vectores {
    public static void main(String[] args) {

        //Forma 1:
        int vectorNumeros1[] = new int[10];
        //Forma 2:
        int []vectorNumeros2 = new int[10];
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

        String estudiantes[] = new String[3];
        estudiantes[0] = "Juan";
        estudiantes[1] = "Stiven";
        estudiantes[2] = "Andres";

        for (int i = 0; i < estudiantes.length; i++){
            System.out.println("Nombre " + i + " - " + estudiantes[i]);
        }

        // Dos vectores, uno de notas y otro de porcentajes. Calcular promedio

        double notas[] = {4.5, 3.2, 1.5, 4.3, 5.0};
        double porcentajes[] = {0.2, 0.1, 0.3, 0.2, 0.2};
        double promedio = 0;

        for(int i = 0; i < notas.length; i++){
            promedio += notas[i]*porcentajes[i];
        }
        System.out.println(Math.round(promedio));

        // Cambiar letras por números

        String nombres[] = {"JUAN", "EVELIN", "ANA", "MARK", "DIEGO"};
        char caracteres[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
                22,23,24,25,26,27};
        String nombreAuxiliar = "";

        for (int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length(); j++){
                for(int k = 0; k < caracteres.length; k++){
                    if(nombres[i].charAt(j) == caracteres[k]){
                        nombreAuxiliar += numeros[k];
                    }
                }
            }
            nombres[i] = nombreAuxiliar;
            System.out.println(nombres[i]);
            nombreAuxiliar = "";
        }

    }
}

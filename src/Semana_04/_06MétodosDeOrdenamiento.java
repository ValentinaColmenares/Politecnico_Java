package Semana_04;

// Tema 6: Métodos de ordenamiento, para vectores o matrices
// Burbuja, inserción, Selección

public class _06MétodosDeOrdenamiento {
    public static void main(String[] args) {

        // Método de ordenamiento burbuja
        // Ver funcionamiento --> https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif

        // Vector a ordenar
        int vector[] = {9,2,5,7,1,2,0};
        // Variable auxiliar
        int temp;

        // Primer ciclo de recorridos
        for(int i = 1; i < vector.length; i++){
            // Segundo ciclo de recorridos
            for (int j = 0; j < vector.length-1; j++){
                // Comparación de las posiciones y sus valores
                // Para determinar el mayor de la comparación
                if (vector[j] > vector[j+1]){
                    // Intercambio de posiciones y valores
                    temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        // Método de ordenamiento por inserción
        // Ver funcionamiento: --> https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif

        // Vector a ordenar
        int vector2[] = {9,2,5,7,1,2,0};

        // Primer ciclo de recorrido
        for(int i = 0; i < vector2.length; i++){
            // Declaración y asignación de la variable auxiliar
            int aux = vector2[i];
            int j;
            // Segundo ciclo de recorrido
            for (j = i-1; j >= 0 && vector2[j] > aux; j--){
                // Intercambio de valores en posiciones
                vector2[j+1] = vector2[j];
            }
            // Asignación de valores al ciclo
            vector2[j+1] = aux;
        }

        for (int i = 0; i < vector2.length; i++){
            System.out.print(vector2[i] + " ");
        }
        System.out.println();

        // Método de ordenamiento por selección
        // Ver funcionamiento: --> https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif

        // Vector a ordenar
        int vector3[] = {9,2,5,7,1,2,0};
        // Variable auxiliar
        int temp1;

        // Primer ciclo de recorridos
        for(int i = 0; i < vector.length-1; i++){
            // Almacenado de variable de recorrido
            int p = i;
            // Segundo ciclo de recorrido
            for (int j = i+1; j < vector.length-1; j++){
                // Comparación de valores y almacenaje de posiciones
                if (vector[j] < vector[p]) p = j;
                // Comparación de posiciones
                if(p != i){
                    temp = vector[p];
                    vector[p] = vector[i];
                    vector[i] = temp;
                }
            }
        }

        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();

    }
}

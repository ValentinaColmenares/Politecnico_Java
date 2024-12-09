package Semana_04;

// Tema 4: Colas

import Semana_03.Usuario;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _04Colas {
    public static void main(String[] args) {

        // Declaración de una cola

        // Queue de enteros
        Queue<Integer> cola = new LinkedList<Integer>();
        // Queue de cadenas
        Queue<String> cola2 = new LinkedList<String>();
        // Queue de doubles
        Queue<Double> cola3 = new LinkedList<Double>();
        // Queue de objetos
        Queue<Object> cola4 = new LinkedList<Object>();
        // Queue de un tipo de clase
        Queue<Usuario> cola5 = new LinkedList<Usuario>();
        // Queue de cualquier tipo
        Queue cola6 = new LinkedList();

        // Método add
        cola.add(2);
        cola.add(17);
        cola.add(9);
        System.out.println("Los elementos de la cola son: " + cola);

        // Método element, recupera el primer dato de la cola
        System.out.println("El primer elemento es: " + cola.element());

        // Método offer
        cola.offer(98);
        cola.offer(18);
        System.out.println("Los elementos de la cola son: " + cola);

        // Método peek
        System.out.println("El primer elemento de la cola es: " + cola.peek());

        // Método poll, recupera y elimina el primer elemento de la cola
        System.out.println("Los elementos de la cola son: " + cola);
        System.out.println("Elemento a eliminar: " + cola.poll());
        System.out.println("Los elementos de la cola son: " + cola);

        // Método remove, recupera y elimina el primer elemento de la cola
        System.out.println("Elemento a eliminar: " + cola.remove());
        System.out.println("Los elementos de la cola son: " + cola);

        // Método iterator, recorre la cola
        Iterator<Integer> colaIterable = cola.iterator();
        while(colaIterable.hasNext()){
            System.out.println("Valor:  " + colaIterable.next());
        }

    }
}

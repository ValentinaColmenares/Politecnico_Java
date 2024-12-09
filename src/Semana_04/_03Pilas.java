package Semana_04;

// Tema 3: Pilas

import Semana_03.Usuario;

import java.util.Stack;

public class _03Pilas {
    public static void main(String[] args) {

        //Declaración de una pila

        // Stack de cadenas
        Stack<String> pila1 = new Stack<String>();
        // Stack de enteros
        Stack<Integer> pila2 = new Stack<Integer>();
        // Stack de doubles
        Stack<Double> pila3 = new Stack<Double>();
        // Stack de objetos
        Stack<Object> pila4 = new Stack<Object>();
        // Stack de un tipo de clase
        Stack<Usuario> pila5 = new Stack<Usuario>();
        // Stack de cualquier tipo
        Stack pila6 = new Stack();

        // Método push
        Stack<String> pila = new Stack<String>();
        pila.push("Matemáticas");
        pila.push("Español");
        pila.push("Sociales");

        // Método pop, devuelve y elimina el elemento superior
        System.out.println(pila.pop());
        System.out.println(pila.pop());

        // Método peek, devuelve el elemento superior
        System.out.println(pila.peek());

        // Método empty
        System.out.println("¿La pila está vacía?: " + pila.empty());

        // Método search, devuelve posicion ó -1 si no existe
        System.out.println(pila.search("Matemáticas"));
        System.out.println(pila.search("Inglés"));

        // Método recorrer pila
        pila.push("Español");
        pila.push("Sociales");
        do{
            System.out.println("Valor: " + pila.peek());
        }while(pila.pop() != null && !pila.empty());

    }
}

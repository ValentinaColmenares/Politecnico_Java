package Semana_04;

// Tema 2: Listas (List, ArrayList y LinkedList)

import Semana_03.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class _02Listas {
    public static void main(String[] args) {

        // Clase List

        // Declaracion de una List

        // List de cadenas
        List<String> listaNombres = new ArrayList<String>();
        // List de enteros
        List<Integer> lista1 = new ArrayList<Integer>();
        // List de doubles
        List<Double> lista2 = new ArrayList<Double>();
        // List de objetos
        List<Object> lista3 = new ArrayList<Object>();
        // List de un tipo de clase
        List<Usuario> lista4 = new ArrayList<Usuario>();
        // List de cualquier tipo
        List lista5 = new ArrayList();
        // List de con tamaño establecido
        List<String> lista6 = new ArrayList<String>(10);

        // Agregar elementos a una List

        // Método add
        List<String> lista = new ArrayList<String>();
        lista.add("Colombia");
        lista.add("Chile");
        lista.add("Argentina");
        lista.add("Venezuela");
        lista.add("Perú");

        // Método add con índice
        lista.add(5, "Guatemala");

        // Método addAll
        List<String> listaNueva1 = new ArrayList<String>();
        listaNueva1.add("México");
        listaNueva1.add("Panamá");
        listaNueva1.add("Ecuador");
        lista.addAll(listaNueva1);

        // Método addAll con índice
        List<String> listaNueva2 = new ArrayList<String>();
        listaNueva2.add("Haití");
        listaNueva2.add("Jamaica");
        listaNueva2.add("Bolivia");
        lista.addAll(9, listaNueva2);

        // Método set
        lista.set(0, "Costa Rica");

        // Método get
        System.out.println(lista.get(0));

        // Método size
        System.out.println("El tamaño de la lista es: " + lista.size());

        // Método contains
        System.out.println("La lista contiene a Colombia: " + lista.contains("Colombia"));

        if(!lista.contains("Colombia")){
            System.out.println("No existe");
        }

        // Método clear
        lista.clear();
        System.out.println("El tamaño de la lista es: " + lista.size());

        // Método isEmpty
        if(lista.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("La lista no está vacía");
        }

        // Método remove por índice
        lista.add("Colombia");
        lista.add("Ecuador");
        lista.add("Venezuela");
        lista.add("Argentina");

        lista.remove(3);

        // System.out.println(lista.get(3));        // ERROR

        // Método remove por valor
        lista.remove("Venezuela");

        // System.out.println(lista.get(2));           // ERROR

        // Método IndexOf
        System.out.println("La posición es: " + lista.indexOf("Ecuador"));

        // Método iterator
        Iterator<String> listaIterable = lista.iterator();

        while (listaIterable.hasNext()){
            System.out.println("Valor: " + listaIterable.next());
        }

        // Clase ArrayList

        // Declaración de un ArrayList

        // ArrayList de enteros
        ArrayList<Integer> lista7 = new ArrayList<Integer>();
        // ArrayList de cadenas
        ArrayList<String> lista8 = new ArrayList<String>();
        // ArrayList de doubles
        ArrayList<Double> lista9 = new ArrayList<Double>();
        // ArrayList de objetos
        ArrayList<Object> lista10 = new ArrayList<Object>();
        // ArrayList de un tipo de clase
        ArrayList<Usuario> lista11 = new ArrayList<Usuario>();
        // ArrayList de cualquier tipo
        ArrayList lista12 = new ArrayList();
        // ArrayList con tamaño específico
        ArrayList<Integer> lista13 = new ArrayList<Integer>(10);

        // Clase LinkedList

        // Declaración de un LinkedList

        // LinkedList de cadenas
        LinkedList<String> lista14 = new LinkedList<String>();
        // LinkedList de enteros
        LinkedList<Integer> lista15 = new LinkedList<Integer>();
        // LinkedList de doubles
        LinkedList<Double> lista16 = new LinkedList<Double>();
        // LinkedList de objetos
        LinkedList<Object> lista17 = new LinkedList<Object>();
        // LinkedList de un tipo de clase
        LinkedList<Usuario> lista18 = new LinkedList<Usuario>();
        // LinkedList de cualquier tipo
        LinkedList lista19 = new LinkedList();

        // Método Add
        lista14.add("Diego");
        lista14.add("Evelin");
        lista14.add("Juan");

        // Método add con índice
        lista14.add(3, "Mauricio");
        lista14.add(4, "Ana");
        lista14.add(5, "Lorenzo");

        // Método addAll
        LinkedList<String> listaNueva3 = new LinkedList<String>();
        listaNueva3.add(0,"Stiven");
        lista14.addAll(listaNueva3);

        // Método addAll con índice
        LinkedList<String> listaNueva4 = new LinkedList<String>();
        listaNueva4.add(0,"Pedro");
        lista14.addAll(7, listaNueva4);

        // Método AddFirst
        lista14.addFirst("Alicia");

        // Método AddLast
        lista14.addLast("Fernando");

        // Método set
        lista14.set(1, "Alejandro");

        // Método get
        System.out.println(lista14.get(2));

        // Método GetFirst
        System.out.println(lista14.getFirst());

        // Método GetLast
        System.out.println(lista14.getLast());

        // Método size
        System.out.println("El tamaño de la lista es: " + lista14.size());

        // Método contains
        System.out.println("La lista contiene a Fernando: " + lista14.contains("Fernando"));

        if(lista14.contains("Fernando")){
            System.out.println("Existe");
        }

        // Método clear
        lista14.clear();
        System.out.println("El tamaño de la lista es: " + lista14.size());

        // Método isEmpty
        if(lista14.isEmpty()){
            System.out.println("Está vacía");
        }else{
            System.out.println("No está vacía");
        }

        // Método remove, elimina el primero
        lista14.add(0, "Stiven");
        lista14.add(1, "Fernando");
        lista14.add(2, "Jose");
        lista14.remove();

        // Método remove por valor
        lista14.remove("Fernando");

        // Método remove por índice
        lista14.remove(0);

        // Método offer, asigna en la última posición
        lista14.offer("Evelin");

        // Método offerFirst, asigna en la primera posición
        lista14.offerFirst("Mia");

        // Método peek, recupera el primer elemento
        System.out.println(lista14.peek());

        // Método peekFirst, recupera el primer elemento
        System.out.println(lista14.peekFirst());

        // Método PeekLast, recupera el último elemento
        System.out.println(lista14.peekLast());

        // Método poll, recupera y elimina el primer elemento
        System.out.println(lista14.poll());
        System.out.println(lista14.get(0));

        // Método pollFirst, recupera y elimina el primer elemento
        lista14.add("Stiven");
        System.out.println(lista14.pollFirst());
        System.out.println(lista14.get(0));

        // Método pollLast, recupera y elimina el último elemento
        lista14.addFirst("Jose");
        lista14.addFirst("Fernando");
        System.out.println(lista14.pollLast());

        // Método pop, recupera y elimina el primer elemento
        System.out.println(lista14.pop());

        // Método push, asigna en la primera posición
        lista14.push("Andrés");

        // Método ListIterator
        ListIterator<String> listaIterable2 = lista14.listIterator();
        while (listaIterable2.hasNext()){
            System.out.println("Valor: " + listaIterable2.next());
        }

    }
}

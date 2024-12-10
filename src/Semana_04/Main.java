package Semana_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Recursividad recursividad = new Recursividad();
        System.out.println("El factorial de 5 es: " + recursividad.factorial(5));
        System.out.println("La sumatoria de 5 es: " + recursividad.sumatoria(5));
        int array[] = {1,2,3,4,5,6,7,8,9,0};
        recursividad.recorrerArray(array,0);
        System.out.println();
        recursividad.buscarElementoEnArray(array,0,10);

        int matriz[][] = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};

        recursividad.recorrerMatrizRecursivo(matriz, 0, 0);
        System.out.println();
        System.out.println(recursividad.fibonacciHastaPosicion(6));

        // Más ejemplos en https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-de-recursividad-java/

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);

        int age = map.get("Alice");

        map.remove("Bob");

        boolean exists = map.containsKey("Alice");

        boolean hasValue = map.containsValue(30);

        Set<String> keys = map.keySet();

        Collection<Integer> values = map.values();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        map.putIfAbsent("Charlie", 40);

        map.computeIfAbsent("Dan", k -> k.length());

        map.replace("Alice", 30, 35);

        // Uso:
        Caja<String> cajaString = new Caja<>();
        cajaString.guardar("Hola");
        System.out.println(cajaString.obtener());

        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.guardar(123);
        System.out.println(cajaInteger.obtener());

        // Uso:
        Utilidad.imprimirElemento("Texto");
        Utilidad.imprimirElemento(456);
        Utilidad.imprimirElemento(3.14);

    }
}

package Semana_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Recursividad recursividad = new Recursividad();
        System.out.println("El factorial de 5 es: " + recursividad.factorial(5));

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
    }
}

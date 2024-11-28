package Semana_03;

import Semana_03.Clase.Clarinete;

public class Main {
    public static void main(String[] args) {

        Perro Firulais = new Perro("Firulais",9,"Ana");
        System.out.println("El nombre del perro es: " + Firulais.getNombre());

        Carro Tracker = new Carro("Chevrolet", "Tracker LT","Negro", false);

        // Paso por valor (valor exacto en argumentos)

        Calculadora Operaciones = new Calculadora();
        int resultado = Operaciones.sumar(9,4);
        System.out.println(resultado);

        // Paso por referencia (dirección en memoria)

        int numeros[] = {9,2,8,1,0,9};
        resultado= Operaciones.sumarVector(numeros);
        System.out.println(resultado);

        Operaciones.setNumero1(9);
        Operaciones.setOperador("+");
        Operaciones.setNumero2(8);
        System.out.println(Operaciones.operacion());

        // Sobrecarga de constructores

        Perro Odin = new Perro();
        Perro Peluche = new Perro("Peluche",9,"Yulied");
        Perro Poseidon = new Perro("Poseidon");

        // Métodos void

        Casa miCasa = new Casa();
        miCasa.setColor("Verde");
        miCasa.pintarDeBlanco();
        System.out.println(miCasa.getColor());

        miCasa.setPropietario("Juan");
        miCasa.cambiarPropietario("Diego");
        System.out.println(miCasa.getPropietario());

        miCasa.mostrarCiudad();

        // Métodos de tipo

        miCasa.setPrecio(100000);
        miCasa.aumentarPrecio(150000);
        System.out.println(miCasa.getPrecio());

        miCasa.setCuartos(4);
        miCasa.setHabitantes(2);
        System.out.println(miCasa.cantidadDeCuartosPorHabitante());

        miCasa.setPrecio(25000000);
        System.out.println(miCasa.valorCasa());

        Carro Logan = new Carro();

        // Ver modificadores de acceso en carpeta imágenes

        // Sobrecarga de métodos

        System.out.println(Operaciones.sumar());
        System.out.println(Operaciones.sumar(9.2, 3.7));
        System.out.println(Operaciones.sumar(9f, 9.5f));
        System.out.println(Operaciones.sumar(5,2));
        System.out.println(Operaciones.sumar(2, 3, 4));

        // Objetos

        // Variable de tipo persona
        Persona Diego;
        // Creación del objeto de la clase persona
        Diego = new Persona();

        Diego.setNombre("Diego Alejandro");
        Diego.setEdad(22);
        Diego.setPais("Colombia");

        System.out.println(Diego.getNombre());
        System.out.println(Diego.getEdad());
        System.out.println(Diego.getPais());

        Diego.Cantar();
        Diego.Comer();

        Persona Katt = new Persona();

        Katt.setNombre("Katt");
        Katt.setEdad(19);
        Katt.setPais("España");

        System.out.println(Katt.getNombre());
        System.out.println(Katt.getEdad());
        System.out.println(Katt.getPais());

        Aritmetica Operaciones2 = new Aritmetica();

        int suma = Operaciones2.suma(9, 2);
        int resta = Operaciones2.resta(9, 12);
        int multiplicacion = Operaciones2.multiplicacion(3, 2);
        double division = Operaciones2.division(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        // Método estático

        System.out.println(Circunferencia.area(95f));

        // Método no estático

        Circunferencia Circulo = new Circunferencia(95f);
        System.out.println(Circulo.area());

        // Sobreescritura de métodos - Polimorfismo

        Clarinete clarineteNegro = new Clarinete();
        clarineteNegro.tocar();

    }
}

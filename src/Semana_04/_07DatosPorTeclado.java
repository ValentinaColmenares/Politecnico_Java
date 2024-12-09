package Semana_04;

// Tema 7: Datos por teclado

// ó import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ó import java.util.*;
import java.util.Scanner;

public class _07DatosPorTeclado {
    public static void main(String[] args) throws IOException{

        // BufferedReader - InputStreamReader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = br.readLine();
        System.out.print("Bienvenido " + nombre + ". Por favor ingrese su edad: ");
        String entrada = br.readLine();
        int edad = Integer.parseInt(entrada);
        System.out.println("Gracias " + nombre + " tienes " + edad + " años.");

        // Scanner

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Bienvenido " + nombre + ". Por favor ingrese su edad: ");
        int edad1 = sc.nextInt();
        System.out.println("Gracias " + nombre + " tienes " + edad + " años.");

    }
}

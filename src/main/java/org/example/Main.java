package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        float resultado = multiplicarNumeros();
        System.out.println("El resultado es: " + resultado);

    }

    public static float multiplicarNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplicación: ");

        System.out.println("Introduce el primer número");
        float num1 = sc.nextFloat();

        System.out.println("Introduce el segundo número");
        float num2 = sc.nextFloat();

        float resultado = num1 * num2;
        return resultado;
    }
}
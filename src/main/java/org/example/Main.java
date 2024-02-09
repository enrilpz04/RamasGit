package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    // DESI
    public static int dividir(int dividendo, int divisor) {
        // Manejo de la división por cero
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Integer.MIN_VALUE; // Devuelve el valor mínimo de un entero para indicar un resultado indefinido
        }

        // Realizar la división
        int cociente = dividendo / divisor;
        return cociente;
    }
    // ENRIQUE
    public static int sumarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        return numero1 + numero2;
    }
    // MIGUEL
    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;

    }
    //GONZALO
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

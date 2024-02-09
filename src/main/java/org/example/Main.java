package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
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
    public static int sumarNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        return numero1 + numero2;
    }
}
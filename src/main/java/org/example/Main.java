package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
}
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
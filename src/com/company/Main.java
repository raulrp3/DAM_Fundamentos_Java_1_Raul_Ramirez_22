package com.company;

import java.util.Scanner;

public class Main {
    public static int validarEntero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numñerico entero!");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }

    public static boolean validarNumero(int numero) {
        boolean validado = true;
        if (numero > 9999 || numero < 0) {
            validado = false;
        }
        return validado;
    }

    public static int cuentaCifras(int numero) {
        return String.valueOf(numero).length();
    }

    public static String cambiarCifras(int numero) {
        String numeroResultado = "", numeroString = String.valueOf(numero);
        for (int i = numeroString.length() - 1; i >= 0; i--) {
            numeroResultado = numeroResultado + numeroString.charAt(i);
        }
        return numeroResultado;
    }

    public static String esCapicua(int numero) {
        String cadenaResultado = "El nñumero SÍ es capicúa.", numeroString = String.valueOf(numero);
        for (int i = 0; i < (numeroString.length() - 1) / 2; i++) {
            if (numeroString.charAt(i) != numeroString.charAt(numeroString.length() - 1 - i)) {
                cadenaResultado = "El número NO es capicúa.";
                break;
            }
        }
        return cadenaResultado;
    }

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        char opcion;
        System.out.println("¡Vamos a realizar una serie de operaciones con un nñumero!");
        System.out.print("Introduce un número: ");
        numero = validarEntero(sc);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un núumero entre 0 y 9999! ");
            numero = validarEntero(sc);
        }
        System.out.println("--MENÚ--");
        System.out.println("[1] ¿Cuántas cifras tiene?");
        System.out.println("[2] Mostrar sus crifras al revés");
        System.out.println("[3] ¿Es capicúa?");
        System.out.print("Opción: ");
        opcion = sc.next().charAt(0);
        sc.close();
        switch (opcion) {
            case '1':
                System.out.printf("Número de cifras %d\n", cuentaCifras(numero));
                break;
            case '2':
                System.out.printf("EL número del revés es: %s\n", cambiarCifras(numero));
                break;
            case '3':
                System.out.println(esCapicua(numero));
                break;
        }
    }
}

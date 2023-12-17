package com.verificarpalindromos;

import java.util.Scanner;

public class Main {

    // Función para verificar si una cadena es un palíndromo
    private static boolean esPalindromo(String texto) {
        int izquierda = 0;
        int derecha = texto.length() - 1;

        // Comparar caracteres desde los extremos hacia el centro de la cadena
        while (izquierda < derecha) {
            // Si los caracteres no son iguales, no es un palíndromo
            if (texto.charAt(izquierda++) != texto.charAt(derecha--)) {
                return false;
            }
        }

        // Si ha pasado por todas las comparaciones, es un palíndromo
        return true;
    }

    // Función para obtener la entrada del usuario
    private static String obtenerEntradaUsuario() {
        System.out.print("Ingresa una palabra o frase para verificar si es un palíndromo: ");

        // Utilizamos el constructor directamente en la llamada al método para evitar una variable adicional
        return new Scanner(System.in).nextLine().trim();
    }

    public static void main(String[] args) {
        // Obtener la entrada del usuario
        String fraseUsuario = obtenerEntradaUsuario();

        // Validar que la entrada no esté vacía
        if (fraseUsuario.isEmpty()) {
            System.out.println("Debes ingresar al menos una palabra o frase.");
            return; // Salir del programa si la entrada es vacía
        }

        // Normalizar la entrada a minúsculas para una comparación insensible a mayúsculas/minúsculas
        String textoNormalizado = fraseUsuario.toLowerCase();

        // Verificar si la entrada es un palíndromo
        if (esPalindromo(textoNormalizado))
            // Mostrar mensaje de que es un palíndromo
            System.out.printf("¡'%s' es un palíndromo!%n", fraseUsuario);
        else
            // Mostrar mensaje de que no es un palíndromo
            System.out.printf("'%s' no es un palíndromo.%n", fraseUsuario);
    }
}

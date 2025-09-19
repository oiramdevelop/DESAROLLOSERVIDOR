package com.ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Bucles2 {
    
    public static void main(String[] args) {
     

        //Ahora con un bucle for recoremos un arraylist de String y
        // mostramos las que contengga la letra p y tengan alguna letra en posicion simetrica


        ArrayList<String> palabras = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántas palabras quieres introducir? ");
        int n = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer

        for (int f = 0; f < n; f++) {
            System.out.print("Introduce una palabra: ");
            String palabraArray = teclado.nextLine();
            palabras.add(palabraArray);
        }

        System.out.println("Palabras introducidas: " + palabras);
        teclado.close();

        for (String palabra : palabras) {
            if (palabra.contains("p")) {
                int len = palabra.length();
                boolean simetrica = false;
                for (int i = 0; i < len / 2; i++) {
                    if (palabra.charAt(i) == palabra.charAt(len - 1 - i)) {
                        simetrica = true;
                        break;
                    }
                }
                if (simetrica) {
                    System.out.println(palabra + " contiene 'p' y tiene letras en posiciones simétricas.");
                } else {
                    System.out.println(palabra + " contiene 'p' pero no tiene letras en posiciones simétricas.");
                }
            } else {
                System.out.println(palabra + " no contiene 'p'.");
            }
        }

/*
 * for (int i = 0; i < palabras.size(); i++) {
 */

    }
}

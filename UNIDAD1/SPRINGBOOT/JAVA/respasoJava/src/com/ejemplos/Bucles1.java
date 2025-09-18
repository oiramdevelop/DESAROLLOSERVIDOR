package com.ejemplos;

public class Bucles1 {
    public static void main(String[] args) {
        //Bucle que  lee x palabras y muestra las que tengan   mas de 6 letras y empiecen o acaben por A, acaba cuando lee todas las palabras o lea fin

        int x = 0;
        String palabra;


        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("¿Cuántas palabras quieres introducir? ");
        x = teclado.nextInt();

        teclado.nextLine(); 
        for (int i = 0; i < x; i++) {
            System.out.print("Introduce la palabra: ");
            palabra = teclado.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            
            if (palabra.length() > 6 && (palabra.startsWith("A") || palabra.endsWith("a"))) {
                System.out.println(palabra);
            }
            else {
                System.out.println("No cumple las condiciones");
            }
        }
        teclado.close();
    }
}

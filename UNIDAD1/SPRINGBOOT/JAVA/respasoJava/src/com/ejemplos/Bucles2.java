package com.ejemplos;

import java.util.Scanner;

public class Bucles2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numPal = 0;
        String palabra;

        System.out.print("Numero de la palabra a leer");
        numPal  = teclado.nextInt();

        System.out.println("Palabra 1:");
        palabra = teclado.nextLine();
        int i = 2;

        while (numPal!=0 && !palabra.equalsIgnoreCase("fin")) {

            //si tiene mas de 6 letras y empieza por A
            if(palabra.length()>=6 && (palabra.toUpperCase().charAt(0)=='A')){
                System.out.println(palabra);
            }
         //leemos la siguiente palabra 
        System.out.println("Palabra " + i + ":" );
        palabra = teclado.nextLine();
        i++;
        numPal--;   
        }

    }
}

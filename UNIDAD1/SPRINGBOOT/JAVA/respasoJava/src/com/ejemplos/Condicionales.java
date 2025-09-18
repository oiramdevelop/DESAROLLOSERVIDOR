package com.ejemplos;

public class Condicionales {
    public static void main(String[] args) throws Exception {
        int edad = 18;
        String marca = "Peugeout";
        float potencia = 135.5f;

        // Solo podra conducir si es mayor de edad y el coche tiene menos de 140 cv de
        // potencia
        if (edad >= 18 || marca.equalsIgnoreCase("Peugeot") && potencia < 140) {
            System.out.println("Puedes conducir " + marca);
            ;
        } else if (edad < 18) {
            System.out.println("Eres menor de edad, no puedes conducir");
        } else {
            System.out.println("Tu coche es muy potente, no puedes conducir");

        }
        System.out.println("Fin del programa");

        int dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Es fin de semana");
                break;
        }
    }
}

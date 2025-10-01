package com.ejemplos;

import java.util.List;

public class ScapeRoom extends Juego {

    int tiempoMaxTotal;
    int intentosTotales;
    List<Puzzle> listaPuzles;

    /**
     * Recorre todos los puzles y comprueba que no se haya
     * pasado de tiempo ni de intentos y esten todos resueltos
     * 
     * @return true si esta resuelta y flase en caso contrario
     *

    boolean comprobarSolucion() {

        /*for(int i =0; i <listaPuzles.size();i++)
        {
            listaPuzles.get(i).
        }

        boolean resuelto = false;
        int sumaTiempoPuzzle =0;
        for (Puzzle puzzle : listaPuzles) {
            //Comprobamos que todos los puzzles estan resueltos
            // Con que uno de los puzzles no este resuelte ya 
            // ya el scaperoom no lo esta 

            if(!puzzle.isResuelto() || puzzle.getIntentos()<0)
                return false ;

            //Vmos sumando todo los tiempos 
            sumaTiempoPuzzle +=puzzle.getTiempoTardado();

           
           
        }
        /*
         * Una vez fuera del bucle , con la suma de todos los tiempos de los puzzles calculada 
         * comprobamos si se ha pasado comparandolo con el tiempo maximo que hay 
         * para resolver el scaperoom
         * 
         *
        if(sumaTiempoPuzzle > ths.tiempoMaxTotal) return false;

        //si llega aqui es que se ha resuelto 

    }*/

    boolean comprobarSolucionStream()
    {
        listaPuzles.stream().allMatch(p -> p.isResuelto())
    }

}
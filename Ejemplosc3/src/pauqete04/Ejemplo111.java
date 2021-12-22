/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pauqete04;

import paquete01.*;

/**
 *
 * @author reroes
 */
public class Ejemplo111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        String[][] arreglo1 = {{"José", "Luis"}, {"Ana", "Monica"}};

        String[][] arreglo2 = {{"Alvarez", "Gonza"}, {"Flores", "Benitez"}};

        String[][] sumaArreglo = new String[2][2]; //

        String valor1;
        String valor2;

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor1 = arreglo1[fila][col];
                valor2 = arreglo2[fila][col];
                // Opción 1:
                // sumaArreglo[fila][col] = valor1 + " " + valor2;
                // Opción 2:
                sumaArreglo[fila][col] = String.format("%s %s", valor1, valor2);
            }
        }

        for (int fila = 0; fila < sumaArreglo.length; fila++) {
            for (int col = 0; col < sumaArreglo[fila].length; col++) {
                System.out.printf("%s\t", sumaArreglo[fila][col]);
            }
            System.out.println("");
        }
    }

}

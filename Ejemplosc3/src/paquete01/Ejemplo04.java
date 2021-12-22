/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        // forma 1
        int[][] arreglo1 = {
            
            {10, 20, 40},  // fila 0
            
            
            {1, 2, 3} // fila 1
        
        };
        
        int suma;
        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            suma = 0;
            for (int col = 0; col < arreglo1[fila].length; col++) {
                suma = suma + arreglo1[fila][col];
                // 0 + arreglo1[0][0]// 0+10  // 10
                // 10 + arreglo1[0][0]// 0+10  // 10
                // 30 + arreglo1[0][0]// 30+40  // 10
            }
            System.out.printf("Suma de valores del arreglo: %d\n", suma);
        }
        
        // System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }
    
}

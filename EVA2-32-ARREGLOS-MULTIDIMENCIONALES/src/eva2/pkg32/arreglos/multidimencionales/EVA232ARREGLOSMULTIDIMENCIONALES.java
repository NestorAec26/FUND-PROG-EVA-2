/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2.pkg32.arreglos.multidimencionales;

/**
 *
 * @author invitado
 */
public class EVA232ARREGLOSMULTIDIMENCIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][4];
        //PONER DATOS MANUALES
        matriz[1][3] = 100;
        System.out.println("matriz[1][3] = " + matriz[1][3]);
        //--------------------------------------------------
        System.out.println("matriz.length");
        //llenar con valores aleatorios la matriz:
        //filas --> PRIMER DIMENCION
        for (int i = 0; i < matriz.length; i++) {
            // POR CADA FILA, DEBO RRECORRER LAS COLUMNAS
            //COLUMNAS
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            // POR CADA FILA, DEBO RRECORRER LAS COLUMNAS
            //COLUMNAS
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
    }
            System.out.println("");
    
}

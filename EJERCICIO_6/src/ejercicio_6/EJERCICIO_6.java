/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //6. Ejercicio: Solicitar un número entero positivo al usuario e imprimir el equivalente en sistema
        //binario
        
        Scanner input = new Scanner(System.in);
        int nume, resi;
        System.out.println("Ingresa un numero para ponerlo en binario");
        nume = input.nextInt();
        
        System.out.println("El numero en Binario es:");
        
        do{
            resi = nume % 2;
            nume = nume / 2;
            System.out.print(resi);
        }while (nume > 0);
    }
    
}

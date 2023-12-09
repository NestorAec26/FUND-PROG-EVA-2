/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        String cadena;
        char caracter;
        int caracter2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el texto");
        cadena = input.nextLine();
        
        System.out.println("ingresa el caracter");
        caracter = input.next().charAt(0);
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == caracter) {
                caracter2 = caracter2 + 1;
            }
            
        }
        System.out.println("El caracter: "+ caracter + ", se repite: " + caracter2 + " veces.");
    }
    
}

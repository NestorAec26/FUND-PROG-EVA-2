/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio: Solicitar un número al usuario, indicar si el número es positivo, negativo o cero.
        //Después de solicitar el número y darle la respuesta al usuario, se le debe preguntar si desea
        //terminar el programa.
        
        int nume;
        String respuesta;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("INGRESA EL NUMERO");
            nume = input.nextInt();
            
            if(nume == 0)
                System.out.println("EL numero: " + nume + ", es cero");
            else if(nume < 0)
                System.out.println("EL numero: " + nume + ", es negativo");
            else if (nume > 0)
                System.out.println("EL numero: " + nume + ", es positivo");
            
            System.out.println("Deseas terminar el programa?");
            respuesta = input.next();
            
        }while(respuesta.equals("no"));
        System.out.println("Fin del programa!!");
    }
    
}

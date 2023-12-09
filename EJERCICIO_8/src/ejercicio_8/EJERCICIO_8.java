/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //8. Ejercicio: Solicitar caracteres alfabéticos al usuario, indicar si es vocal o consonante. El
        //programa termina cuando se introduzca un espacio en blanco
        String letra;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa la letra que vayas a evaluar");
        letra = input.next();
            
            switch(letra){
                
                case "a":
                    System.out.println("la letra: " + letra + ",es una vocal");
                    break;
                case "e":
                    System.out.println("la letra: " + letra + ", es una vocal");
                    break;
                case "i":
                    System.out.println("la letra: " + letra + ", es una vocal");
                    break;
                case "o":
                    System.out.println("la letra: " + letra + ", es una vocal");
                    break;
                case "u":
                    System.out.println("la letra: " + letra + ", es una vocal");
                    break;
                default:
                    System.out.println("La letra: " + letra + ", es una consonante");
            }
        }while(letra.equals(" "));
        System.out.println("Fin del programa");
        
    }
    
}

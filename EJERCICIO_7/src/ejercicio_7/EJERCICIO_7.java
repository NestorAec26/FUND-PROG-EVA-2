/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //7. Ejercicio: Solicitar un número positivo (o cero) al usuario. El programa estará preguntando
        //números hasta que el usuario introduzca un número negativo. El programa deberá mostrar
        //cual es el número más pequeño y el más grande de todos los que introdujo el usuario.
        
        Scanner input = new Scanner(System.in);
        
        int nume = 0;
        int maximo = 0;
        int menor = 0;
        
        do{
            System.out.println("Ingrera un numero");
            nume = input.nextInt();
            if(nume > maximo){
            maximo = nume;           
            }
            if(nume < menor){
                menor = nume;
            }
        }while(nume >= 0);
        System.out.println("El valor maximo es: " + maximo);
        System.out.println("El valor minimo es: " + menor);
        System.out.println("Fin del programa!!");
    }
}

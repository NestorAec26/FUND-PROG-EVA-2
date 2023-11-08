/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //: Solicitar un número al usuario e imprimir la sumatoria de todos los números desde 
      //el 1 hasta el número que introdujo el usuario.
      Scanner input = new Scanner(System.in);
      int nume;
       System.out.println("Introduce el numero");
      nume = input.nextInt();
       
      int suma;
      suma = 0;
      
      for (int i = 1; i <= nume; i++) {
         System.out.print(i + " - ");
         suma = suma + i ;
         
      }
      
      System.out.println("");
      System.out.print("La suma de todos los numeros es:"+ suma);
   }
   
   
}

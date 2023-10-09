/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int califa;
      Scanner input = new Scanner (System.in);
      System.out.println("introduce la calificacion");
      califa = input.nextInt();
      
      if(califa >= 70){
      System.out.println("Aprobado: viaje a cancun!!");
      System.out.println("Felicidades!!");
      }else{
      System.out.println("No acreditado: A picar piedra") ;
      }  
      System.out.println("Fin del programa!!") ;
      // TODO code application logic here
   }
   
}

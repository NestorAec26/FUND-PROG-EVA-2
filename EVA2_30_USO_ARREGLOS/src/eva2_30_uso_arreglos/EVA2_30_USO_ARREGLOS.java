/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_30_USO_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] ListaProd = new String[10];
      Scanner input = new Scanner(System.in);
      ListaProd[0] = "Tacos";
      ListaProd[1] = "Tortas";
      ListaProd[2] = "Tamales";
      ListaProd[3] = "Tlacoyo";
      ListaProd[4] = "Tlayudas";
      ListaProd[5] = "Tampiqueñas";
      ListaProd[6] = "Tortas ahogadas";
      ListaProd[7] = "Tchilaquiles";
      ListaProd[8] = "T-Bone";
      ListaProd[9] = "Tripitas";
      
      double []   listPrecios = {20,40,15,50,30,54,60,200,400,10};
      
      System.out.println("-------MENU--------");
      for (int i = 0; i < ListaProd.length; i++) {
         System.out.println("-" + ListaProd[i] +" :$" + listPrecios);
         
      }
      
      int opc, cant;
      System.out.println("¿Que deseas ordenar?");
      opc = input.nextInt();
      System.out.println("¿Cuantas Ordenes?");
      cant = input.nextInt();
      System.out.println("El total es: $" + (cant * listPrecios[opc)]);
      
   }
   
}

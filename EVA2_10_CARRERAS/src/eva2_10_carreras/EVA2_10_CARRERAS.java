/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int carreras;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la abreviacion de tu carrera");
        carreras = input.nextInt();
 
        switch(carreras){
            case 1:
                System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
                break; // TERMINA LA EJECUCUION DE SWITCH
            case 2:
                System.out.println("INFORMATICA");
                break;
            case 3:
                System.out.println("LICENCIATRA EN ADMINISTRACION");
                break;
            case 4:
                System.out.println("ARQUITECTURA");
                break;
            case 5:
                System.out.println("INGENIERIA INDUSTRIAL");
                break;
            case 6:
                System.out.println("");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default://siempre al final 
                System.out.println("El numero" + mes + " no es un mes valido");
        }
        // TODO code application logic here
    }
    
}

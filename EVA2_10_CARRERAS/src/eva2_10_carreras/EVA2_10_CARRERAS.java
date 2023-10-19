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
        String carrera; 
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la abreviacion de tu carrera");
        carrera = input.nextLine();
 
        switch(carrera){
            case "ISC":
                System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
                break; // TERMINA LA EJECUCUION DE SWITCH
            case "INF":
                System.out.println("INFORMATICA");
                break;
            case "LA":
                System.out.println("LICENCIATRA EN ADMINISTRACION");
                break;
            case "ARQ":
                System.out.println("ARQUITECTURA");
                break;
            case "IND":
                System.out.println("INGENIERIA INDUSTRIAL");
                break;
            case "IDI":
                System.out.println("INGENIERIA EN DISEÑO INDUSTRIAL");
                break;
            case "IGE":
                System.out.println("INGENIERIA EN GESTION EMPRESARIAL");
                break;
                
            default://siempre al final 
            
        }
        // TODO code application logic here
    }
    
}
        // TODO code application logic here
    }
    
}

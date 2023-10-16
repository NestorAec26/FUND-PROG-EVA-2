/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma, val1, val2;
        val1 = 100;
        val2 = 200;
        suma = val1 + val2;
        System.out.println("La suma es" + suma);
        // Resta
        int resta;
        resta = val1 - val2;
        System.out.println("La resta es = " + resta);
        // MULLTIPLICACION
        int multi;
        multi = val1 * val2;
        System.out.println("La multiplicacion es = " + multi);
        // DIVISION
        int divi;
        divi = val1 % val2;
        System.out.println("La division es =" + divi);
        val1 = 11;
        val2 = 2;
        divi = val1 / val2;
        System.out.println("La division 11/2 =" + divi);
        int residuo = val1 % val2;
        System.out.println("El residuo de 11/2 es =" + residuo);
        
        double resu = val1 / val2;
        System.out.println("La division 11/2 es =" + resu);
        double val2Double = 2;
        resu = val1 / val2Double;
        System.out.println("La division 11/2.0 = " + resu);
        //int resu = 11 / 2.0; //perdida de informacion
        System.out.println("La division 11/2.0 = " + resu);
        //POTENCIA --> No hay operador de potencia
        double potencia = Math.pow(3, 3);
        System.out.println("POTENCIA--------");
        System.out.println("3 elevado a la 3 " + potencia);
        // RAIZ --> NPO HAY RAIZ
        double raiz = Math.pow(100, 0.5);
        System.out.println("RAIZ-------");
        System.out.println("La raiz cuadrada de 100 =" + raiz);
        //precedencia de operadores:
        int resuOp, x = 3, y = 2,z = 5;
        resuOp = (x * z) + (x* y) / 2 - (y - z);
                  //(15) + (6)/2 (-3)
                  //(15) + 3 -(+3)
                  //15 + 3 + 3 = 21
        System.out.println("El resultado es = " + resuOp);
        double resuForm, a = 3, b = 9, c = 3;
        resuForm = ((-b)- Math.pow(((b * b) - (4 * a * c)), 0.5)) / (2 * a);
        System.out.println("El resultado es = " + resuForm);
        
        
        
        
        
        
            
    }
    
}

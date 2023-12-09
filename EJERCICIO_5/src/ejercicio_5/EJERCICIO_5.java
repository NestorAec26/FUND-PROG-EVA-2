/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

/**
 *
 * @author Usuario
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //5. Ejercicio: Solicitar al usuario dos números enteros positivos. El primero es la base, el segundo
        //es el exponente. Usando ciclos, calcular la potencia de la base elevada al exponente.
        System.out.println("Potencia es igual a " + calcularPotencia(3, 5));
    }
    public static int calcularPotencia(int base, int potencia){
    int resultado = 1;
            for (int i = 1; i <= potencia; i++) {
                 resultado = (resultado * base);
            }
            return resultado;
    } 
}

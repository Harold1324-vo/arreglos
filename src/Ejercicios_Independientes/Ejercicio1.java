/*
Crear un Array de 10 posiciones de números de valores pedidos por teclado. Muestra por consola el índice y el valor
al que corresponde. Haz dos métodos, uno para rellenar y otro para mostrar.
 */
package Ejercicios_Independientes;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[10];
        
        for(int i = 0; i<numeros.length; i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextFloat();
        }
        
        for(int i = 0; i<numeros.length; i++){
            System.out.println((i+1)+ ".- " + numeros[i]);
        }
    }
}
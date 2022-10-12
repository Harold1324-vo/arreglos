/*
Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso introducido
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        
        System.out.println("Ingrese los números");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los números en el orden inverso");
        for(int i=4;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
/*
Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orde:
    el primero, el último, el segundo, el penúltimo, el tercero, etc.
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int primeros = 0, ultimos = 9;
        
        System.out.println("Almacenar los 10 números en el arreglo");
        for(int i=0; i<numeros.length; i++){
            System.out.print((i+1)+". Digite un números: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\nImprimir los números");
        for(int i=0;i<5;i++){
            System.out.println(numeros[primeros]);
            System.out.println(numeros[ultimos]);
            primeros += 1;
            ultimos -= 1;
        }
    }
}
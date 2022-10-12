/*
Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducidos
 */
package arreglos;
import java.util.Scanner;

public class Ejercicio1 {    
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        
        System.out.println("Guardando los números en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: "); //Colocamos un contador para que se muestre el ingreso de números en 1...
            numeros[i] = entrada.nextFloat(); //Guardamos los números ingresados en su respectiva posición
        }
        System.out.println("\nImprimir los números: ");
        for(float i: numeros){ //Mismo tipo que el arreglo, nombre para mandar a imprimir, nombre del arreglo
            System.out.println(i); //Manda a imprimir
        }
    }
}
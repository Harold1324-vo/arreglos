/*
 Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma:
 el 1° de A, el 1° de B     el 2° de A, el 2° de B      el 3° de A, el 3° de B, etc
*/
package arreglos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        a = new int[10];  //Arreglo a, con 10 elementos
        b = new int[10];  //Arreglo b, con 10 elementos
        c = new int[20];  //Arreglo c, contendrá el arreglo a y b
        
        //Pedimos el arreglo a
        System.out.println("Digite el primer arreglo.");
        for(int i=0;i<a.length;i++){
            System.out.print((i+1) + ". Digite un número: ");
            a[i] = entrada.nextInt();
        }
        
        //Pedimos el arreglo b
        System.out.println("\nDigite el segundo arrglo.");
        for(int i=0;i<b.length;i++){
            System.out.print((i+1) + ". Digite un número: ");
            b[i] = entrada.nextInt();
        }
        
        /*
        Ahora vamos a mezclar los 2 arreglos en el arreglo c
        vamos a utilizar el interador i para a y b
        y el iterador j para el arreglo c
        */
        int j=0;
        for(int i=0;i<10;i++){
            c[j] = a[i];  //1°A, 2°B
            j++;
            c[j] = b[i]; //1°B, 2°B
            j++;
        }
        
        System.out.println("\nEl tercer arreglo es: ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
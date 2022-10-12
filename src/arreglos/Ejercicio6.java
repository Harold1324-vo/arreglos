/*
 Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma:
 3 de la tabla A, 3 de la tabla B, otros 3 de A, otros de la B, etc.
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int[] a, b, c;
        a = new int[12]; //Arreglo a, con 12 elementos
        b = new int[12]; //Arreglo b, con 12 elementos
        c = new int[24]; //Arreglo c, con 24 elementos
        
        System.out.println("Digite el primer arreglo.");
        for(int i=0;i<a.length;i++){
            System.out.print((i+1)+". Digite un número: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("\nDigite el segundo arreglo.");
        for(int i=0;i<b.length;i++){
            System.out.print((i+1)+". Digite un número: ");
            b[i] = entrada.nextInt();
        }
        
        //Mezclar los dos arreglos en un tercer arreglo llamado c
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < c.length) {
            for (int cont = 0; cont < 3; cont++) {
                c[i] = a[j];
                i++;
                j++;
            }
            for (int cont = 0; cont < 3; cont++) {
                c[i] = b[k];
                i++;
                k++;
            }
        }
        
        System.out.println("\nEl tercer arreglo es: ");
        for(i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}

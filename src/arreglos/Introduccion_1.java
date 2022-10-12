/*
 Llenar un arreglo con el indice y números que el usuario ingrese
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Introduccion_1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        
        //Crear el arreglo
        char[] letra = new char[nElementos]; //Ya se tiene el arreglo con el N° de elementos que pidió el usuario
        
        //Pedir los elementos para llenar el arreglo
        System.out.println("Digite los elementos del arreglo");
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1)+". Digite un caracter: "); //Se coloca (i+1) para el usuario vea que inicia ingresando el caracter 1,2..etc
            letra[i] = entrada.next().charAt(0); 
            /*
            //Se coloca i para almacenar el caracter ingresado en la posicion en la que va el interador, 
            y se coloca 0 para que guarde el primer caracter que encuentre
            */
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(letra[i] + " "); //Se manda a imprimir
        }
    }
}
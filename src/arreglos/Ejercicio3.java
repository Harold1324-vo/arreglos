/*
Leer 5 números por teclado, almacenarlos en un arreglo y a continuación sacar el promedio de los números positivos,
el promedio de los números negativos y contar el números de ceros.
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float[] numeros= new float[5];
        float suma_positivos = 0, suma_negativos = 0, promedio_positivos, promedio_negativos;
        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;
        
        System.out.println("Guardar los números en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i] == 0){
                conteo_ceros++;
            }else if(numeros[i] > 0){
                suma_positivos += numeros[i];
                conteo_positivos++;
            }else{
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }
        
        //Media de los números positivos
        if(conteo_positivos == 0){
            System.out.println("No se puede sacar el promedio de los positivos.");
        }else{
            promedio_positivos = suma_positivos / conteo_positivos;
            System.out.println("El promedio de los números positivos es: "+promedio_positivos);
        }
        
        //Media de los números negativos
        if(conteo_negativos == 0){
            System.out.println("No se puede sacar el promedio de los negativos");
        }else{
            promedio_negativos = suma_negativos / conteo_negativos;
            System.out.println("El promedio de los negativos es: "+promedio_negativos);
        }
        
        //Cuenta de ceros
        if(conteo_ceros == 0){
            System.out.println("No hay ningún cero");
        }else{
            System.out.println("Los números de ceros ingresados son: "+conteo_ceros);
        }
    }
}
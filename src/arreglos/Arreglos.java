/*
 Arrays - Arreglos - Vectores : son una colección de datos del mismo tipo
 Se colocan desde el principio cuantas posiciones tendrá el arreglo
    ARRAY UNIDIMENSIONALES: son los que están en una sola línea
        Tipo_Variable[]  Nombre_del_Array  =new  Tipo_de_Variable[dimensión];
        Ejemplos: 
            int[] edad = new int[4];
            long[] edad = new long[5];
  Manera de dar los valores manualmente
    * numero[0] = 5;   Se coloca el nombre del arreglo, dentro de los corchetes la posición y el número a mostrar
    * int[] numero = {5,6,7}  Se colocan los números dentro de llaves
 */
package arreglos;

public class Arreglos {
    public static void main(String[] args) {
        int[] numero = {7,8,9}; //Se declara el arreglo con nombre y los valores en cada posicion
        
        /*
        int[] numero = new int[3];
        numero[0] = 7;
        numero[1] = 10;
        numero[2] = 13;
        */
        
        for(int i=0;i<3;i++){ //El ciclo debe iniciar en 0 ya que los arreglos comienzan en esa posición
            System.out.println(numero[i]); //Se manda a imprimir el nombre del arreglo y el interador ya que es la posición
        }
    }
    
}

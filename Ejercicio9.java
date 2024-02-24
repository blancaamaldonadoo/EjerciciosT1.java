/*EJERCICIO9:  Escribir un programa que solicite al usuario dos vectores de N
 elementos y que imprima su producto escalar. Utilice un array para
 representar el vector de N elementos. Realice la entrada de usuario por
 teclado en una función que reciba las dimensiones del vector a la que se
 invoca dos veces (una por vector) y otra función que calcule el producto
 escalar recibiendo dos arrays que representan dos vectores.

 */

import java.util.Scanner;

public class Ejercicio9 {

public static int[][] RecibeDimensiones(){

    Scanner scanner= new Scanner(System.in);
    System.out.println("Introduce la dimensión del vector1: ");
    int dimension1= scanner.nextInt();
    System.out.println("Introduce la dimensión del vector2: ");
    int dimension2= scanner.nextInt();

    int vector1[]= new int[dimension1];
    int vector2[]= new int[dimension2];

    //Pedimos valores del vector1:

    System.out.println("\nIntroduce los elementos del vector 1: ");
    for (int i=0; i<dimension1; i++){

        System.out.println("\nElemento " + (i+1) + ": ");
        vector1[i]=scanner.nextInt();
    }

    //Pedimos valores para el vector 2:

    System.out.println("\nIntroduce los elementos del vector 2: ");

    for (int j=0; j<dimension2;j++){
        System.out.println("\nElemento " + (j+1) + ": ");
        vector2[j]=scanner.nextInt();
    }

    return new int[][] {vector1,vector2}; //Nos devuelve un nuevo array de dos dimensiones formado por ambos vectores
}
 
public static int ProductoEscalar(int v1[], int v2[]){

    if (v1.length!=v2.length){
        System.out.println("Error, las dimensiones de ambos vectores son distintas");
        RecibeDimensiones();
        return 0;
    }

    int prod_esc=0;
    for (int i=0;i<v1.length;i++){

        prod_esc=prod_esc+(v1[i]*v2[i]);

    }

    return prod_esc;

}

public static void main(String[] args) {
    
    int[][] vectores= RecibeDimensiones();
    int productoescalar= ProductoEscalar(vectores[0], vectores[1]);//Pedimos el producto escalar del vector1 (almacenado en la posicion 0)
    //y el vector 2, almacenado en la posición 1

    System.out.println("El producto escalar entre los vectores es: "+ productoescalar);

}

}

/*EJERCICIO10: Escribir un programa que rellene una matriz cuadrada (las
 dimensiones de la matriz serán un parámetro que se pida al usuario) con
 números aleatorios de tal modo que la matriz sea simétrica. Imprimir la
 matriz por pantalla. Realice todo en una única función a la que se llama
 desde el main.

*/

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
    
    Scanner scanner =new Scanner (System.in);
    System.out.println("Introduce la dimensión de la matriz cuadrada: ");
    int dimension= scanner.nextInt();
    int matrizCuadrada[][]= generarMatriz(dimension);//new int[dimension][dimension];
    System.out.println("\nLa matriz cuadrada es: ");
    imprimirMatriz(matrizCuadrada);
}

public static int [][] generarMatriz(int dimension){

    int matriz[][]= new int [dimension][dimension];

    /*Para que sea simétrica, tiene que ser igual a su traspuesta; de manera que llenaremos la mitad superior 
    de la matriz de números aleatorios
     */

     for (int i=0; i<dimension;i++){
        for(int j=0; j<dimension; i++){
            int numAleatorio= (int) (Math.random()*100);//Números aleatorios entre 0 y 99
            matriz[i][j]=numAleatorio;
            matriz[j][i]=numAleatorio;

        }

     }

     return matriz;

}

public static void imprimirMatriz(int matriz [][]){ //Imprimir -> void ya que no va a devolver nada

    for (int i=0; i<matriz.length;i++){
        for(int j=0;j<matriz.length;j++){

            System.out.println(matriz[i][j]+ "\t");
        }
        System.out.println();
    }
}


}

/*No imprime la matriz, pero debería de imprimir una matriz del tipo:

123
260
309

*/
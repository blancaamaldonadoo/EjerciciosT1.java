/*EJERCICIO 11: Escribir un programa que multiplique dos matrices. Sus
 dimensiones y valores deben de solicitarse al usuario por teclado y tras
 realizar la multiplicación debe visualizarse en pantalla ambas matrices y el
 resultado de la multiplicación. Cree una nueva función similar al ejercicio
 9 pero que recibirá vectores de varias dimensiones. Realice otra función
 multiplicar matrices que reciba dos arrays de dos dimensiones que
 representan 2 vectores y devuelva otro array de dos dimensiones que
 contenga su multiplicación. En caso de no ser compatibles las dimensiones
 la función indicará que ha habido un error.
 */

import java.util.Scanner;

public class Ejercicio11 {

    public static int [][] RecibeDimensiones() {
        
        System.out.println("Introduce la dimension de la matriz1: (filas columnas) ");
        Scanner scanner= new Scanner(System.in);
        int filas1= scanner.nextInt();
        int columnas1=scanner.nextInt();

        System.out.println("Introduce la dimension de la matriz2: (filas columnas): ");
        int filas2= scanner.nextInt();
        int columnas2=scanner.nextInt();

        if (columnas1!=filas2) {
            System.out.println("Error. Las columnas de la primera matriz tienen que coincidir con el numeo de filas de la segunda.");
            System.out.println("Introduce la dimension de la matriz1: (filas columnas): ");
            filas1= scanner.nextInt();
            columnas1=scanner.nextInt();

            System.out.println("Introduce la dimension de la matriz2: (filas columnas): ");
            filas2= scanner.nextInt();
            columnas2=scanner.nextInt();
        }

        int matriz1[][]= new int [filas1][columnas1];
        int matriz2[][]= new int [filas2][columnas2];

        System.out.println("\nIntroduce los elementos de la primera matriz: ");
        for (int k=0; k<filas1; k++){
           for (int l=0; l<columnas1;l++){
            matriz1[k][l]=scanner.nextInt();
           }

        }

        System.out.println("\nIntroduce los elementos de la segunda matriz: ");
        for (int m=0; m<filas1; m++){
           for (int n=0; n<columnas1;n++){
            matriz1[m][n]=scanner.nextInt();
           }

        }
        
        return new int[][]{{filas1,columnas1}, {filas2,columnas2}};
    }



    public static int[][] GenerarMatriz(int filas, int columnas){

        return new int[filas][columnas];
        
    }

    public static int [][] ProductoMatrices (int[][] matriz1, int[][] matriz2){

        int filas1=matriz1.length;
        int columnas1=matriz1[0].length;
         filas1= matriz2.length;
        int columnas2=matriz2[0].length;

        int [][] resultado= new int [filas1][columnas2];
        
        for (int i=0; i<filas1;i++){
            for (int j=0; j<columnas2;j++){
                resultado[i][j]=resultado[i][j]+(matriz1[i][j]*matriz2[j][i]);
            }
        }

        return resultado;

    }

    public static void main(String[] args) {
        
        //Solicitar dimensiones:
        int[][] dimensiones=RecibeDimensiones();
        int filas1= dimensiones[0][0];
        int columnas1= dimensiones[0][1];
        int filas2= dimensiones [1][0];
        int columnas2= dimensiones[1][1];
        
        //Generamos las matrices: 
        int[][] matriz1= GenerarMatriz(filas1,columnas1);
        int [][] matriz2= GenerarMatriz(filas2,columnas2);

        if (columnas1!=filas2) {
            System.out.println("Error. Las columnas de la primera matriz tienen que coincidir con el numeo de filas de la segunda.");
            RecibeDimensiones();
        }

        int [][] result=ProductoMatrices(matriz1, matriz2);        

    }




}

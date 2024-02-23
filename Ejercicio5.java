/*EJERCICIO 5: Escribe un programa que visualice por pantalla la tabla de multiplicar 
de los 10 primeros números naturales. Utilizar una función que reciba un número N 
y devuelva un array de arrays con las tablas de multiplicar de 0 a 9 de los N números. */

public class Ejercicio5 {

    public static void main(String[] args) {
        
    int n=10;

    System.out.println("\nLa tabla de multiplicar del 0 al " + n);
    System.out.println( tablasm(n));
    
    }

    public static int[][] tablasm(int N){

        int [][] tablaMultiplicar= new int [N][10];


        for (int i=0; i<=N; i++){

            for (int j=0; j<=9;j++){

                tablaMultiplicar[i][j]= (i*j);
                System.out.println("\n"+i+ " * "+j+ " = " + i*j);

            }
        }
        
            return tablaMultiplicar;


    }
    
}

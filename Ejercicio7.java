/*EJERCICIO7: Escribe un programa que lea un número entero de teclado, lo
 guarde en una variable, lo envíe a una función que lo descomponga en
 factores primos, y dicha función devuelva un array que contenga los factores
 primos. Posteriormente imprima el array en el main. ; por ejemplo 40 = 2 * 2
 * 2 * 5.
*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int numero= scanner.nextInt();

    int arrayNumerosPrimos[]= DescomposiciónFP(numero);
    imprimirFP(arrayNumerosPrimos);
    
    
}


    public static int[] DescomposiciónFP (int n){

        int factoresPrimos[] = new int[1000];
        int contador=0;
        for (int i=2; i<=n; i++){

           while (n%i==0){

            factoresPrimos[contador]=i;
            contador++;
            n=n/i;

           }

        }

        return factoresPrimos;
    
    }



    public static void imprimirFP(int[] arrayFP){  

        for (int j=0;j<arrayFP.length&&arrayFP[j]!=0;j++){ //Queremos imprimir el array de la longitud que haya guardado de numeros primos;
                                                            //y hasta donde valga cero(sino imprimirá un bucle de ceros)

            System.out.println(arrayFP[j] + " * ");

        }
    }
}










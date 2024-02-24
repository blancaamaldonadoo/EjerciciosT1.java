/*EJERCICIO 8:
Empleando un array, escribir un programa que pida al usuario
 números enteros hasta que se introduzca el número 0. A continuación,
 calcular la media, el mínimo y el máximo de los datos introducidos. Utilice
 funciones independientes para: a) recibir N números enteros por teclado
 hasta que el usuario introduzca un 0; b) Calcule la media de los elementos de
 un array; c) calcule el mínimo de los elementos de un array; y d) Calcule el
 máximo de los elementos de un array.
*/

import java.util.Scanner;

public class Ejercicio8 {

public static int [] IntroducirNumeros (){

    int arrayNumeros[]= new int[100];

    Scanner scanner= new Scanner(System.in);
    System.out.println("\nIntroduzca un numero (introduzca el cero para parar la lista): ");
    int numeroIntrod= scanner.nextInt();
    arrayNumeros[0]=numeroIntrod;
    int i=0;

    while (numeroIntrod!=0 && i<100){
        System.out.println("Introduzca un numero: ");
        numeroIntrod= scanner.nextInt();
        
        arrayNumeros[i]=numeroIntrod;
        i++;

    }

    return arrayNumeros;

}

public static int CalcularMedia(int[] arrayNumeros, int longitud){

    int suma=0;
    for (int k=0; k<longitud; k++){

        suma=suma+arrayNumeros[k];

    }

    int media= suma/longitud;
    return media;
}

public static int CalcularMinimo(int []numerosMin, int longitud){

    int minimo=numerosMin[0];
    for (int c=1; c<numerosMin.length;c++){
    
        if (numerosMin[c]<minimo){
            minimo=numerosMin[c];
        }
    }
    return minimo;

}

public static int CalcularMaximo(int[] numerosMax, int longitud){
    int maximo=numerosMax[0];
    for (int c=1; c<numerosMax.length;c++){
    
        if (numerosMax[c]>maximo){
            maximo=numerosMax[c];
        }
    }
    return maximo;


}

public static void main(String[] args) {
    
    int[] arrayNumeros= IntroducirNumeros();
    int longitud=0;
    //Buscamos la longitud del array:

    for (int num: arrayNumeros){
        if (num==0) break;
        longitud++;
    }

    int media=CalcularMedia(arrayNumeros, longitud);
    int minimo=CalcularMinimo(arrayNumeros, longitud);
    int maximo= CalcularMaximo(arrayNumeros, longitud);

    System.out.println("\nLa media de los números introducidos es: " + media);
    System.out.println("\nEl mínimo de los números introducidos es: " + minimo);
    System.out.println("\nLa máximo de los números introducidos es: " + maximo);


}


}

/*EJERCICIO 4: Escribe un programa que calcule el mínimo y el máximo de
 una lista de números enteros positivos introducidos por el usuario. La lista
 finalizará cuando se introduzca un número negativo. */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nIntroduzca un número (negativo para finalizar): ");
        int numero= scanner.nextInt();
        int array[]= new int[100];
        int i=0;
        array[i]=numero;
        int minimo=numero;
        int maximo=numero;

        while(numero>=0){

            i++;
            System.out.println("\nIntroduzca un número (negativo para finalizar): ");
            numero= scanner.nextInt();
            if (numero<0)  break; 
            array[i]=numero;
            if (numero<minimo) minimo=numero;
            if (numero>maximo) maximo=numero;
            else continue; 
           


    }

    if (numero<0){

        System.out.println("\nEl máximo introducido es el: " + maximo);
        System.out.println("\nEl mínimo introducido es el: " + minimo);

    }

    }
}

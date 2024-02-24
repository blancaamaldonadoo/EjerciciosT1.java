/*EJERCICIO12: Escribe un programa que acepte una cadena de caracteres (que
 podrá contener cualquier carácter a excepción del retorno de carro) y que
 diga cuántas vocales contiene. Realice la entrada de teclado en una
 función (lectura de una string) y el cálculo de vocales de una string en
 otra función independiente que reciba una string y devuelva un entero. 

 */

import java.util.Scanner;

public class Ejercicio12 {

   public static void main (String[] arg){

    String cadena= leerCadena();
    System.out.println("La cadena de caracteres: " + cadena + " tiene "+ contarVocales(cadena)+ " vocales.");

   } 


   public static String leerCadena(){

    Scanner scanner=new Scanner(System.in);
    System.out.println("Introduce una cadena de caracteres: ");
    String cadena=scanner.nextLine();
    return cadena;
    
   }

   public static int contarVocales (String cadchar){

    int contador=0;
    for (char letra: cadchar){

        if (letra==a||e||i||o||u){
            contador++;
        }
    }
    return contador;

   }



}

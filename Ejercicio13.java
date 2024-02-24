/*EJERCICIO13: Escribe un programa que acepte una cadena de caracteres (que
 podrá contener cualquier carácter a excepción del retorno de carro) y que la
 escriba al revés. Reutiliza la función del ejercicio para la entrada de teclado y
 otra función que invierta la cadena.  */

import java.util.Scanner;

public class Ejercicio13 {


    public static String leerCadena(){

    Scanner scanner=new Scanner(System.in);
    System.out.println("Introduce una cadena de caracteres: ");
    String cadena=scanner.nextLine();
    return cadena;
    
   }

   public static String invertirCadena(String cadena){//Para invertir una cadena empleamos StringBuilder/StringBuffer

    StringBuffer cadInvertida= new StringBuffer();

    for (int i=cadena.length()-1; i>=0; i--){

        cadInvertida.append(cadena.charAt(i));

    }

    return cadInvertida.toString(); 
   }

    public static void main(String[] args){

        String cadenacaracteres= leerCadena();   

        System.out.println("La cadena invertida de: " + cadenacaracteres+ " es: " + invertirCadena(cadenacaracteres));

    }

}

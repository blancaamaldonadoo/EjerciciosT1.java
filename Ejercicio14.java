/*EJERCICIO14:  Escribe un programa que lee una cadena de caracteres de
 teclado e indique si es o no palíndroma (se lee igual de izquierda a derecha
 que de derecha a izquierda, sin tener en cuenta los espacios en blanco y las
 mayúsculas). Por ejemplo: "dábale arroz a la zorra el abad". Reutilice la
 función del ejercicio 12 para la entrada de teclado y cree otra función
 que dada una cadena de caracteres devuelva un boolean indicando si es
 o no palíndroma */

import java.util.Scanner;

public class Ejercicio14 {

public static void main(String[] args) {
    
    String cadenaEntrada= leerCadena();
    boolean esPalindroma= palindroma(cadenaEntrada);

    if(esPalindroma) System.out.println("La cadena introducida es palíndroma");
    else System.out.println("La cadena introducida no es palíndroma");

}



public static String leerCadena(){

    Scanner scanner=new Scanner(System.in);
    System.out.println("Introduce una cadena de caracteres: ");
    String cadena=scanner.nextLine();
    return cadena;
    
   }

public static boolean palindroma(String cadena){

String cadenaSinEspacios= cadena.replaceAll("\\s", "").toLowerCase(); //quita espacios en blanco
String cadenaInvertida= invertirCadena(cadenaSinEspacios);

return cadenaSinEspacios.equals(cadenaInvertida); //Compara si son iguales o no 

}

public static String invertirCadena(String cadena){//Para invertir una cadena empleamos StringBuilder/StringBuffer

    StringBuffer cadInvertida= new StringBuffer();

    for (int i=cadena.length()-1; i>=0; i--){

        cadInvertida.append(cadena.charAt(i));

    }

    return cadInvertida.toString(); 
   }

}

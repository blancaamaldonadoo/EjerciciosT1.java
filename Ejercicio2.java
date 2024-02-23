/*EJERCICIO2: Escribir un programa que muestre por consola los mayores
 números enteros que se pueden representar mediante un char, short e int.*/

 public class Ejercicio2{

    public static void main(String[] args){

        System.out.println("Mayor char: " + (int)Character.MAX_VALUE); //empleamos un cast para que nos de el resultado en entero
        System.out.println("Mayor short: " + Short.MAX_VALUE);
        System.out.println("Mayor int: " + Integer.MAX_VALUE);


    }

 }
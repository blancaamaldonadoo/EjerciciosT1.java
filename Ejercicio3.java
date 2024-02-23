/*EJERCICIO 3: Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. 
Calcular además cuantos hay (ver operaciones sobre arrays) y visualizar cada uno de ellos. 
Utilizar una función que reciba el número de múltiplos de 5 y devuelva un array conteniendo 
todos los múltiplos de 5 desde el valor del parámetro begin hasta el valor del parámetro end. 
Realizar otra función que dado un array como parámetro, lo recorra de inicio a fin y 
devuelva la suma de todos sus valores. 
 */

public class Ejercicio3 {

    public static void main (String[] args){

        int begin=1;
        int end=100;

        int[] multiplos = obtenerMultiplos(begin, end);
        System.out.println("\nMúltiplos de 5 entre 1 y 100: ");
        mostrarArray(multiplos);
        
        System.out.println("Hay " + multiplos+" múltiplos de 5 entre 1 y 100.");
        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es de: " + sumatorio(multiplos));

    }


    public static int[] obtenerMultiplos (int begin, int end){
       
        int multiplos[]= new int[100/5];

        int j=0; 

        for (int i=begin; i<= end ;i++){
            
            if(i%5==0){
            multiplos[j]=i;
            j++;
            }

        }

        return multiplos;
    }
    
    public static void mostrarArray(int[] a){
        for (int k: a){
            System.out.println(k);
        }

        System.out.println();
    }

    public static int sumatorio(int[] s){

        int suma=0;
        for (int e: s){
            suma=suma+e;
        }
        return suma;
    }

    
}

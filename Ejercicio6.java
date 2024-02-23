/*EJERCICIO 6: Escribe un programa que muestre por pantalla la lista de los N
 primeros números primos. Realiza una función que reciba N, devuelve un
 array conteniendo los N primeros números primos y posteriormente
 imprima el array en el main. */

public class Ejercicio6 {

    public static void main(String[] args) {
        
        int n=15;

        int [] nPrimos= ObtenerPrimos(n);//Creamos un array donde poder aplicar la funcion "ObtenerPrimos"
        System.out.println("\nLos primeros " + n + " números primos son: \n");

        verArray(nPrimos);
    }
    
    public static int[] ObtenerPrimos(int n){

        int[] numerosprimos= new int[n];
        int contador=0;
        int i=2;

        while(contador<n){
            if (esPrimo(n)){
                numerosprimos[contador]=i;
                contador++;
            }

            i++;
        }

        return numerosprimos;

    }

    public static boolean esPrimo(int num){

        if (num<2) return true;

        for (int j=2; j<num; j++){

            if(num%j==0) return false;
        }

        return true;
    }

    public static void verArray(int[] aNP){

        for (int elemento: aNP){

            System.out.println(elemento + "\n"); //Se imprime cada elemento del array que se ha ido introduciendo según sea o no primo
        }
    }

}


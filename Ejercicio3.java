/*EJERCICIO 3: Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. 
Calcular además cuantos hay (ver operaciones sobre arrays) y visualizar cada uno de ellos. 
Utilizar una función que reciba el número de múltiplos de 5 y devuelva un array conteniedo 
todos los múltiplos de 5 desde el valor del parámetro begin hasta el valor del parámetro end. 
Realizar otra función que dado un array como parámetro, lo recorra de inicio a fin y 
devuelva la suma de todos sus valores. 
 */

public class Ejercicio3 {


    public static int tabla (int numeroMultiplos){
       
        int arrayMultiplos[]= new int[numeroMultiplos];
        for (int j=0; j<numeroMultiplos;j++){

            arrayMultiplos[j]=5*j;

        }

        System.out.println(arrayMultiplos);
        return 0;
    }



    public static void main (String[] args){

        int suma=0;
        int b=1;
        int contador=0;
        System.out.println("Múltiplos de 5: \n");
        
        for(int i=1; b<100; i++){
            
            b=i*5;
            suma=suma+b;
            contador++;
        
        }

        System.out.println("Hay "+contador+" múltiplos de 5 entre 1 y 100.");
        tabla(contador);

    }
    
    
}

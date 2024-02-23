/*Escribir un programa que defina variables que representen el número de días de un año, 
el número de horas que tiene un día, el número de minutos que tiene una hora y 
el número de segundos que tiene un minuto. Emplear las variables que ocupen el mínimo espacio
 de memoria posible. A continuación, calcular el número de segundos que tiene un año 
 y almacenar el valor del cálculo en otra variable. 
 Realizar preferiblemente mediante una función que reciba como parámetros el número de años, meses
 y días y devuelva el número de segundos de los días, meses y años introducidos.*/

import java.util.Scanner;

public class Ejercicio1{

  public static int segsAno(int anos,int meses,int dias){
    int dias_ano=365;
    int horas_dia=24;
    int minutos_hora=60;
    int segundos_minuto=60;

    int segstotales= (anos*dias_ano*horas_dia*minutos_hora*segundos_minuto)+(meses*31*horas_dia*minutos_hora*segundos_minuto)
    +(dias*horas_dia*minutos_hora*segundos_minuto);

    return segstotales;
  }


 public static void main(String[] args){

  Scanner scanner= new Scanner(System.in);

  //Para que introduzca el numero de años,meses y días, utilizamos System.in

  System.out.println("Introduzca el número de años");
  int anosintrod= scanner.nextInt();
  

  System.out.println("Introduzca el número de meses");
  int mesesintrod= scanner.nextInt();


  System.out.println("Introduzca el número de días");
  int diasintrod= scanner.nextInt();

  int solucion= segsAno(anosintrod, mesesintrod, diasintrod);
  System.out.println("El número de segundos para los " + anosintrod+ " años, " + mesesintrod+ " meses y "
  + diasintrod + " dias, son: " + solucion + " segundos");

 }

 }
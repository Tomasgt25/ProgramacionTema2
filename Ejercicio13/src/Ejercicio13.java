package Ejercicio13;
/* Programa que calcule la suma de los 100 primeros números*/

public class Ejercicio13 {
    public static void main(String[] args) {
        int suma=0; //ACUMULADOR
        for (int i= 0; i<=100; i=i+1){
            suma+=1;

            System.out.println("La suma de los 100 primeros números es: " + i);
       /* Esto también se haría con la fórmula de Gauss:
       System.print.outln ((n*(n+1)/2));
       (n*(n+1)/2)
        */

        }
    }
}
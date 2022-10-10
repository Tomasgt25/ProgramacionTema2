

import java.util.Scanner;

/* Programa que me pida 5 números y me diga cual es
el mayor usando "for"
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mayor=0, num;

        for(int i=0; i<=4; i=i+1){
            System.out.println("Introduzca un número");
            num= sc.nextInt();
            mayor=num;
            if (num>mayor);{

            }
        }
        System.out.println("El número mayor es: " + mayor);

    }
}
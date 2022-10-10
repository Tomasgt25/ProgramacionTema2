/* Escribir un programa que pida al usuario
una palabra y lo muestre por pantalla 10 veces
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cadena;
        System.out.println("Introduzca una palabra");
       cadena = sc.next();
       for (int i=1; i<=10; i++) {

           System.out.println(cadena);
       }




    }
}
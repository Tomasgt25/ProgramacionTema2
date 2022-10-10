/* Programa que pida al usuario un número entero
y muestre por pantalla un triángulo rectángulo como el de más abajo,
de altura el número introducido
*
**
***
****
*****
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int num;
       String cad ="";
        System.out.println("Introduzca un número");
        Scanner sc= new Scanner(System.in);
        num =sc.nextInt();
        for (int i=1; i<=num; i++){
            cad = cad + "*";
            System.out.println(cad);
            }

        }
}
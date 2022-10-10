import java.util.Scanner;

/* Programa que pida un número impar
y te ponga todos los números impares hasta ese número
 */
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un número");
       num =sc.nextInt();
        for (int i=1; i<=num; i=i+2) {
            System.out.print(i);
            if (i<num){
                System.out.print(",");
            }
        }
    }
}
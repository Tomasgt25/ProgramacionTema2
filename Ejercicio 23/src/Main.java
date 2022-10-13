import java.util.Scanner;

/* Hacer un programa que pida 10 números, los guarde
y los muestre en orden inverso
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num[]=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número: ");
            num[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((num[9 - i] + " "));
        }
    }
}
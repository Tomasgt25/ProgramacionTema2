import java.util.Scanner;

/*Programa que pida un número entero
y muestre su tabla de multiplicar
 */
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número");
        num=sc.nextInt();
        for (int i=0; i<=10; i++){
            System.out.println(num + "x"+i+"="+ num*i);
        }
    }
}

/*
programa que pida dos números
y muestre por pantalla los números
desde el menor hasta el mayor
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int num1,num2, menor, mayor;

    Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca dos números distintos: ");
        num1= sc.nextInt();
        num2= sc.nextInt();
        if (num1>num2){
            mayor=num1;
            menor=num2;
        }
        else
        {
            mayor=num2;
            menor=num1;
        }
        for (int i = menor; i <=mayor ; i++) {
            System.out.println(i);
        }
    }
}

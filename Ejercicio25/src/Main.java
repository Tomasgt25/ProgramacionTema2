// Programa que compruebe si la última cifra de dos números es igual o no

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Introduzca dos números: ");
        int num1, num2;
        num1= sc.nextInt();
        num2= sc.nextInt();
        if ((num2-num1)%10==0){
            System.out.println("Acaban en el mismo dígito.");

        }
            else   {
                System.out.println("El último dígito es diferente");
            }


    }
}
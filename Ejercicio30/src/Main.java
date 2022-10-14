import java.util.Scanner;

/* Programa que diga si un número de tres cifras es capicúa

 */
public class Main {
    public static void main(String[] args) {
      /*  int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el número de tres dígitos: ");
        num = sc.nextInt();
        if (num%10==num/100) {
            System.out.println("El número es capicúa.");
        }
        else {
            System.out.println("El número no es capicúa.");
            }*/
        Scanner sc= new Scanner(System.in);
        int num;
        String cad;
        System.out.println("Introduzca un número de tres cifras:");
                num=sc.nextInt();
        cad=Integer.toString(num);

        if(cad.charAt(0)==cad.charAt(2)){

            System.out.println("Es capicúa.");
        }else {
            System.out.println("No es capicúa.");

        }
    }
    }
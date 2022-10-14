import java.util.Scanner;

//Programa que pida un año y diga si es bisiesto o no
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Introduzca el año: ");
        year = sc.nextInt();
        if ((year%4==0) && (year%100 !=0) || (year%400==0)){
            System.out.println("El año es bisiesto.");
        }else {
            System.out.println("El año no es bisiesto.");
        }
    }
}
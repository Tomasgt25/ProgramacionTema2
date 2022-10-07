import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad1= sc.nextInt();

        if (edad1>=18){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad.");
        }
    }
}
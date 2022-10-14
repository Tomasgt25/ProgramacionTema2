import java.util.Scanner;

// programa que lea dos caracteres y diga si son minúsculas
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        String cad;
        System.out.println("Introduzca el primer caracter: ");
        num1 =(sc.next()).charAt(0);
        System.out.println("Introduzca el segundo caracter: ");
        num2 =(sc.next()).charAt(0);
        if ((97 <= num1 && num1 <=122 || num1==241) && (97 <= num2 && num2 <=122|| num2==241)){
            System.out.println("Son minúsculas");
        }else {
            System.out.println("No son minúsculas");
        }
    }
}
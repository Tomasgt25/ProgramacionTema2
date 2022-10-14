import java.util.Scanner;

/*Programa que lea dos caracteres por teclado
y diga si son iguales
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        String cad;
        System.out.println("Introduzca el primer caracter: ");
        cad=sc.next();
        num1=cad.charAt(0);
        //num1 = (sc.next()).charAt(0);
        System.out.println("Introduzca el segundo caracter: ");
        cad=sc.next();
        num2=cad.charAt(0);
        //num2 =(sc.next()).charAt(0);

        if (num1==num2) {
            System.out.println("Los dos caracteres son iguales.");
        }
        else {
            System.out.println("Los dos caracteres no son iguales.");
        }
    }
}
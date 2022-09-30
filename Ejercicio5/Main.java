import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();

        int division = num1/num2;
        if (division == 0) {
            System.out.println("Error");        }

        else {
                System.out.println("Este es el resultado de la división: " + division);
            }

    }
}

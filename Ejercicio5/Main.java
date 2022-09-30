import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1,num2;
        System.out.println("Introduzca un número");
        num1=sc.nextFloat();
        System.out.println("Introduzca otro número");
        num2=sc.nextFloat();

        float  z=num1/num2;
        if (num2 == 0){
            System.out.println("Resultado: "+(num1/num2));
        }
        else {
            System.out.println("No se puede dividir");
        }
    }
}

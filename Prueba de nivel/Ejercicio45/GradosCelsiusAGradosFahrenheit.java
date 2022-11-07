import java.util.Scanner;

public class GradosCelsiusAGradosFahrenheit {
    public static void main(String[] args) {
        int Celsius, Fahrehneit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la temperatura actual: ");
        Celsius= sc.nextInt();
        Fahrehneit= ((Celsius*9)/5)+32;
        System.out.println("La temperatura en Fahrenheit es: " +Fahrehneit);

    }
}

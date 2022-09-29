import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidad;
        Scanner ad= new Scanner(System.in);
        System.out.println("Introduzca la cantidad:");
        cantidad = ad.nextInt();

        int b500 = cantidad/500;
        int b200 = (cantidad%500)/200;
        int b100 = ((cantidad%500)%200)/100;
        int b50 = (((cantidad%500)%200)%100)/50;
        int b20 = ((((cantidad%500)%200)%100)%50)/20;
        int b10 = (((((cantidad%500)%200)%100)%50)%20)/10;
        int b5 = ((((((cantidad%500)%200)%100)%50)%20)%10)/5;
        int m2 = (((((((cantidad%500)%200)%100)%50)%20)%10)%5)/2;
        int m1 = (((((((cantidad%500)%200)%100)%50)%20)%10)%5)%2;
        System.out.println("Necesita: " + b500 + " billetes de 500");
        System.out.println("Necesita: " + b200 + " billetes de 200");
        System.out.println("Necesita: " + b100 + " billetes de 100");
        System.out.println("Necesita: " + b50 + " billetes de 50");
        System.out.println("Necesita: " + b20 + " billetes de 20");
        System.out.println("Necesita: " + b10 + " billetes de 10");
        System.out.println("Necesita: " + b5 + " billetes de 5");
        System.out.println("Necesita: " + m2 + " monedas de 2");
        System.out.println("Necesita: " + m1 + " monedas de 1");
    }
}

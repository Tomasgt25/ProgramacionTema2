package Punto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int coord1,coord2;
    Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca la coordenada 1: ");
        coord1= teclado.nextInt();
        System.out.println("Introduzca la coordenada 2: ");
        coord2= teclado.nextInt();
        Punto punto1 =new Punto();
        punto1.setCoord1(coord1);
        punto1.setCoord2(coord2);
    }
}

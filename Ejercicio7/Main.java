/* Hacer un programa que pida los coeficientes
de una ecuación de segundo grado y calcule sus soluciones*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, x1, x2;
        System.out.println("Introduzca el valor del coeficiente de segundo grado:");
        a = sc.nextFloat();
        System.out.println("Introduzca el valor del coeficiente:");
        b = sc.nextFloat();
        System.out.println("Introduzca el valor del término independiente:");
        c = sc.nextFloat();

        if (a == 0) {
            System.out.println("Solución : " + (-c / b));
        } else {
            if (b * b >= 4 * a * c) {
                System.out.println("Primera solución: " + ((-b + Math.sqrt(b * b - 4 * a * c))/2));
                System.out.println("Segunda solución: " + ((-b + Math.sqrt(b * b + 4 * a * c))/2));
            } else {
                System.out.println("La solución es un número imaginario");
            }
        }
    }
    }



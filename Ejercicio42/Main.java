import java.util.Scanner;

/* Programa que muestre las tablas de multiplicar del 1 al 10

 */
public class Main {
    public static void main(String[] args) {
        for (int num = 1; num <=10 ; num++) {
            for (int i = 0; i <=10 ; i++) {
                System.out.println(i+"x"+num+"="+(i*num));
            }System.out.println("\n");
        }

        }
    }

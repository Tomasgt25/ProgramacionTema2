package Ejercicio15;

import java.util.Random;

/* Programa que me genere la combinación necesaria para poder echar
la primitiva
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int rand = 0;
        //Scanner sc=new Scanner(System.in);
        for (int i=1; i<=5; i++) {
            Random ale = new Random();
            rand = ale.nextInt(1, 50);
            System.out.print(rand+ " ");
        }
    }
}
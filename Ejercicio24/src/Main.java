/*Programa que genere 10 números de manera aleatoria
y me diga una vez leídos cuantos son pares y cuantos impares
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca 10 números: ");
        int num[]=new int[10];
        for (int i = 0; i < 10; i++) {
            num[i]= sc.nextInt();
        }

        int cont =0;
        for (int i = 0; i < 9; i++) {
            if (num[i]%2==0){
                cont++;
                System.out.println("Hay "+cont+ " pares y "+(10-cont)+" impares.");
            }


                }



        }
        }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo");
        num =sc.nextInt();
        for (int i=num; i<=num; i=i-2){
            System.out.print(i);
            if (i == 0){
                break;
            }
            if (i<=num){
                System.out.print(",");

            }

            }
        }


    }

import java.util.Scanner;

/* Comprobar si dos números enteros terminan con la misma cifra

 */
public class Main {
    public static void main(String[] args) {
      int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un número:");
        num1= sc.nextInt();
        System.out.println("Introduzca otro número:");
        num2=sc.nextInt();
        if (num1%10 ==num2%10) {
            System.out.println("Los dos números terminan con la misma cifra.");
        } else {
            System.out.println("Los dos números no terminan con la misma cifra.");
        }
    }
}
/*
 Integer num1, num2; String str1,str2;

        System.out.println("Introduzca el primer número😊;
        num1=sc.nextInt();
        System.out.println("Introduzca el segundo número😊;
        num2=sc.nextInt();
        str1=num1.toString();  str2=num2.toString();

        if(str1.charAt(str1.length())==str2.charAt(str2.length())){
         System.out.println("Acaban en la misma cifra.");
        }else{
         System.out.println("No acaban en la misma cifra.");
        }
 */
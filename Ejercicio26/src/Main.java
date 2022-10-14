import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Introduzca dos números: ");
        int num1, num2;
        String cad;
        num1= sc.nextInt();
        num2= sc.nextInt();
        if ((num2-num1)%10==0){
            System.out.println("Acaban en el mismo dígito.");
            cad =Integer.toString(num2);
            System.out.println("Último digito: "+ cad.charAt(cad.length()-1));

        }
        else   {
            System.out.println("El último dígito es diferente");
        }


    }
}
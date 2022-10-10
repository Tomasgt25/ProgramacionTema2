import java.util.Scanner;

/*Escribir un programa que pregunte al usuario una cantidad a invertir
el interés anual y el número de años, y muestre por pantalla el capital
obtenido en la inversión cada año que dura la inversión
 */
public class Main {
    public static void main(String[] args) {
       float cantidad, interesAnual, numeroDeAños, rendimientoAnual, capitalObtenido;
        //(cantidad*interesAnual)/100
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad a invertir, el interés anual y el número de años: ");
        cantidad= sc.nextInt();
        interesAnual= sc.nextInt();
        numeroDeAños= sc.nextInt();
        rendimientoAnual =(cantidad*interesAnual)/100;


        for (int i=1; i<=numeroDeAños; i++){
            System.out.println("Usted ha obtenido " +rendimientoAnual*numeroDeAños*i);
        }

    }
}
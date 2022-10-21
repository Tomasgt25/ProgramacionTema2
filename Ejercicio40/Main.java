import java.util.Scanner;

/*
programa que cuente el número de palabras de una frase

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        String a;
        char[] caracteres;
        System.out.println("Introduzca una frase o una palabra: ");
        a=sc.nextLine();
        caracteres=a.toCharArray();
        for (int i =caracteres.length; i > 0; i++) {
            cont++;

        }
        System.out.println("El número de palabras es: "+cont);



    }
}

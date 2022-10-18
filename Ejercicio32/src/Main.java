import java.util.Scanner;

/* Programa que te diga si una palabra o frase es palíndroma

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        String a;
        String b;
        char[] caracteres;
        System.out.println("Introduzca una frase o una palabra: ");
        a=sc.nextLine();
        caracteres=a.toCharArray();
      /* System.out.println(caracteres[]);
        System.out.println(a);

       */
        char[] inverso = new char[caracteres.length];
        for (int i = caracteres.length; i > 0; i--) {
            inverso[cont]=caracteres[i-1];
            cont++;
        }
        b= new String(inverso);
        if (a.equals(b)){
            System.out.println("Es palíndroma.");
        } else {
            System.out.println("No es palíndroma.");
        }
    }
}
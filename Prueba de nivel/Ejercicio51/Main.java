import java.util.Scanner;

// Contar el número de palabras de una frase
public class Main {
    public static void main(String[] args) {
        String a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        a= teclado.nextLine();;
     int cont=1, posicion;
     a=a.trim();
     posicion=a.indexOf(" ");
     while (posicion !=-1) {
         cont++;
         posicion=a.indexOf(" ", posicion+1);
     }
        System.out.println( "El número de palabras es: "+cont);
    }
}
/*
String frase;int contadorEspaciosBlanco=0;
        System.out.println("Introduzca una frase: ");
        frase= sc.nextLine();
        for(int i=0;i<=frase.length()-1;i++){
          if(frase.charAt(i)==' ')
          {
              contadorEspaciosBlanco++;
          }
        }
         System.out.println("La frase tiene "+(contadorEspaciosBlanco+1)+"palabras");
 */
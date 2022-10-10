
import java.util.Random;

/* Programa que me genere la combinación necesaria para poder echar
la primitiva
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int rand = 0;
        Random ale = new Random();
        //Scanner sc=new Scanner(System.in);
        for (int i=1; i<=5; i++) {
            rand = ale.nextInt(1, 50);
            //Buscar una alternativa para solucionar el random
            System.out.print(rand+ " ");
        }
    }
}
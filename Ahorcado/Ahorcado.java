import java.util.Scanner;

/*
1.- Generar palabra aleatoria
2.- Pedir caracter mediante bucle
3.- Si coincide: Generar cadena ( dos strings: uno que al meterle un caracter me diga
si hay coincidencia
4.- Si no coincide: añadir una pieza al ahorcado
 */
public class Ahorcado {
    boolean ahorcado (int num){
        int count=0;
        if (count == 1){
            System.out.println("Primer intento");
        } else if (count==2) {
            System.out.println("Segundo intento");
        } else if (count==3) {
            System.out.println("Tercer intento");
        } else if (count==4) {
            System.out.println("Cuarto intento");
        } else if (count==5) {
            System.out.println("Quinto intento");
        } else if (count==6) {
            System.out.println("Sexto intento, te queda un último intento");
        }else{
            System.out.println("Has muerto");
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra= teclado.nextLine();
        char[]caracteres=new char[10];
        char[]caracteres=palabra.toCharArray();
    }
}

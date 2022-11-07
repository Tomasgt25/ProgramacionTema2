import java.util.Scanner;
import java.lang.Math;

public class VolumenEsfera {
    public static void main(String[] args) {
        int radio;
        System.out.println("Introduzca el radio de la esfera: ");
        Scanner sc= new Scanner(System.in);
        radio=sc.nextInt();
        double volumen;
        volumen = (4 * (Math.PI * Math.pow(radio,3)))/3;
        System.out.println("El volumen de la esfera es: "+volumen);


    }
}

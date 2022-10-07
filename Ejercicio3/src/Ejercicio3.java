import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double perimetro;

        System.out.println("Indique el radio");
        radio=sc .nextDouble();
        double area = Math.pow(radio,2)*Math.PI;
        perimetro = 2*Math.PI*radio;
        System.out.println("El área es " + ((double) Math.round(area*100d) /100d));
        System.out.println("El perimetro es " + (double) Math.round(perimetro*100d) /100d);
    }
}

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base1,altura1,base2,altura2;
        System.out.println("Introduzca la base del primer rectángulo:");
        base1=sc.nextFloat();
        System.out.println("Introduzca la altura del primer rectángulo:");
        altura1=sc.nextFloat();
        System.out.println("Introduzca la base del segundo rectángulo:");
        base2=sc.nextFloat();
        System.out.println("Introduzca la altura del segundo rectángulo:");
        altura2=sc.nextFloat();

        float area1 = base1*altura1;
        float area2 = base2*altura2;
        if (area1>area2) {
            System.out.println("El rectángulo 1 tiene mayor área");
        }
        else if (area1 == area2) {
            System.out.println("Los dos rectángulos tienen el mismo área");
        }
        else {
            System.out.println("El rectángulo 2 tiene mayor área");
        }
    }
}

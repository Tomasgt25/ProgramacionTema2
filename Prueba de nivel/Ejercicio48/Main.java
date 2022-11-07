import java.util.Scanner;

/*Programa que lea dos números
y muestre los números desde el menor hasta el mayor
 */
public class Main {
    public static void main(String[] args) {
        int menor,mayor;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        menor=sc.nextInt();
        System.out.println("Introduzca otro número: ");
        mayor=sc.nextInt();
        for (int i = menor; i <=mayor ; i++) {
            System.out.println(i);
        }
    }
}

/*
int mayor,menor;
        System.out.println("Introduzca el primer número😊;
        int numBis1=sc.nextInt();
        System.out.println("Introduzca el segundo número😊;
        int numBis2=sc.nextInt();
        if(numBis1>numBis2){mayor=numBis1; menor=numBis2;}
        else{mayor=numBis2;menor=numBis1;}

        for(int j=menor;j<=mayor;j++){
            System.out.print(j+" ");
        }
 */
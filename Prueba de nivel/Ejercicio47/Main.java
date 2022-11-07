import java.util.Scanner;

// Ejercicio 5
public class Main {
    public static void main(String[] args) {
        int mes;
        Scanner sc= new Scanner(System.in);
        mes=sc.nextInt();
            if (mes==1) {
                System.out.println("El mes es enero y tiene 31 días.");
            } else if (mes==2) {
                System.out.println("El mes es febrero y tiene 28 días");
            }else if (mes==3){
                System.out.println("El mes es marzo y tiene 31 días.");
            }else if (mes==4){
                System.out.println("El mes es abril y tiene 30 días.");
            }else if (mes==5){
                System.out.println("El mes es mayo y tiene 31 días.");
            } else if (mes==6){
                System.out.println("El mes es junio y tiene 30 días.");
            } else if (mes==7){
                System.out.println("El mes es julio y tiene 31 días.");
            } else if (mes==8){
                System.out.println("El mes es agosto y tiene 31 días.");
            } else if (mes==9){
                System.out.println("El mes es septiembre y tiene 30 días.");
            }else if (mes==10){
                System.out.println("El mes es octubre y tiene 31 días.");
            } else if (mes==11){
                System.out.println("El mes es noviembre y tiene 30 días.");
            } else {
                System.out.println("El mes es diciembre y tiene 31 días.");
            }
    }
}
/*
 int mes;
        String[] nombreMes={"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        do{
        System.out.println("Introduzca un número de mes: ");
        mes=sc.nextInt();
        }while(mes<1 || mes>12);
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
          System.out.println("El mes "+ nombreMes[mes-1] +" tiene 31 días");
        }
        else if(mes==2){
          System.out.println("El mes "+ nombreMes[mes-1] +" tiene 28 días.");
        }
        else{
        System.out.println("El mes"+ nombreMes[mes-1] +" tiene 30 días.");
        }
 */


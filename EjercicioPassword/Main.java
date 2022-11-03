import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Password pd=new Password(30);
        pd.esFuerte();
        pd.generarPassword();

        */
        int tamaño, longitud; //Creo un número Integro y la longitud
        Scanner teclado= new Scanner(System.in); //Leo lo que introduzco por el teclado
        System.out.println("Introduzca el tamaño de la matriz"); //Pido que se introduzca por el teclado
        tamaño= teclado.nextInt(); //Igualo el tamaño al valor introducido
        System.out.println("Introduzca el tamaño de los elementos de la matriz"); //Pido que se introduzca por el teclado
        longitud= teclado.nextInt(); //Igualo la longitud al valor introducido
        Password[] misPass= new Password[tamaño]; //Creo un array de Passwords con el tamaño indicado.
        Boolean[] misBooleanos = new Boolean[tamaño];
        for (int i = 0; i < misPass.length ; i++) { //Creo un bucle que crea un objeto para cada posición del array.
            misPass[i]=new Password(longitud);//Recorro la longitud de la matriz
            misBooleanos[i]=misPass[i].esFuerte(); //Compruebo si la matriz cumple o no la condiciones para ser fuerte.
            System.out.println(misPass[i].getContraseña()+ " ¿Es fuerte?" +misBooleanos[i]);
        }
    }
}

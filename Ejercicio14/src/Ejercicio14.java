package Ejercicio14;

/* Saca 100 caracteres Unicode en una tabla que sea de 10 filas y
cada fila contenga 10 caracteres
para sacarlos de 10 en 10 se tiene que hacer con"\n"
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            System.out.print((char)i + "");
            System.out.println(i);
            if (i%10==0){
                System.out.print("\n");
            }
        }
    }
}
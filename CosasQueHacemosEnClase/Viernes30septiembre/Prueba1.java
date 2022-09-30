package Viernes30septiembre;

public class Prueba1 {
    public static void main(String[] args) {
       int num1=2;
        {
            int bloque=6;
            System.out.println(num1);
        }
        System.out.println(bloque); //Da error porque el objeto "bloque" está en otro bloque


    }
}

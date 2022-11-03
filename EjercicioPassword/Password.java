import java.util.Random;

//Ejercicio 3: https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
import java.util.Random;

public class Password {

    private int longitud=8;
    private String contraseña;

    Password(){}

    Password(int num){
        Random rnd=new Random();
        String pass="";
        for(int i=1;i<=num;i++) {
            pass=pass+(char)rnd.nextInt(48, 123);
        }
        this.contraseña=pass;

    }
    //----------------------------------------------------------------------
    public boolean esFuerte() {
        int contMayusculas=0;
        int contMinusculas=0;
        int contNumeros=0;

        for(int i=0; i<this.contraseña.length();i++) {

            if(this.contraseña.charAt(i)>=65 && this.contraseña.charAt(i)<=90)
            {
                contMayusculas++;
            }
            if(this.contraseña.charAt(i)>=97 && this.contraseña.charAt(i)<=122)
            {
                contMinusculas++;
            }
            if(this.contraseña.charAt(i)>=48 && this.contraseña.charAt(i)<=57)
            {
                contNumeros++;
            }
        }

        if(contMayusculas>=2 && contMinusculas>=1 && contNumeros>5) {
            System.out.println("La contraseña es fuerte.");
            return true;
        }else{
            System.out.println("La contraseña es débil.");
            return false;
        }
    }
    //-------------------------------------------------------------------------
    public void generarPassword(){
        Random rnd=new Random();
        String pass="";
        for(int i=1;i<=this.longitud;i++) {
            pass=pass+(char)rnd.nextInt(48, 123);
        }
        this.contraseña=pass;

    }
    //-------------------------------------------------------------------------

    public int getLongitud() {
        return this.longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    //-------------------------------------------------------------------------

}

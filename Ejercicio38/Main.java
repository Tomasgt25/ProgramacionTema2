import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Juego piedra, papel o tijera.");
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        int seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("El ordenador ya ha escogido.");

        System.out.print("Indique su selección [1=Piedra, 2=Papel, 3=Tijera]: ");
        int seleccionUsuario = teclado.nextInt();

        System.out.print("El ordenador ya ha escogido.");
        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccionUsuario )
                {
                    case 1: System.out.println("Empate"); break;
                    case 2: System.out.println("Has ganado"); break;
                    case 3: System.out.println("El ordenador gana"); break;
                }
                break;

            case 2:
                System.out.println("Papel");
                switch ( seleccionUsuario )
                {
                    case 1: System.out.println("El ordenador"); break;
                    case 2: System.out.println("Empate"); break;
                    case 3: System.out.println("Has ganado"); break;
                }
                break;

            case 3:
                System.out.println("Tijera");
                switch ( seleccionUsuario )
                {
                    case 1: System.out.println("Has ganado"); break;
                    case 2: System.out.println("El ordenador ha ganado"); break;
                    case 3: System.out.println("Empate"); break;
                }
                break;




        }

    }
    }


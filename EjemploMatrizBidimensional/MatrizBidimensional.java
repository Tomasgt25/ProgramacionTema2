import java.util.Random;

public class MatrizBidimensional {
    public static void main(String[] args) {
     /*   int[][] bidimensional = {{1,3,5,6,7,9},{5,6,6,6,6,6},{1,2,4,4,4,4}};



        for (int i = 0; i < 3; i++) { //Aquí hago un bucle que recorra el número de matrices
            for (int j = 0; j < 6; j++) { //Aquí hago otro bucle para el número de elementos de cada matriz
                System.out.print(bidimensional[i][j]);
            }
            System.out.print("\n");
        }

      */
        Random rnd=new Random();
        int[][] bidimensional = new int[10][10];
        for (int i = 0; i <=9 ; i++) {
            for (int j = 0; j <=9 ; j++) {
                bidimensional[i][j]= rnd.nextInt(10);
                System.out.print(bidimensional[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}


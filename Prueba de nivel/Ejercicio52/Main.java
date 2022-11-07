// Guardar en un array los 20 primeros números

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pares =new int[21];
        pares[0]=0;
        pares[1]=2;
        pares[2]=4;
        pares[3]=6;
        pares[4]=8;
        pares[5]=10;
        pares[6]=12;
        pares[7]=14;
        pares[8]=16;
        pares[9]=18;
        pares[10]=20;
        pares[11]=22;
        pares[12]=24;
        pares[13]=26;
        pares[14]=28;
        pares[15]=30;
        pares[16]=32;
        pares[17]=34;
        pares[18]=36;
        pares[19]=38;
        pares[20]=40;
        System.out.println(Arrays.toString(pares));
    }
}
/*
    int[] miMatrizPares=new int[20];
        for(int i=0;i<20;i++){
          miMatrizPares[i]=i*2;
          System.out.println(miMatrizPares[i]);
        }
 */
public class Main {
    public static void main(String[] args) {
        int num=0;

      /*  while (num<100){
            num++;
            System.out.println("num");
        }

       */
        //-------------------------------------
        /* do while se utiliza cuando quiero correr algo una vez
        y después condicionarlo. while se utiliza para condicionar algo desde el principio
         */
        do {
            num++;
            System.out.println(num);
        } while (num<123 && num!=0);
    }
}
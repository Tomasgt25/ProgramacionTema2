package serie;

public class Main {
    public static void main(String[] args) {
        Serie[] misSeries=new Serie[5];
        Videojuego[] misVideojuegos=new Videojuego[5];

        for (int i = 0; i < 5; i++) {
            misSeries[i]=new Serie();
            misVideojuegos[i]=new Videojuego();
        }
        misSeries[3].entregar();
        misSeries[4].entregar();
        misVideojuegos[3].entregar();
        misVideojuegos[1].entregar();
        misVideojuegos[2].entregar();

        int contSeriesEntregadas=0,contVideojuegosEntregados=0;
        for (int i = 0; i < 5; i++) {
            if (misSeries[i].isEntregado()==true){
                contSeriesEntregadas++;
                misSeries[i].devolver();
            }
                if (misVideojuegos[i].isEntregado()==true){
                    contVideojuegosEntregados++;
                    misVideojuegos[i].devolver();
                }
        }
        System.out.println(misSeries[4].toString());
    }
}


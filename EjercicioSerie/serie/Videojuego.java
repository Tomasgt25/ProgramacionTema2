package serie;

public class Videojuego implements Entregable {

    private String titulo;
    private int horasEstimadas=10;
    private String genero;
    private String compañía;
    private final boolean entregado=false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañía() {
        return compañía;
    }

    public void setCompañía(String compañía) {
        this.compañía = compañía;
    }


   public Videojuego() {

    }
    public Videojuego(String titulo, int horasEstimadas){
        super();
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
    }
    public Videojuego(String titulo, String genero, String compañía, int horasEstimadas){
        super();
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.compañía=compañía;
        this.genero=genero;
    }
    @Override

    public String toString(){
    return "Compañía = " + compañía;
    }
}

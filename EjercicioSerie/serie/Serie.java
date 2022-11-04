package serie;

public class Serie implements Entregable {
    private String titulo;
    private int numeroDeTemporadas=3;
    private final boolean entregado=false;
    private String genero;
    private String creador;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

        public Serie(){

        }
        public Serie(String titulo, String creador){
            super();
            this.titulo=titulo;
            this.creador=creador;

        }
        public Serie(String titulo, String creador, String genero, int numeroDeTemporadas){
            super();
            this.titulo=titulo;
            this.creador=creador;
            this.genero=genero;
            this.numeroDeTemporadas=numeroDeTemporadas;

        }

        @Override

       public String toString(){

        return "título = " + this.titulo + "nº de temporadas = " + this.numeroDeTemporadas;
       }
}

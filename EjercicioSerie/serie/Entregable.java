package serie;

public interface Entregable {
    default void entregar() {
        this.entregado=false;
    }

    default void devolver() {
        
    }

    default boolean isEntregado() {
        return true;
        }

    default int compareTo(Object a){
        Serie b = (Serie) a;
        if (this.numeroDeTemporadas > b.getNumeroDeTemporadas()){
            return 1;
        } else if (this.numeroDeTemporadas<b.getNumeroDeTemporadas()) {
            return  0;
        } else {
            return -1;
        }
    }
}
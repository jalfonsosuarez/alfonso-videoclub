/* CURSO JAVA */



package videoclubalfonso;

/**
 *
     * 08-abr-2011 11:48:04
     * @author JOSE ALFONSO SUAREZ MORENO
     * GRUPO: 
 */
public class VideoJuego extends Articulo{

    /*
     * Tengo que decidir si plataforma lo hago con una lista enumerada o
     * con otra clase. Todos los días salen plataformas nuevas de videojuegos.
     */
    private String pataforma;

    public String getPataforma() {
        return pataforma;
    }

    public void setPataforma(String pataforma) {
        this.pataforma = pataforma;
    }

    /**
     * Guarda los datos de la película.
     * @param nuevo     -> true si es un nuevo artículo.
     */
    @Override
    public void guardar( boolean nuevo ){
        // Llama al método correspondiente de la base de datos.
        if( nuevo ){
            // Persistencia.InsertaVideoJuego( this );
        }else{
            // Persistencia.ActualizaVideoJuego( this );
        }
    }

}

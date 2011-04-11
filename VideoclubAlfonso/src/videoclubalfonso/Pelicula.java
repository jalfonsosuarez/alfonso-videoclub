/* CURSO JAVA */



package videoclubalfonso;

/**
 *
     * 08-abr-2011 11:42:57
     * @author JOSE ALFONSO SUAREZ MORENO
     * GRUPO: 
 */

import java.util.*;

public class Pelicula extends Articulo{

    private Date fechaEstreno;
    private String director;
    private String actorPrincipal;
    private String actorSecundario;
    private String formato;
    /*
     * Tengo que pensar si formato me conviene meterlo en una lista enumerada
     * o en otra clase que contemple todos los formatos.
     */

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActorSecundario() {
        return actorSecundario;
    }

    public void setActorSecundario(String actorSecundario) {
        this.actorSecundario = actorSecundario;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * Guarda los datos de la película.
     * @param nuevo     -> true si es un nuevo artículo.
     */
    @Override
    public void guardar( boolean nuevo ){
        // Llama al método correspondiente de la base de datos.
        if( nuevo ){
            // Persistencia.InsertaPelicula( this );
        }else{
            // Persistencia.ActualizaPelicula( this );
        }

    }

}

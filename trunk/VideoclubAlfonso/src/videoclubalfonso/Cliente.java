/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja los datos de un cliente.
 * 07-abr-2011 8:31:16
 * @author JOSE ALFONSO SUAREZ MORENO
 * GRUPO:
 */

import java.util.*;

public class Cliente extends Sujeto{

    private Date fechaAlta;

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    /**
     * Guarda los datos del cliente.
     * @param nuevo     -> true si es un nuevo cliente.
     */
    @Override   
    public void grabar( boolean nuevo ){
        // Llamará al método correspondiente de la base de datos.
        if( nuevo ){
            // Persistencia.InsertaCliente( this );
        }else{
            // Persostencia.ActualizaCliente( this );
        }
    }
}

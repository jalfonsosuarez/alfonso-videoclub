/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja los movimientos de la tarjeta de cliente.
 * 07-abr-2011 8:31:16
 * @author JOSE ALFONSO SUAREZ MORENO
 * GRUPO:
 */

import java.util.*;

public class MovimientoTarjeta {

    private Date fecha;
    private String concepto;
    private double importe;

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * Guarda el movimiento de tarjeta de cliente.
     * @param nuevo     -> true si es nuevo movimiento.
     */
    public final void guardaMovimiento( boolean nuevo ){
        // Llama al método correspondiente de la base de datos.
        if (nuevo){
            // Persistencia.InsertaMovimientoTarjeta( this );
        }else{
            // Persistancia.ActualizaMovimientoCaja( this );
        }
    }

}

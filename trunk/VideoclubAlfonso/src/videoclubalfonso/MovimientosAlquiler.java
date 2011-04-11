/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja los datos del alquiler de una película.
 * @author jasm
 */

import java.util.*;

public class MovimientosAlquiler {

    private int idMovimientoAlquiler;       // Identificador del movimiento de alquiler.
    private Articulo articulo;              // Objeto artículo.
    private double precio;                  // Precio del aquiler.
    private Date fechaDevolucion;           // Fecha prvista de devolución.
    private double penalizacionRetraso;     // Valor de la penalización por retraso.
    private double penalizacionDeterioro;   // Valor de la penalización por deterioro.
    private double penalizacionExtravio;    // Valor de la penalización por extravío.
    private double penalizacionOtra;        // Valor de la penalización por otros conceptos.
    private double descuentoPorcentaje;     // Porcentaje de descuento aplicado sobre el alquiler.
    private double descuentoNeto;           // Descuento neto (en importe).

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double getDescuentoNeto() {
        return descuentoNeto;
    }

    public void setDescuentoNeto(double descuentoNeto) {
        this.descuentoNeto = descuentoNeto;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getIdMovimientoAlquiler() {
        return idMovimientoAlquiler;
    }

    public void setIdMovimientoAlquiler(int idMovimientoAlquiler) {
        this.idMovimientoAlquiler = idMovimientoAlquiler;
    }

    public double getPenalizacionDeterioro() {
        return penalizacionDeterioro;
    }

    public void setPenalizacionDeterioro(double penalizacionDeterioro) {
        this.penalizacionDeterioro = penalizacionDeterioro;
    }

    public double getPenalizacionExtravio() {
        return penalizacionExtravio;
    }

    public void setPenalizacionExtravio(double penalizacionExtravio) {
        this.penalizacionExtravio = penalizacionExtravio;
    }

    public double getPenalizacionOtra() {
        return penalizacionOtra;
    }

    public void setPenalizacionOtra(double penalizacionOtra) {
        this.penalizacionOtra = penalizacionOtra;
    }

    public double getPenalizacionRetraso() {
        return penalizacionRetraso;
    }

    public void setPenalizacionRetraso(double penalizacionRetraso) {
        this.penalizacionRetraso = penalizacionRetraso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Guarda los datos de este movimiento de alquiler.
     * @param nuevo     -> true si es un nuevo movimiento.
     */
    public final void guardaMovimiento( boolean nuevo ){
        // Llamará al método correspondiente de la base de datos.
        if(nuevo){
            // Persistencia.InsertaMovimientoAlquiler( this );
        }else{
            // Persistencia.ActualizaMovimientoAlquier( this );
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja los datos de una tarjeta de cliente.
 * 07-abr-2011 8:31:16
 * @author JOSE ALFONSO SUAREZ MORENO
 * GRUPO:
 */

import java.util.*;

public class TarjetaCliente {

    private int idTarjeta;
    private Cliente cliente;
    private List<MovimientoTarjeta> movimientosTarjeta = new ArrayList();
    private boolean bloqueada;      // Trajeta bloqueada por algún motivo.
    private boolean baja;           // Tarjeta dada de baja.

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public List<MovimientoTarjeta> getMovimientosTarjeta() {
        return movimientosTarjeta;
    }

    public void setMovimientosTarjeta(List<MovimientoTarjeta> movimientosTarjeta) {
        this.movimientosTarjeta = movimientosTarjeta;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    /**
     * Guarda los datos de la tarjeta.
     * @param nuevo     -> true si es una tarjeta nueva.
     */
    public final void guardaTarjeta( boolean nuevo ){
        // Llamará al método correspondiente de la base de datos.
        if (nuevo){
            // Persistencia.InsertaTarjeta( this );
        }else{
            // Persistencia.ActualizaTarjeta( this );
        }
    }

    public final double saldoTarjeta(){
        double saldo = 0d;
        // Llamará al método correspondiente de la base de datos.
        // Saldo = Persistencia.SaldoTarjeta( this );
        return saldo;
    }
}

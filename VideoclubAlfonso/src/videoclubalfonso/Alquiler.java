/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja losm datos de un alquiler.
 * 07-abr-2011 8:31:16
 * @author JOSE ALFONSO SUAREZ MORENO
 * GRUPO:
 */

import java.util.*;

public class Alquiler {

    private int idAlquiler;             // Identificador de este alquiler.
    private Date fecha;                 // Fecha del alquiler.
    private Cliente cliente;            // Objeto cliente.
    /* ¿Dejo aqui el cliente o lo quito? Ya está en la tarjeta.
     * Depende si es obligatorio el uso de tarjetas para efectuar alquileres.
     */
    private TarjetaCliente tarjeta;     // Objeto tarjeta.
    // Lista del alquileres.
    private List<MovimientosAlquiler> movimientosAlquier = new ArrayList();
    private double totalImporteAlquiler;        // Total suma precios alquiler.
    private double totalPenalizacionRetraso;    // Total suma penalizaciones por retraso.
    private double totalPenalizacionDeterioro;  // Total suma penalizaciones por deterioro.
    private double totalPenalizacionExtravio;   // Total suma penalizaciones por extravío.
    private double totalPenalizacionOtra;       // Total suma penalizaciones otro tipo.
    private double totalDescuentos;             // Total suma descuentos.

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TarjetaCliente getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCliente tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public List<MovimientosAlquiler> getMovimientosAlquier() {
        return movimientosAlquier;
    }

    public void setMovimientosAlquier(List<MovimientosAlquiler> movimientosAlquier) {
        this.movimientosAlquier = movimientosAlquier;
    }

    public double getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(double totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public double getTotalPenalizacionDeterioro() {
        return totalPenalizacionDeterioro;
    }

    public void setTotalPenalizacionDeterioro(double totalPenalizacionDeterioro) {
        this.totalPenalizacionDeterioro = totalPenalizacionDeterioro;
    }

    public double getTotalPenalizacionExtravio() {
        return totalPenalizacionExtravio;
    }

    public void setTotalPenalizacionExtravio(double totalPenalizacionExtravio) {
        this.totalPenalizacionExtravio = totalPenalizacionExtravio;
    }

    public double getTotalPenalizacionOtra() {
        return totalPenalizacionOtra;
    }

    public void setTotalPenalizacionOtra(double totalPenalizacionOtra) {
        this.totalPenalizacionOtra = totalPenalizacionOtra;
    }

    public double getTotalPenalizacionRetraso() {
        return totalPenalizacionRetraso;
    }

    public void setTotalPenalizacionRetraso(double totalPenalizacionRetraso) {
        this.totalPenalizacionRetraso = totalPenalizacionRetraso;
    }

    public double getTotalImporteAlquiler() {
        return totalImporteAlquiler;
    }

    public void setTotalImporteAlquiler(double totalImporteAlquiler) {
        this.totalImporteAlquiler = totalImporteAlquiler;
    }

    /**
     * Recorre la lista de alquileres y calcula los importes correspondietes.
     */
    public void calculaImportes(){
        ListIterator i = this.movimientosAlquier.listIterator();
        while ( i.hasNext() ){
            MovimientosAlquiler m = (MovimientosAlquiler) i.next();
            this.setTotalImporteAlquiler(this.getTotalImporteAlquiler()+m.getPrecio());
            this.setTotalPenalizacionRetraso(this.getTotalPenalizacionRetraso()+m.getPenalizacionRetraso());
            this.setTotalPenalizacionDeterioro(this.getTotalPenalizacionDeterioro()+m.getPenalizacionDeterioro());
            this.setTotalPenalizacionExtravio(this.getTotalPenalizacionExtravio()+m.getPenalizacionExtravio());
            this.setTotalPenalizacionOtra(this.getTotalPenalizacionOtra()+m.getPenalizacionOtra());
            this.setTotalDescuentos(this.getTotalDescuentos()+
                                    ((m.getPrecio()*m.getDescuentoPorcentaje()/100) + m.getDescuentoNeto()));
        }
    }

    /**
     * Guarda los datos del alquiler.
     * @param nuevo     -> true si un nuevo alquiler.
     */
    public final void guardaAlquiler( boolean nuevo ) {
        // Llamará al método correspondiente de la base de datos.
        if( nuevo ){
            // Persistencia.InsertaAlquiler( this );
        }else{
            // Persistencia.ActualizaAlquiler( this );
        }
    }

}

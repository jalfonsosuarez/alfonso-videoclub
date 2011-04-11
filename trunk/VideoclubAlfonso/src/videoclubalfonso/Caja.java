/* CURSO JAVA */



package videoclubalfonso;

/**
 * Caja.
     * 07-abr-2011 8:33:52
     * @author JOSE ALFONSO SUAREZ MORENO
     * GRUPO: 
 */

import java.util.*;

public class Caja {

    // Controloar si la caja está cerrada.
    private boolean cajaCerrada = false;
    // Lista de Movimientos de caja.
    private List<MovimientosCaja> movimientosCaja = new ArrayList();

    public boolean isCajaCerrada() {
        return cajaCerrada;
    }

    public void setCajaCerrada(boolean cajaCerrada) {
        this.cajaCerrada = cajaCerrada;
    }

    public List<MovimientosCaja> getMovimientosCaja() {
        return movimientosCaja;
    }

    public void setMovimientosCaja(List<MovimientosCaja> movimientosCaja) {
        this.movimientosCaja = movimientosCaja;
    }

    /**
     * Abre la caja.
     * Registra un movimiento en la lista de movimientos de caja.
     * 
     * @param fecha         -> Fecha de apertura de caja.
     * @param importe       -> Importe de apertura.
     */
    public void abrirCaja( Date fecha, double importe ){
        this.setCajaCerrada(false);
        this.sumarFondo(fecha, "Apertura de caja", importe);
    }

    /**
     * Cierra la caja.
     * Registra un movimiento en la lista de movimientos de caja.
     *
     * @param fecha         -> Fecha del cierre de caja.
     * @param importe       -> Importe a retirar en el cierre. Si es cero
     *                         tomará el saldo actual de efectivo.
     */
    public void cerrarCaja( Date fecha, double importe ){
        double impCierre;

        if( importe == 0d ){
            impCierre = this.saldoActual();
        }else{
            impCierre = importe;
        }
        this.setCajaCerrada(true);
        this.retirarFondo(fecha, "Cierre de caja", impCierre);
    }

    /**
     * Añade un movimiento de salida de efectivo a la lista de caja.
     *
     * @param fecha         -> Fecha del movimiento.
     * @param concepto      -> Concepto del movimiento.
     * @param importe       -> Importe del movimiento (salida de caja).
     */
    public void retirarFondo( Date fecha, String concepto, double importe ){
        this.movimientosCaja.add(new MovimientosCaja( fecha, concepto, 0d, importe));

    }

    /**
     * Añade un movimiento de entrada de efectivo a la lista de caja.
     *
     * @param fecha         -> Fecha del movimiento.
     * @param concepto      -> Concepto del movimiento.
     * @param importe       -> Importe del movimiento (entrada en caja).
     */
    public void sumarFondo( Date fecha, String concepto, double importe ){
        this.movimientosCaja.add(new MovimientosCaja( fecha, concepto, importe, 0d ));
    }

    /**
     * Devuelve el saldo acumulado de caja al ultimo movimiento
     * de la fecha especificada.
     * LLama a la capa de persistencia.
     *
     * @param fecha         -> Fecha de de la que se desea el saldo.
     * @return              -> Saldo.
     */
    public double saldoAFecha( Date fecha ){
        int saldo = 0;
        // saldo = Persistencia.SaldoCajaAFecha( fecha );
        return saldo;
    }

    /**
     * Devuelve saldo actual de caja (al ultimo movimiento).
     * Llama a la capa de persistencia.
     *
     * @return              -> Saldo.
     */
    public double saldoActual(){
        int saldo = 0;
        // saldo = Persistencia.SaldoCajaActual();
        return saldo;
    }

}

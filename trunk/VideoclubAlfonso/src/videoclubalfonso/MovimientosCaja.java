/* CURSO JAVA */



package videoclubalfonso;

/**
 *  Movimientos de Caja.
     * 07-abr-2011 8:36:52
     * @author JOSE ALFONSO SUAREZ MORENO
     * GRUPO: 
 */

import java.util.*;

public class MovimientosCaja {

    private int idMovimiento;   // Este dato se obtendrá desde la capa de
                                // persistencia y sirve para identificar de
                                // forma única el movimiento. Importante
                                // cuando haya que guardar una modificación.
    private Date fecha;
    private String concepto;
    private double entrada;
    private double salida;
    private double saldo;

    public MovimientosCaja( Date fecha, String concepto, double entrada, double salida ){
        this.fecha = fecha;
        this.concepto = concepto;
        this.entrada = entrada;
        this.salida = salida;
        /* 07.04.2011
         * Pregutar a Jose si esto es conveniente ponerlo aquí.
         * Me asalta la duda de si en un futuro se heredase de esta clase
         * y se redefiniese este metodo ¿qué pasaría?.
         * He declarado el método guardaMovimiento() como final, así evito que
         * se pueda heredar.
         */
        this.guardaMovimiento( true );
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSalida() {
        return salida;
    }

    public void setSalida(double salida) {
        this.salida = salida;
    }

    /**
     * Guarda el movimiento de caja.
     * Llama a la capa de persistencia.
     * 
     * @param Nuevo             -> true si es nuevo movimiento.
     */
    public final void guardaMovimiento( boolean nuevo ){

        // Llamará al método correspondiente de la base de datos.
        if( nuevo ){
            // Persistencia.insertaMovimietoCaja( this );
        } else {
            // Persistencia.ActualizaMovimietoCaja( this );
        }
    }

}

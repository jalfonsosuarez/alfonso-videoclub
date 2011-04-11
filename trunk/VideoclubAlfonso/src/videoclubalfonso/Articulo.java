/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja los datos de un artículo.
 * 07-abr-2011 8:31:16
 * @author JOSE ALFONSO SUAREZ MORENO
 * GRUPO:
 */
public abstract class Articulo {

    private int idArticulo;
    private String descripcion;
    private double precioAlquiler;
    private int diasDevolucion;
    private double penalizacionRetraso;
    private double penalizacionExtravío;
    private double penalizacionDeterioro;
    private double penalizacionOtra;
    private boolean baja;
    private double precioCompra;
    private Categoria categoria;

    /* IMPORTANTE:
     * Los datos de la categoría se propagarán a los correspondientes al artículo,
     * con la particularidad de que un artículo que pertenezca a la misma categoría
     * que otros puede contemplar otros valores.
     */

    public int getDiasDevolucion() {
        return diasDevolucion;
    }

    public void setDiasDevolucion(int diasDevolucion) {
        this.diasDevolucion = diasDevolucion;
    }

    public double getPenalizacionDeterioro() {
        return penalizacionDeterioro;
    }

    public void setPenalizacionDeterioro(double penalizacionDeterioro) {
        this.penalizacionDeterioro = penalizacionDeterioro;
    }

    public double getPenalizacionExtravío() {
        return penalizacionExtravío;
    }

    public void setPenalizacionExtravío(double penalizacionExtravío) {
        this.penalizacionExtravío = penalizacionExtravío;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Guarda los datos del artículo.
     * @param nuevo     -> true si es un nuevo artículo.
     */
    public abstract void guardar( boolean nuevo );

}

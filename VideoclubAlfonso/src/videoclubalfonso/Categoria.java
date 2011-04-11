/* CURSO JAVA */



package videoclubalfonso;

/**
 *
     * 08-abr-2011 11:36:43
     * @author JOSE ALFONSO SUAREZ MORENO
     * GRUPO: 
 */
public class Categoria {

    private int idCateroria;
    private String descripcion;
    private double precioAlquiler;
    private int diasDevolucion;
    private double penalizacionRetraso;
    private double penalizacionExtravío;
    private double penalizacionDeterioro;
    private double penalizacionOtra;
    private boolean baja;

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDiasDevolucion() {
        return diasDevolucion;
    }

    public void setDiasDevolucion(int diasDevolucion) {
        this.diasDevolucion = diasDevolucion;
    }

    public int getIdCateroria() {
        return idCateroria;
    }

    public void setIdCateroria(int idCateroria) {
        this.idCateroria = idCateroria;
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

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    /**
     * Guarda los datos de la categoria.
     * @param nuevo     -> true si es una nueva categoría.
     */
    public final void guardaCategoria( boolean nuevo ){
        // Llama al método correspondiente de la base de datos.
        if( nuevo ){
            // Persistencia.InsertaCategoria( this );
        }else{
            // Persistencia.ActualizaCategoria( this );
        }
    }


}

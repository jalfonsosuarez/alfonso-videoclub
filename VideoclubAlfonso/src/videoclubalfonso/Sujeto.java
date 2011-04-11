/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclubalfonso;

/**
 * Maneja los datos comunes de sujetos.
 * 07-abr-2011 8:31:16
 * @author JOSE ALFONSO SUAREZ MORENO
 * GRUPO:
 */
public abstract class Sujeto {

    private int idSujeto;
    private String nombre;
    private String domicilio;
    private String localidad;
    private String provincia;
    private String telefono;
    private String email;
    private String cif;
    private boolean baja;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdSujeto() {
        return idSujeto;
    }

    public void setIdSujeto(int idSujeto) {
        this.idSujeto = idSujeto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    /**
     * Guarda los datos del sujeto.
     * Debe implementarse en la clase hija.
     *
     * @param nuevo     -> true si es un nuevo cliente.
     */
    public abstract void grabar( boolean nuevo );
}

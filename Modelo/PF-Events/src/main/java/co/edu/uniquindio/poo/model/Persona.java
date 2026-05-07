package co.edu.uniquindio.poo.model;
public abstract class Persona {
    private String idUsuario;
    private String nombre;
    private String telefono;
    private String correo;
    private GestorEvento ownedByGestorEvento;

    /***
     * Constructor de la clase Persona
     * @param correo de la persona
     * @param idUsuario de la persona
     * @param nombre de la persona
     * @param ownedByGestorEvento
     * @param telefono de la persona
     */

    public Persona(String correo, String idUsuario, String nombre, GestorEvento ownedByGestorEvento,
                   String telefono) {
        this.correo = correo;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.ownedByGestorEvento = ownedByGestorEvento;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GestorEvento getOwnedByPrincipal() {
        return ownedByGestorEvento;
    }

    public void setOwnedByPrincipal(GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento = ownedByGestorEvento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
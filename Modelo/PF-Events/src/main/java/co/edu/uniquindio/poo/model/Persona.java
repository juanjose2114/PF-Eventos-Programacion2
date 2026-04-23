public abstract class Persona {
    private String idUsuario;
    private String nombre;
    private String telefono;
    private String correo;
    private Principal ownedByPrincipal;

    /***
     * Constructor de la clase Persona
     * @param correo de la persona
     * @param idUsuario de la persona
     * @param nombre de la persona
     * @param ownedByPrincipal
     * @param telefono de la persona
     */

    public Persona(String correo, String idUsuario, String nombre, Principal ownedByPrincipal,
                   String telefono) {
        this.correo = correo;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.ownedByPrincipal = ownedByPrincipal;
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

    public Principal getOwnedByPrincipal() {
        return ownedByPrincipal;
    }

    public void setOwnedByPrincipal(Principal ownedByPrincipal) {
        this.ownedByPrincipal = ownedByPrincipal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
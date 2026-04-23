public class Usuario extends Persona {
    private List<Compra> listaCompras;
    private List<Incidencia> listaIncidencias;

    /**
     * constructor del usuario
     * @param listaCompras del usuario
     * @param listaIncidencias del usuario
     */
    public Usuario(List<Compra> listaCompras, List<Incidencia> listaIncidencias) {
        super(correo,idUsuario,nombre,ownedByPrincipal, telefono);
        this.listaCompras = listaCompras;
        this.listaIncidencias = listaIncidencias;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Incidencia> getListaIncidencias() {
        return listaIncidencias;
    }

    public void setListaIncidencias(List<Incidencia> listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }
}
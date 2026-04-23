public final class Principal {
    private static Principal instancia;
    private String nombre;
    private String direccion;
    private Strinng nit;
    private List<Evento> listaEventos;
    private List<Filtro> listaFiltros;
    private List<Recintos> listaRecintos;
    private List<ReportePago> listaReportePagos;
    private List<Notificacion> listaNotificaciones;
    private List<Compra> listaCompras;
    private List<Persona> listaPersonas;

    private Principal(String direccion, List<Compra> listaCompras, List<Evento> listaEventos, List<Filtro> listaFiltros,
                     List<Notificacion> listaNotificaciones, List<Persona> listaPersonas, List<Recintos> listaRecintos, List<ReportePago> listaReportePagos, Strinng nit, String nombre) {
        this.direccion = direccion;
        this.listaCompras = listaCompras;
        this.listaEventos = listaEventos;
        this.listaFiltros = listaFiltros;
        this.listaNotificaciones = listaNotificaciones;
        this.listaPersonas = listaPersonas;
        this.listaRecintos = listaRecintos;
        this.listaReportePagos = listaReportePagos;
        this.nit = nit;
        this.nombre = nombre;
    }

    public static Principal getInstance(){
        if(instancia==null){
            instancia=new Principal();
        }
        return instancia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Strinng getNit() {
        return nit;
    }

    public void setNit(Strinng nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Principal getInstancia() {
        return instancia;
    }

    public static void setInstancia(Principal instancia) {
        Principal.instancia = instancia;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public List<Filtro> getListaFiltros() {
        return listaFiltros;
    }

    public void setListaFiltros(List<Filtro> listaFiltros) {
        this.listaFiltros = listaFiltros;
    }

    public List<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(List<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Recintos> getListaRecintos() {
        return listaRecintos;
    }

    public void setListaRecintos(List<Recintos> listaRecintos) {
        this.listaRecintos = listaRecintos;
    }

    public List<ReportePago> getListaReportePagos() {
        return listaReportePagos;
    }

    public void setListaReportePagos(List<ReportePago> listaReportePagos) {
        this.listaReportePagos = listaReportePagos;
    }
}
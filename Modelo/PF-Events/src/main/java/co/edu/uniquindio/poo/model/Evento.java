public class Evento{
    private List<Politica> listaPoliticas;
    private List<DetalleEvento> listaDetalleEvento;
    private Filtro ownedByFiltro;
    private Recinto recinto;
    private EstadoEvento estadoEvento;
    private CategoriaEvento cagoriaEvento;
    private Metrica metrica;
    private List<ReportePago> listaReportePago;
    private Principal ownedByPrincipal;
    private Compra ownedByCompra;


    /***
     * constructor del evento
     * @param cagoriaEvento
     * @param estadoEvento
     * @param listaDetalleEvento
     * @param listaPoliticas
     * @param listaReportePago
     * @param metrica
     * @param ownedByCompra
     * @param ownedByFiltro
     * @param ownedByPrincipal
     * @param recinto
     */
    public Evento(CategoriaEvento cagoriaEvento, EstadoEvento estadoEvento, List<DetalleEvento> listaDetalleEvento, List<Politica> listaPoliticas, List<ReportePago> listaReportePago, Metrica metrica, Compra ownedByCompra, Filtro ownedByFiltro,
                  Principal ownedByPrincipal, Recinto recinto) {
        super()
        this.cagoriaEvento = cagoriaEvento;
        this.estadoEvento = estadoEvento;
        this.listaDetalleEvento = listaDetalleEvento;
        this.listaPoliticas = listaPoliticas;
        this.listaReportePago = listaReportePago;
        this.metrica = metrica;
        this.ownedByCompra = ownedByCompra;
        this.ownedByFiltro = ownedByFiltro;
        this.ownedByPrincipal = ownedByPrincipal;
        this.recinto = recinto;
    }

    public CategoriaEvento getCagoriaEvento() {
        return cagoriaEvento;
    }

    public void setCagoriaEvento(CategoriaEvento cagoriaEvento) {
        this.cagoriaEvento = cagoriaEvento;
    }

    public EstadoEvento getEstadoEvento() {
        return estadoEvento;
    }

    public void setEstadoEvento(EstadoEvento estadoEvento) {
        this.estadoEvento = estadoEvento;
    }

    public List<DetalleEvento> getListaDetalleEvento() {
        return listaDetalleEvento;
    }

    public void setListaDetalleEvento(List<DetalleEvento> listaDetalleEvento) {
        this.listaDetalleEvento = listaDetalleEvento;
    }

    public List<Politica> getListaPoliticas() {
        return listaPoliticas;
    }

    public void setListaPoliticas(List<Politica> listaPoliticas) {
        this.listaPoliticas = listaPoliticas;
    }

    public List<ReportePago> getListaReportePago() {
        return listaReportePago;
    }

    public void setListaReportePago(List<ReportePago> listaReportePago) {
        this.listaReportePago = listaReportePago;
    }

    public Metrica getMetrica() {
        return metrica;
    }

    public void setMetrica(Metrica metrica) {
        this.metrica = metrica;
    }

    public Compra getOwnedByCompra() {
        return ownedByCompra;
    }

    public void setOwnedByCompra(Compra ownedByCompra) {
        this.ownedByCompra = ownedByCompra;
    }

    public Filtro getOwnedByFiltro() {
        return ownedByFiltro;
    }

    public void setOwnedByFiltro(Filtro ownedByFiltro) {
        this.ownedByFiltro = ownedByFiltro;
    }

    public Principal getOwnedByPrincipal() {
        return ownedByPrincipal;
    }

    public void setOwnedByPrincipal(Principal ownedByPrincipal) {
        this.ownedByPrincipal = ownedByPrincipal;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }
}


import java.time.LocalDate;
import java.util.List;

public class Evento{
    private String nombre;
    private String id;
    private String descripcion;
    private String ciudad;
    private int hora;
    private LocalDate fecha;
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

    /**
     * constructor de evento
     * @param cagoriaEvento
     * @param ciudad
     * @param descripcion
     * @param estadoEvento
     * @param fecha
     * @param hora
     * @param id
     * @param listaDetalleEvento
     * @param listaPoliticas
     * @param listaReportePago
     * @param metrica
     * @param nombre
     * @param ownedByCompra
     * @param ownedByFiltro
     * @param ownedByPrincipal
     * @param recinto
     */

    public Evento(CategoriaEvento cagoriaEvento, String ciudad, String descripcion,
                  EstadoEvento estadoEvento, LocalDate fecha, int hora, String id, List<DetalleEvento> listaDetalleEvento, List<Politica> listaPoliticas, List<ReportePago> listaReportePago, Metrica metrica, String nombre, Compra ownedByCompra, Filtro ownedByFiltro, Principal ownedByPrincipal, Recinto recinto) {
        this.cagoriaEvento = cagoriaEvento;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.estadoEvento = estadoEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.listaDetalleEvento = listaDetalleEvento;
        this.listaPoliticas = listaPoliticas;
        this.listaReportePago = listaReportePago;
        this.metrica = metrica;
        this.nombre = nombre;
        this.ownedByCompra = ownedByCompra;
        this.ownedByFiltro = ownedByFiltro;
        this.ownedByPrincipal = ownedByPrincipal;
        this.recinto = recinto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


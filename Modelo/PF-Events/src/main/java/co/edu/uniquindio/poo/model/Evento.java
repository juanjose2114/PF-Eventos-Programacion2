package co.edu.uniquindio.poo.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento{

    private String nombre;
    private String id;
    private String descripcion;
    private String ciudad;
    private int hora;
    private LocalDate fecha;
    private List<Politica> listaPoliticas;
    private List<Persona> listaPersonas;
    private Recinto recinto;
    private EstadoEvento estadoEvento;
    private CategoriaEvento cagoriaEvento;
    private List<Incidencia> listaIncidencias;
    private GestorEvento ownedByGestorEvento;
    private Compra compra;

    /**
     * constructor de la clase evento
     * @param ciudad
     * @param descripcion
     * @param fecha
     * @param hora
     * @param id
     * @param nombre
     * @param ownedByGestorEvento
     */
    public Evento( String ciudad,  String descripcion,LocalDate fecha,int hora, String id,
                   String nombre, GestorEvento ownedByGestorEvento) {
        this.cagoriaEvento = cagoriaEvento;
        this.ciudad = ciudad;
        this.compra = compra;
        this.descripcion = descripcion;
        this.estadoEvento = estadoEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.listaIncidencias = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaPoliticas = new ArrayList<>();
        this.nombre = nombre;
        this.ownedByGestorEvento = ownedByGestorEvento;
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

    public List<Politica> getListaPoliticas() {
        return listaPoliticas;
    }

    public void setListaPoliticas(List<Politica> listaPoliticas) {
        this.listaPoliticas = listaPoliticas;
    }

    public GestorEvento getOwnedByPrincipal() {
        return ownedByGestorEvento;
    }

    public void setOwnedByPrincipal(GestorEvento ownedByPrincipal) {
        this.ownedByGestorEvento = ownedByPrincipal;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public Compra getCompra() {
        return this.compra;
    }

    public void setCompra(final Compra compra) {
        this.compra = compra;
    }

    public List<Incidencia> getListaIncidencias() {
        return this.listaIncidencias;
    }

    public void setListaIncidencias(final List<Incidencia> listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }

    public List<Persona> getListaPersonas() {
        return this.listaPersonas;
    }

    public void setListaPersonas(final List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public GestorEvento getOwnedByGestorEvento() {
        return this.ownedByGestorEvento;
    }

    public void setOwnedByGestorEvento(final GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento = ownedByGestorEvento;
    }
}


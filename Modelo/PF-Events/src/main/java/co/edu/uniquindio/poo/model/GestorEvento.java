package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;


public final class GestorEvento {
    private static GestorEvento instancia;
    private String nombre;
    private String direccion;
    private String nit;
    private List<Evento> listaEventos;
    private List<Recinto> listaRecintos;
    private List<Compra> listaCompras;
    private List<Persona> listaPersonas;
    private List<Zona> listaZonas;
    private List<Persona> listaIncidencias;
    private List<ServicioAdiccional> listaServiciosAdiccionales;
    private List<Asiento> listaAsientos;

    /**
     * constructor de la clase GestorEvento
     * @param direccion
     * @param nit
     * @param nombre
     */
  private GestorEvento(String direccion, String nit, String nombre) {
        this.direccion = direccion;
        this.listaCompras = new ArrayList<>();
        this.listaEventos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaRecintos = new ArrayList<>();
        this.listaZonas=new ArrayList<>();
        this.listaIncidencias=new ArrayList<>();
        this.listaServiciosAdiccionales=new ArrayList<>();
        this.listaAsientos=new ArrayList<>();
        this.nit = nit;
        this.nombre = nombre;
    }

    public static GestorEvento getInstance(){
        if(instancia==null){
            instancia=new GestorEvento("centro", "1234", "Gestor evento");
        }
        return instancia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static GestorEvento getInstancia() {
        return instancia;
    }

    public static void setInstancia(GestorEvento instancia) {
        GestorEvento.instancia = instancia;
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

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Recinto> getListaRecintos() {
        return listaRecintos;
    }

    public void setListaRecintos(List<Recinto> listaRecintos) {
        this.listaRecintos = listaRecintos;
    }

    public List<Asiento> getListaAsientos() {
        return this.listaAsientos;
    }

    public void setListaAsientos(final List<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public List<Persona> getListaIncidencias() {
        return this.listaIncidencias;
    }

    public void setListaIncidencias(final List<Persona> listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }

    public List<ServicioAdiccional> getListaServiciosAdiccionales() {
        return this.listaServiciosAdiccionales;
    }

    public void setListaServiciosAdiccionales(final List<ServicioAdiccional> listaServiciosAdiccionales) {
        this.listaServiciosAdiccionales = listaServiciosAdiccionales;
    }

    public List<Zona> getListaZonas() {
        return this.listaZonas;
    }

    public void setListaZonas(final List<Zona> listaZonas) {
        this.listaZonas = listaZonas;
    }
}
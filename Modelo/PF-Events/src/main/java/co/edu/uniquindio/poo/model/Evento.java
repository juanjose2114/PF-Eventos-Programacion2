package co.edu.uniquindio.poo.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Evento {

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
     * @param builder
     */
    private Evento(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.descripcion = builder.descripcion;
        this.ciudad = builder.ciudad;
        this.hora = builder.hora;
        this.fecha = builder.fecha;
        this.recinto = builder.recinto;
        this.cagoriaEvento = builder.cagoriaEvento;
        this.ownedByGestorEvento = builder.ownedByGestorEvento;
        this.estadoEvento = builder.estadoEvento;
        this.listaPoliticas = new ArrayList<>(builder.listaPoliticas);
        this.listaPersonas =  new ArrayList<>(builder.listaPersonas);
        this.listaIncidencias = new ArrayList<>(builder.listaIncidencias);
        this.compra = builder.compra;
    }

    /**
     * getters y setters
     * @return
     */
    public CategoriaEvento getCagoriaEvento() {
        return this.cagoriaEvento;
    }

    public void setCagoriaEvento(final CategoriaEvento cagoriaEvento) {
        this.cagoriaEvento = cagoriaEvento;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(final String ciudad) {
        this.ciudad = ciudad;
    }

    public Compra getCompra() {
        return this.compra;
    }

    public void setCompra(final Compra compra) {
        this.compra = compra;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoEvento getEstadoEvento() {
        return this.estadoEvento;
    }

    public void setEstadoEvento(final EstadoEvento estadoEvento) {
        this.estadoEvento = estadoEvento;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(final LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(final int hora) {
        this.hora = hora;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
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

    public List<Politica> getListaPoliticas() {
        return this.listaPoliticas;
    }

    public void setListaPoliticas(final List<Politica> listaPoliticas) {
        this.listaPoliticas = listaPoliticas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public GestorEvento getOwnedByGestorEvento() {
        return this.ownedByGestorEvento;
    }

    public void setOwnedByGestorEvento(final GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento = ownedByGestorEvento;
    }

    public Recinto getRecinto() {
        return this.recinto;
    }

    public void setRecinto(final Recinto recinto) {
        this.recinto = recinto;
    }

    /**
     * clase builder
     */
    public static class Builder {

        private String nombre;
        private String id;
        private String descripcion;
        private String ciudad;
        private int hora;
        private LocalDate fecha;
        private List<Politica> listaPoliticas=new ArrayList<>();
        private List<Persona> listaPersonas=new ArrayList<>();
        private Recinto recinto;
        private EstadoEvento estadoEvento;
        private CategoriaEvento cagoriaEvento;
        private List<Incidencia> listaIncidencias= new ArrayList<>();
        private GestorEvento ownedByGestorEvento;
        private Compra compra;

        /**
         * constructor de la clase builder de los atributos obligatorios
         * @param id
         * @param nombre
         */
        public Builder(String id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        /**
         * metodo builder
         * @param descripcion
         * @return
         */
        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Builder hora(int hora) {
            this.hora = hora;
            return this;
        }

        public Builder fecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder recinto(Recinto recinto) {
            this.recinto = recinto;
            return this;
        }

        public Builder estadoEvento(EstadoEvento estadoEvento) {
            this.estadoEvento = estadoEvento;
            return this;
        }

        public Builder categoriaEvento(CategoriaEvento categoriaEvento) {
            this.cagoriaEvento = categoriaEvento;
            return this;
        }

        public Builder ownedByGestorEvento(GestorEvento ownedByGestorEvento) {
            this.ownedByGestorEvento = ownedByGestorEvento;
            return this;
        }

        /**
         * metodo para agregar una politica
         * @param politica
         * @return
         */
        public Builder agregarPolitica(Politica politica) {
            this.listaPoliticas.add(politica);
            return this;
        }

        /**
         * metodo para construir el objeto
         * @return
         */
        public Evento build() {
            return new Evento(this);
        }
    }
}
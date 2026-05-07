package co.edu.uniquindio.poo.model;
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

    private GestorEvento(String direccion, List<Compra> listaCompras, List<Evento> listaEventos,
                       List<Persona> listaPersonas, List<Recinto> listaRecintos, String nit, String nombre) {
        this.direccion = direccion;
        this.listaCompras = listaCompras;
        this.listaEventos = listaEventos;
        this.listaPersonas = listaPersonas;
        this.listaRecintos = listaRecintos;
        this.nit = nit;
        this.nombre = nombre;
    }

    public static GestorEvento getInstance(){
        if(instancia==null){
            instancia=new GestorEvento();
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



}
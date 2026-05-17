package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Recinto {
    private String nombre;
    private String direccion;
    private String id;
    private String ciudad;
    private ArrayList<Zona> listaZonas;
    private ArrayList<Evento> listaEventos;
    private GestorEvento ownedByGestorEvento;

    public Recinto(String nombre, String direccion, String id, String ciudad, GestorEvento ownedByGestorEvento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.ciudad = ciudad;
        this.listaZonas= new ArrayList<Zona>();
        this.listaEventos= new ArrayList<Evento>();
        this.ownedByGestorEvento = ownedByGestorEvento;
    }

/**
 * Obtener Ciudad del Recinto
 * @return Ciudad actual del Recinto
 */
public String getCiudad() {
        return ciudad;
    }

/**
 * Actualizar Ciudad del Recinto
 * @param ciudad nueva del Recinto
 */
public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

/**
 * Obtener Direccion del Recinto
 * @return Direccion actual del Recinto
 */
public String getDireccion() {
        return direccion;
    }

/**
 * Actualizar Direccion del Recinto
 * @param direccion nueva del Recinto
 */
public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

/**
 * Obtener Id del Recinto
 * @return Id actual del Recinto
 */
public String getId() {
        return id;
    }

/**
 * Actualizar Id del Recinto
 * @param id nuevo del Recinto
 */
public void setId(String id) {
        this.id = id;
    }

/**
 *Obtener lista de Zonas del Recinto
 * @return lista de Zonas actual del Recinto
 */
public ArrayList<Zona> getListaZonas() {
        return listaZonas;
    }

/**
 * Actualizar lista de Zonas del Recinto
 * @param listaZonas nueva del Recinto
 */
public void setListaZonas(ArrayList<Zona> listaZonas) {
        this.listaZonas = listaZonas;
    }

/**
 * Obtener Nombre del Recinto
 * @return Nombre actual del Recinto
 */
public String getNombre() {
        return nombre;
    }

    /**
     * Actualizar Nombre del Recinto
     * @param nombre nuevo del Recinto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener lista Eventos que agregan al Recinto
     * @return lista Eventos actuales que agregan al Recinto
     */
    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    /**
     * Actualizar lista Eventos que agregan al Recinto
     * @param listaEventos nueva que agregan al Recinto
     */
    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    /**
     * Obtener Gestor Eventos dueña del Recinto
     * @return Gestor Eventos actual dueña del Recinto
     */
    public GestorEvento getOwnedByGestorEvento() {
        return ownedByGestorEvento;
    }

    /**
     * Actualizar Gestor Eventos dueña del Recinto
     * @param ownedByGestorEvento nuevo dueña del Recinto
     */
    public void setOwnedByPrincipal(GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento= ownedByGestorEvento;
    }
}
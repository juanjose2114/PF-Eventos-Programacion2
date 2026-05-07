package co.edu.uniquindio.poo.model;

import java.util.List;

public class Recinto {
    private String nombre;
    private String direccion;
    private String id;
    private String ciudad;
    private List<Zona> listaZonas;
    private Evento ownedByEvento;
    private GestorEvento ownedByGestorEvento;

    public Recinto(String ciudad, String direccion, String id, List<Zona> listaZonas, String nombre, Evento ownedByEvento, GestorEvento ownedByGestorEvento) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.id = id;
        this.listaZonas = listaZonas;
        this.nombre = nombre;
        this.ownedByEvento = ownedByEvento;
        this.ownedByGestorEvento = ownedByGestorEvento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Zona> getListaZonas() {
        return listaZonas;
    }

    public void setListaZonas(List<Zona> listaZonas) {
        this.listaZonas = listaZonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Evento getOwnedByEvento() {
        return ownedByEvento;
    }

    public void setOwnedByEvento(Evento ownedByEvento) {
        this.ownedByEvento = ownedByEvento;
    }

    public GestorEvento getOwnedByGestorEvento() {
        return ownedByGestorEvento;
    }

    public void setOwnedByPrincipal(GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento= ownedByGestorEvento;
    }
}
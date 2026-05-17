package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Persona {
    private String idUsuario;
    private String nombre;
    private String telefono;
    private String correo;
    private GestorEvento ownedByGestorEvento;

    /***
     * Constructor de la clase Persona
     * @param correo de la persona
     * @param idUsuario de la persona
     * @param nombre de la persona
     * @param ownedByGestorEvento
     * @param telefono de la persona
     */

    public Persona(String correo, String idUsuario, String nombre, GestorEvento ownedByGestorEvento, String telefono) {
        this.correo = correo;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.ownedByGestorEvento = ownedByGestorEvento;
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo de la persona
     * @return el correo actual de la persona
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Actualiza el correo del usuario
     * @param correo nuevo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el ID de la persona
     * @return el ID actual de la persona
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Actualiza el ID de la persona
     * @param idUsuario nuevo del usuario
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el Nombre de la persona
     * @return el nombre actual de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre de la persona
     * @param nombre nuevo de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el Gestor de Eventos propietario de la persona
     * @return el Gestor de Eventos propietario actual de la persona
     */
    public GestorEvento getOwnedByPrincipal() {
        return ownedByGestorEvento;
    }

    /**
     * Actualiza el Gestor de Eventos propietario de la persona
     * @param ownedByGestorEvento nuevo propietario de la persona
     */
    public void setOwnedByPrincipal(GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento = ownedByGestorEvento;
    }

    /**
     * Obtiene el telefono de la persona
     * @return el telefono actual de la persona
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Actualiza el telefono de la persona
     * @param telefono nuevo de la persona
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
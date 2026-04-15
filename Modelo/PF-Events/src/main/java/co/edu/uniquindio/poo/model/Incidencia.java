package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Incidencia {
    private String idIncidencia;
    private String descripcion;
    private LocalDate fecha;
    private TipoIncidencia tipoIncidencia;
    private Compra compra;
    private Usuario usuario;

    /**
     * Metodo Constructor para la clase Incidencia
     * @param idIncidencia para identificacion unica entre ellas
     * @param descripcion del motivo de la incidencia
     * @param fecha creacion de la incidencia
     * @param compra involucrada en la incidencia
     * @param usuario involucrada en la incidencia
     */
    public Incidencia(String idIncidencia, String descripcion, LocalDate fecha, TipoIncidencia tipoIncidencia , Compra compra, Usuario usuario) {
        this.idIncidencia = idIncidencia;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipoIncidencia = tipoIncidencia;
        this.compra = compra;
        this.usuario = usuario;
    }

    // Getters & Setters
    public String getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(String idIncidencia) {
        this.idIncidencia = idIncidencia;
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

    public TipoIncidencia getTipoIncidencia() {
        return tipoIncidencia;
    }

    public void setTipoIncidencia(TipoIncidencia tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

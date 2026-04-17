package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Notificacion {
    private String idNotificacion;
    private String titulo;
    private String mensaje;
    private LocalDate fecha;
    private TipoNotificacion tipoNotificacion;
    private Principal ownedByPrincipal;
    private Compra compra;

    /**
     * Metodo Constructor para la clase Notificacion
     * @param idNotificacion para identificación unica de las notificaciones
     * @param titulo de la notificacion
     * @param mensaje de la notificacion
     * @param fecha generacion de la notificacion
     * @param tipoNotificacion para el usuario
     * @param compra asociada a la notificacion
     */
    public Notificacion(String idNotificacion, String titulo, String mensaje, LocalDate fecha,
                        TipoNotificacion tipoNotificacion, Compra compra) {
        this.idNotificacion = idNotificacion;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.tipoNotificacion = tipoNotificacion;
        this.compra = compra;
    }

    // Getters & Setters
    public String getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public Principal getOwnedByPrincipal() {
        return ownedByPrincipal;
    }

    public void setOwnedByPrincipal(Principal ownedByPrincipal) {
        this.ownedByPrincipal = ownedByPrincipal;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}

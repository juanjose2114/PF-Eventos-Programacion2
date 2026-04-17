package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Politica {
    private String descripcion;
    private LocalDate fecha;
    private int vigencia;
    private Evento ownedByEvento;
    private DetalleEvento ownedByDetalleEvento;

    /**
     * Metodo Constructor de la clase Politica
     * @param descripcion de las politicas a implementar
     * @param fecha de publicación
     * @param vigencia de las politicas implementadas
     */
    public Politica(String descripcion, LocalDate fecha, int vigencia) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.vigencia = vigencia;
    }

    //Getters & Setters
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

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public Evento getOwnedByEvento() {
        return ownedByEvento;
    }

    public void setOwnedByEvento(Evento ownedByEvento) {
        this.ownedByEvento = ownedByEvento;
    }

    public DetalleEvento getOwnedByDetalleEvento() {
        return ownedByDetalleEvento;
    }

    public void setOwnedByDetalleEvento(DetalleEvento ownedByDetalleEvento) {
        this.ownedByDetalleEvento = ownedByDetalleEvento;
    }

}

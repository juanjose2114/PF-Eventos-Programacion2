package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String idCompra;
    private LocalDate fechaCreacion;
    private double total;
    private Entrada entrada;
    private List<Pago> listaPagos;
    private Usuario usuario;

    /**
     * constructor de la clase compra
     * @param fechaCreacion
     * @param idCompra
     * @param total
     */
    public Compra( LocalDate fechaCreacion, String idCompra, double total) {
        this.entrada = entrada;
        this.fechaCreacion = fechaCreacion;
        this.idCompra = idCompra;
        this.listaPagos = new ArrayList<>();
        this.total = total;
        this.usuario = usuario;
    }

    public Entrada getEntrada() {
        return this.entrada;
    }

    public void setEntrada(final Entrada entrada) {
        this.entrada = entrada;
    }

    public LocalDate getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(final LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(final String idCompra) {
        this.idCompra = idCompra;
    }

    public List<Pago> getListaPagos() {
        return this.listaPagos;
    }

    public void setListaPagos(final List<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(final double total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(final Usuario usuario) {
        this.usuario = usuario;
    }

}

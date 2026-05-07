package co.edu.uniquindio.poo.model;

import java.util.List;

public class Usuario extends Persona {
    private List<Compra> listaCompras;
    private List<Incidencia> listaIncidencias;
    private List<MetodoDePago> listaMetodoDePagos;

    /**
     * constructor de usuario
     * @param listaCompras
     * @param listaIncidencias
     * @param listaMetodoDePagos
     */
    public Usuario(List<Compra> listaCompras, List<Incidencia> listaIncidencias, List<MetodoDePago> listaMetodoDePagos) {
        this.listaCompras = listaCompras;
        this.listaIncidencias = listaIncidencias;
        this.listaMetodoDePagos = listaMetodoDePagos;
    }

    public List<MetodoDePago> getListaMetodoDePagos() {
        return listaMetodoDePagos;
    }

    public void setListaMetodoDePagos(List<MetodoDePago> listaMetodoDePagos) {
        this.listaMetodoDePagos = listaMetodoDePagos;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Incidencia> getListaIncidencias() {
        return listaIncidencias;
    }

    public void setListaIncidencias(List<Incidencia> listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }
}
package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private ArrayList<Evento> listaEventos;
    private ArrayList<Compra>listaCompras;
    private ArrayList<Entrada>listaEntradas;
    private ArrayList<IMetodoPago>listaMetodosPago;

    public Usuario(String correo, String idUsuario, String nombre, GestorEvento ownedByGestorEvento, String telefono) {
        super(correo, idUsuario, nombre, ownedByGestorEvento, telefono);
        this.listaEventos= new ArrayList<Evento>();
        this.listaCompras= new ArrayList<Compra>();
        this.listaEntradas= new ArrayList<Entrada>();
        this.listaMetodosPago=  new ArrayList<IMetodoPago>();
    }

    /**
     * Obtiene la lista de Eventos que participa la persona
     * @return la lista de Eventos actuales en los que participa la persona
     */
    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    /**
     * Actualiza la lista de Eventos que participa la persona
     * @param listaEventos nuevos en los que participa la persona
     */
    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    /**
     * Obtiene la lista de Compras que tiene la persona
     * @return la lista de compras actuales que tiene la persona
     */
    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    /**
     * Actualiza la lista de Compras que tiene la persona
     * @param listaCompras nueva que tiene la persona
     */
    public void setListaCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    /**
     * Obtiene la lista de Entradas que tiene la persona
     * @return la lista de Entradas actual que tiene la persona
     */
    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    /**
     * Actualiza la lista de Entradas que tiene la persona
     * @param listaEntradas nueva que tiene la persona
     */
    public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    /**
     * Obtiene la lista de Metodos de Pago de la persona
     * @return la lista actual de Metodos de Pago de la persona
     */
    public ArrayList<IMetodoPago> getListaMetodosPago() {
        return listaMetodosPago;
    }

    /**
     * Actualiza la lista de Metodos de Pago de la persona
     * @param listaMetodosPago nueva de la persona
     */
    public void setListaMetodosPago(ArrayList<IMetodoPago> listaMetodosPago) {
        this.listaMetodosPago = listaMetodosPago;
    }
}
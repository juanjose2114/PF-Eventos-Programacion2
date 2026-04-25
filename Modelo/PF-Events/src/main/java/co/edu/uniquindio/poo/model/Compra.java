package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Compra {

    private final String id;
    private String Usuario;
    private String fechaCreacion;
    private double total;
    private EstadoCompra estadoCompra;
    private Entrada entrada;                        //entrada asociada
    private ArrayList<ServicioAdicional> serviciosAdicionales;

    /**
     * Constructor de la clase compra
     * @param id de la compra
     * @param fechaCreacion de la compra
     */
    public Compra(String id, String fechaCreacion) {

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.id = id;

        if (fechaCreacion == null || fechaCreacion.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.fechaCreacion = fechaCreacion;

        serviciosAdicionales = new ArrayList<>();

        this.estadoCompra = EstadoCompra.BORRADOR;
    }

    /**
     * metodo requerido descargar comprobante de compra con:
     * atributos, estado, servicios costos y total
     * @return simulacion de comprobante
     */
    public String descargarComprobante () {
        String mensaje =
                  "Estado de la compra: " + estadoCompra
                + "\n Usuario:      " // + Usuario.getNombre() + "-" + Usuario.getCedula()
                + "\n Estado:       "
                + "\n Id:           "
                + "\n Fecha Compra: "

                ;

        for (ServicioAdicional s : serviciosAdicionales){
            mensaje += "\n" + s.getDescribcion();
        }

        mensaje += "\n--------------------------------------\nTotal compra: " + total
                    // + "\nEntrada Asociada: " + entrada
        ;

        return mensaje;
    }

    /**
     * Solicitud de cancelacion de Compra siguiendo las politicas
     * @return resultado de la operacion, completada(True) o no Realizada(False)
     */
    public boolean cancelarCompra (){
        //ni la menor pitufiIdea de como sera este, es necesario plantear las politicas para crear eficazmente este metodo
        return false;
    }

    /**
     *Solicitud de anulacion de entrada siguiendo las politicas
     */
    public boolean anularEntrada (){
        // - anularEntradaCancelaciónReembolso
        return false;
    }

    /**
     * agregar un servicio adicional
     * @return resultado de la operacion, Agregada(True) , No Agregada(False)
     */
    public boolean agregarServicioAdicional (ServicioAdicional servicioAdicional){

        if (buscarServicioAdicional(servicioAdicional.getId()) != null ){
            throw new IllegalArgumentException("Servicio adicional duplicado");
        }

        return serviciosAdicionales.add(servicioAdicional);
    }

    /**
     * codigo funcional para la busqueda de un servicio adicional con id conocido
     * @param idServicio
     * @return servicioAdicional con id idServicio o null de no encontrarse en la compra
     */
    public ServicioAdicional buscarServicioAdicional(String idServicio) {
        for (ServicioAdicional s : serviciosAdicionales) {
            if (idServicio.equals(s.getId())) {
                return s;
            }
        }
        return null;
    }

    /**
     * remueve un servicio adicional con un id ya conocido
     * @param idServicioAdicional
     * @return resultado de la operacion remove
     */
    public boolean quitarServicioAdicional (String idServicioAdicional){
        for (ServicioAdicional s : serviciosAdicionales) {
            if (s.getId().equals(idServicioAdicional)){
                return serviciosAdicionales.remove(s);
            }
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoCompra getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(EstadoCompra estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public ArrayList<ServicioAdicional> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(ArrayList<ServicioAdicional> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
}

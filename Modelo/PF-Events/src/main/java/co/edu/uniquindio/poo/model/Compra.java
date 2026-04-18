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
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        serviciosAdicionales = new ArrayList<>();
    }

    /**
     * metodo requerido descargar comprobante de compra con:
     * atributos, estado, servicios costos y total
     * @return simulacion de comprobante
     */
    public String descargarComprobante (){
        return "";
    }

    /**
     * Solicitud de cancelacion de Compra siguiendo las politicas
     * @return resultado de la operacion, completada(True) o no Realizada(False)
     */
    public boolean cancelarCompra (){
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
    public boolean agregarServicioAdicional (){
        return false;
    }

    public void agregarServicioAdicional (ServicioAdicional servicioAdicional){
        serviciosAdicionales.add(servicioAdicional);
    }

    public boolean quirarServicioAdicional (String idServicioAdicional){
        for (ServicioAdicional s : serviciosAdicionales) {
            if (s.getId().equals(idServicioAdicional)){
                return serviciosAdicionales.remove(s
                );
            }
        }
        return false;
    }


}

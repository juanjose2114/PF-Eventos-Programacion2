package co.edu.uniquindio.poo.model;

public class MetodoDePago {

    public final String id;
    public String nombre;

    /**
     * costructor de metodo de pago que se guardara en usuario
     * Ej: tarjetaCredito, tarjetaDebito, transferencia
     * @param id del metodo de pago
     * @param nombre del metodo de pago
     */
    public MetodoDePago(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

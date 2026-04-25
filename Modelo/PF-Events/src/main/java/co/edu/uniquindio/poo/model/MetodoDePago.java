package co.edu.uniquindio.poo.model;

public class MetodoDePago {

    private final String id;
    private String nombre;

    /**
     * costructor de metodo de pago que se guardara en usuario
     * Ej: tarjetaCredito, tarjetaDebito, transferencia
     * @param id del metodo de pago
     * @param nombre del metodo de pago
     */
    public MetodoDePago(String id, String nombre) {

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.id = id;

        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

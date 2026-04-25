package co.edu.uniquindio.poo.model;

public class Asiento {

    private final String id;
    private int fila;
    private int numero;
//    private EstadoAsiento estado;

    public Asiento(String id, int fila, int numero) {

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.id = id;
        this.fila = fila;
        this.numero = numero;
    }

    public String getId() {
        return id;
    }
}

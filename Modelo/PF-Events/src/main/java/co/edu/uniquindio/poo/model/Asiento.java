package co.edu.uniquindio.poo.model;

public class Asiento {

    private final String id;
    private int fila;
    private int numero;
//    private EstadoAsiento estado;

    public Asiento(String id, int fila, int numero) {


        assert id.isBlank() && id.isEmpty(): "el ID no puede ser null o estar en blanco";
        assert fila > 0: "la fila no puede ser 0";
        assert numero > 0: "el ID no puede ser 0";

        this.id = id;
        this.fila = fila;
        this.numero = numero;
    }

    public String getId() {
        return id;
    }
}

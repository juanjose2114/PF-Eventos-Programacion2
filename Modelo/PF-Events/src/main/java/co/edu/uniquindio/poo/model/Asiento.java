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

        if (fila <= 0){
            throw new IllegalArgumentException("No Natural No Haceptado (fila)");
        }
        this.fila = fila;

        if (numero <= 0){
            throw new IllegalArgumentException("No Natural No Haceptado (numero)");
        }
        this.numero = numero;
    }

    public String getId() {
        return id;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "id='" + id + '\'' +
                ", fila=" + fila +
                ", numero=" + numero +
                '}';
    }
}

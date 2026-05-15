package co.edu.uniquindio.poo.model;

public class Asiento implements Cloneable{
    private String id;
    private EstadoAsiento estadoAsiento;
    private Entrada entrada;

    /**
     * constructor de la clase asiento
     * @param id
     */
    public Asiento(String id){
        this.id=id;
        this.estadoAsiento=estadoAsiento;
        this.entrada=entrada;
    }

    public Entrada getEntrada() {
        return this.entrada;
    }

    public void setEntrada(final Entrada entrada) {
        this.entrada = entrada;
    }

    public EstadoAsiento getEstadoAsiento() {
        return this.estadoAsiento;
    }

    public void setEstadoAsiento(final EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Asiento clone() throws CloneNotSupportedException{
        return (Asiento) super.clone();
    }
}

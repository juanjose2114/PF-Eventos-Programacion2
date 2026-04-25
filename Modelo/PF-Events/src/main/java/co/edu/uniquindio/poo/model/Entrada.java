package co.edu.uniquindio.poo.model;

public class Entrada {

    private final String id;
    //private Zona zona;
    private Asiento asiento;
    private double precioFinal;
    private EstadoEntrada estadoEntrada;

    public Entrada(String id, Asiento asiento, EstadoEntrada estadoEntrada) {
        this.id = id;
        this.asiento = asiento;
        this.estadoEntrada = estadoEntrada;
    }

    // - seleccionarEntradaPorAsientos      aqui no va

}

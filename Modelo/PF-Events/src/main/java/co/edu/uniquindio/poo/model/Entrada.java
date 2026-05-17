package co.edu.uniquindio.poo.model;

public class Entrada {
    private String idEntrada;
    private double precioFinal;
    private Evento evento;
    private Tarifa tarifa;
    private AsientoProxy asiento;
    private GestorEvento ownedByGestorEvento;

    /**
     * Metodo Constructor para la clase Entrada
     * @param idEntrada
     * @param precioFinal de la Entrada
     * @param evento que agrega a la Entrada
     * @param tarifa de la entrada
     * @param asiento agregado a la Entrada
     * @param ownedByGestorEvento
     */
    public Entrada(String idEntrada, double precioFinal, Evento evento, Tarifa tarifa, AsientoProxy asiento,
                   GestorEvento ownedByGestorEvento) {
        this.idEntrada = idEntrada;
        this.precioFinal = precioFinal;
        this.evento = evento;
        this.tarifa = tarifa;
        this.asiento = asiento;
        this.ownedByGestorEvento = ownedByGestorEvento;
    }

    /**
     * Obtener Id de la Entrada
     * @return Id actual de la Entrada
     */
    public String getIdEntrada() {
        return idEntrada;
    }

    /**
     * Actualizar Id de la Entrada
     * @param idEntrada nuevo
     */
    public void setIdEntrada(String idEntrada) {
        this.idEntrada = idEntrada;
    }

    /**
     * Obtener Precio Final de la Entrada
     * @return precio Final actual de la Entrada
     */
    public double getPrecioFinal() {
        return precioFinal;
    }

    /**
     * Actualizar Precio Final de la Entrada
     * @param precioFinal nuevo de la Entrada
     */
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    /**
     * Obtener Evento que agrega a la Entrada
     * @return Evento actual que agrega a la Entrada
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * Actualizar Evento que agrega a la Entrada
     * @param evento nuevo que agrega a la Entrada
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * Obtener Tarifa de la Entrada
     * @return Tarifa actual de la Entrada
     */
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Actualizar Tarifa de la Entrada
     * @param tarifa nueva de la Entrada
     */
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * Obtener Asiento asociado a la Entrada
     * @return Asiento actual asociado a la Entrada
     */
    public AsientoProxy getAsiento() {
        return asiento;
    }

    /**
     * Actualizar Asiento asociado a la Entrada
     * @param asiento nuevo asociado a la Entrada
     */
    public void setAsiento(AsientoProxy asiento) {
        this.asiento = asiento;
    }

    /**
     * Obtener Gestor Eventos al que pertenece la Entrada
     * @return Gestor Eventos actual al que pertence la Entrada
     */
    public GestorEvento getOwnedByGestorEvento() {
        return ownedByGestorEvento;
    }

    /**
     * Actualizar Gestor Eventos al que pertenece la Entrada
     * @param ownedByGestorEvento nuevo al que pertenece la Entrada
     */
    public void setOwnedByGestorEvento(GestorEvento ownedByGestorEvento) {
        this.ownedByGestorEvento = ownedByGestorEvento;
    }
}

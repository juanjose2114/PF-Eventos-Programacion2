package co.edu.uniquindio.poo.model;

public class Pago {

    private final String id;
    private  double monto;
    //despues sera localDate
    private String fecha;

    /**
     * Constructor del Pago realizado de una compra
     * @param id del pago
     * @param monto del pago
     * @param fecha del pago
     */
    public Pago(String id, double monto, String fecha) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
    }
}

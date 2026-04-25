package co.edu.uniquindio.poo.model;

public class Pago {

    private final String id;
    private  double monto;
    private String fecha;  //despues sera localDate

    /**
     * Constructor del Pago realizado de una compra
     * @param id del pago
     * @param monto del pago
     * @param fecha del pago
     */
    public Pago(String id, double monto, String fecha) {

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.id = id;

        if (monto <= 0){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.monto = monto;

        //prueba localDate futura
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

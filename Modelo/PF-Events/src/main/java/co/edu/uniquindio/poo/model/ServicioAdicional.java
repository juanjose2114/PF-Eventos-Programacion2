package co.edu.uniquindio.poo.model;

public class ServicioAdicional {

    // id, nombre, precio, descripción, TipoServicio

    private final String id;
    private String nombre;
    private double precio;
    private String describcion;
    private TipoServicioAdicional tipoServicioAdicional;

    public ServicioAdicional(String id, String nombre, double precio, String describcion, TipoServicioAdicional tipoServicioAdicional) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.describcion = describcion;
        this.tipoServicioAdicional = tipoServicioAdicional;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescribcion() {
        return describcion;
    }

    public void setDescribcion(String describcion) {
        this.describcion = describcion;
    }

    public TipoServicioAdicional getTipoServicioAdicional() {
        return tipoServicioAdicional;
    }

    public void setTipoServicioAdicional(TipoServicioAdicional tipoServicioAdicional) {
        this.tipoServicioAdicional = tipoServicioAdicional;
    }
}

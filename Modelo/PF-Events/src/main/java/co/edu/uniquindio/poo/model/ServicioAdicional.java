package co.edu.uniquindio.poo.model;

public class ServicioAdicional {


    private final String id;
    private String nombre;
    private double precio;
    private String describcion;
    private TipoServicioAdicional tipoServicioAdicional;

    public ServicioAdicional(String id, String nombre, double precio, String describcion, TipoServicioAdicional tipoServicioAdicional) {

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.id = id;

        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.nombre = nombre;

        if (precio <= 0){
            throw new IllegalArgumentException("Dato cero o negativo no haceptado");
        }
        this.precio = precio;

        if (describcion == null || describcion.isBlank()){
            throw new IllegalArgumentException("Dato nulo o vacio no haceptado");
        }
        this.describcion = describcion;

        if (tipoServicioAdicional == null){
            throw new IllegalArgumentException("Dato nulo no haceptado");
        }
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

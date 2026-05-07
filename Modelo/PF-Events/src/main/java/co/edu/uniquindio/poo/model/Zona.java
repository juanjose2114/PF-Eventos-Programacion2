package co.edu.uniquindio.poo.model;
public class Zona {
    private String id;
    private String nombre;
    private int capacidad;
    private double precioBase;
    private Recinto ownedByRecinto;
    private List<Asiento> listaAsientos;

    public Zona(int capacidad, String id, List<Asiento> listaAsientos, String nombre, Recinto ownedByRecinto, double precioBase) {
        this.capacidad = capacidad;
        this.id = id;
        this.listaAsientos = listaAsientos;
        this.nombre = nombre;
        this.ownedByRecinto = ownedByRecinto;
        this.precioBase = precioBase;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(List<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Recinto getOwnedByRecinto() {
        return ownedByRecinto;
    }

    public void setOwnedByRecinto(Recinto ownedByRecinto) {
        this.ownedByRecinto = ownedByRecinto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
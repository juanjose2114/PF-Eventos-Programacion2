public class DetalleEvento{
    private Evento ownedByEvento;
    private List<Politica> listaPoliticas;
    private Sting descripcion;
    private String lugar;
    private LocalDate fecha;
    private String aforo;


    public DetalleEvento(String aforo, Sting descripcion, LocalDate fecha, List<Politica> listaPoliticas,
                         String lugar, Evento ownedByEvento) {
        this.aforo = aforo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.listaPoliticas = listaPoliticas;
        this.lugar = lugar;
        this.ownedByEvento = ownedByEvento;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }

    public Sting getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Sting descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Politica> getListaPoliticas() {
        return listaPoliticas;
    }

    public void setListaPoliticas(List<Politica> listaPoliticas) {
        this.listaPoliticas = listaPoliticas;
    }

    public Evento getOwnedByEvento() {
        return ownedByEvento;
    }

    public void setOwnedByEvento(Evento ownedByEvento) {
        this.ownedByEvento = ownedByEvento;
    }
}
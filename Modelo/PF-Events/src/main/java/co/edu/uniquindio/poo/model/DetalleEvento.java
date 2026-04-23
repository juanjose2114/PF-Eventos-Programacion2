public class DetalleEvento{
    private Evento ownedByEvento;
    private List<Politica> listaPoliticas;

    public DetalleEvento(List<Politica> listaPoliticas, Evento ownedByEvento) {
        this.listaPoliticas = listaPoliticas;
        this.ownedByEvento = ownedByEvento;
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
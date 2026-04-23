public final class Principal {
    private static Principal instancia;
    private String nombre;
    private String direccion;
    private Strinng nit;
    private List<Evento> listaEventos;
    private List<Filtro> listaFiltros;
    private List<Recintos> listaRecintos;
    private List<ReportePago> listaReportePagos;
    private List<Notificacion> listaNotificaciones;
    private List<Compra> listaCompras;
    private List<Persona> listaPersonas;

    private Principal(String direccion, List<Compra> listaCompras, List<Evento> listaEventos, List<Filtro> listaFiltros,
                     List<Notificacion> listaNotificaciones, List<Persona> listaPersonas, List<Recintos> listaRecintos, List<ReportePago> listaReportePagos, Strinng nit, String nombre) {
        this.direccion = direccion;
        this.listaCompras = listaCompras;
        this.listaEventos = listaEventos;
        this.listaFiltros = listaFiltros;
        this.listaNotificaciones = listaNotificaciones;
        this.listaPersonas = listaPersonas;
        this.listaRecintos = listaRecintos;
        this.listaReportePagos = listaReportePagos;
        this.nit = nit;
        this.nombre = nombre;
    }

    public static Principal getInstance(){
        if(instancia==null){
            instancia=new Principal();
        }
        return instancia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Strinng getNit() {
        return nit;
    }

    public void setNit(Strinng nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Principal getInstancia() {
        return instancia;
    }

    public static void setInstancia(Principal instancia) {
        Principal.instancia = instancia;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public List<Filtro> getListaFiltros() {
        return listaFiltros;
    }

    public void setListaFiltros(List<Filtro> listaFiltros) {
        this.listaFiltros = listaFiltros;
    }

    public List<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(List<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Recintos> getListaRecintos() {
        return listaRecintos;
    }

    public void setListaRecintos(List<Recintos> listaRecintos) {
        this.listaRecintos = listaRecintos;
    }

    public List<ReportePago> getListaReportePagos() {
        return listaReportePagos;
    }

    public void setListaReportePagos(List<ReportePago> listaReportePagos) {
        this.listaReportePagos = listaReportePagos;
    }
    /**
     *  Metodo para Agregar personas
     */
    public String agregarPersona(Persona nuevaPersona) {
        String mensaje = "";
        Optional<Persona> personaExistente = buscarPersona(nuevaPersona.getIdUsuario());
        if (personaExistente.isPresent()) {
            mensaje = "la persona con el id: " + nuevaPersona.getIdUsuario() + " ya existe";
        } else {
            listaPersonas.add(nuevaPersona);
            mensaje = "La persona " + nuevaPersona.getNombre() + " fue agregado exitosamente";
        }
        return mensaje;
    }

    /**
     * Metodo para buscar personas
     */
    public Optional buscarPersona(String idUsuario) {
        return listaPersonas.stream().filter(Persona -> Persona.getIdUsuario().equals(idUsuario)).findFirst();
    }

    /**
     * Metodo para actualizar personas
     */
    public String actualizarPersona(String idUsuario, String nuevoNombre, String nuevoIdUsuario, String nuevoCorreo, String nuevoTelelefono) {
        String mensaje = "";
        Optional<Persona> personaExistente = buscarPersona(idUsuario);
        if (personaExistente.isPresent()) {
            personaExistente.get().setNombre(nuevoNombre);
            personaExistente.get().setIdUsuario(nuevoIdUsuario);
            personaExistente.get().setCorreo(nuevoCorreo);
            personaExistente.get().setTelelefono(nuevoTelelefono);
            mensaje = "la persona con id: " + idUsuario + " fue actualizada correctamente";
        } else {
            mensaje = "la persona no existe";
        }
        return mensaje;
    }

    /**
     * Metodo para eliminar personas
     */
    public String eliminarPersona(String idUsuario) {
        String mensaje = "";
        Optional<Persona> personaExistente = buscarPersona(idUsuario);
        if (personaExistente.isPresent()) {
            listaPersonas.remove(personaExistente.get());
            mensaje = "la persona con id " + idUsuario + " fue eliminada exitosamente";
        } else {
            mensaje = "la persona no existe";
        }
        return mensaje;
    }
    /**
     * Metodo para Agregar Eventos
     */
    public String agregarEvento(Evento nuevoEvento) {
        String mensaje = "";
        Optional<Evento> eventoExistente = buscarEvento(nuevoEvento.getId());
        if (eventoExistente.isPresent()) {
            mensaje = "el evento con el id: " + nuevoEvento.getId() + " ya existe";
        } else {
            listaEventos.add(nuevoEvento);
            mensaje = "El evento" + nuevoEvento.getNombre() + " fue agregado exitosamente";
        }
        return mensaje;
    }
    /**
     * Metodo para buscar eventos
     */
    public Optional buscarEvento(String id) {
        return listaEventos.stream().filter(Evento -> Evento.getId().equals(id)).findFirst();
    }
    /**
     * Metodo para actualizar eventos
     */
    public String actualizarEventos(String id, String nuevoNombre, String nuevoId, String nuevaDescripcion, String nuevaCiudad, int nuevaHora, LocalDate nuevaFecha) {
        String mensaje = "";
        Optional<Evento> eventoExistente = buscarEvento(id);
        if (eventoExistente.isPresent()) {
            eventoExistente.get().setNombre(nuevoNombre);
            eventoExistente.get().setId(nuevoId);
            eventoExistente.get().setDescripcion(nuevaDescripcion);
            eventoExistente.get().setCiudad(nuevaCiudad);
            eventoExistente.get().setHora(nuevaHora);
            eventoExistente.get().setFecha(nuevaFecha);
            mensaje = "el evento con id: " + idUsuario + " fue actualizado correctamente";
        } else {
            mensaje = "el evento no existe";
        }
        return mensaje;
    }
    /**
     * Metodo para eliminar eventos
     */
    public String eliminarEventos(String id) {
        String mensaje = "";
        Optional<Evento> eventoExistente = buscarEvento(id);
        if (eventoExistente.isPresent()) {
            listaEventos.remove(eventoExistente.get());
            mensaje = "el evento con id " + id + " fue eliminado exitosamente";
        } else {
            mensaje = "el evento no existe";
        }
        return mensaje;
    }
}
package co.edu.uniquindio.poo.model;

public class Admin extends Persona{

    /**
     * constructor del Admin
     */
    public Admin(String correo, String idUsuario, String nombre, GestorEvento ownedByGestorEvento, String telefono) {
        super(correo,idUsuario,nombre,ownedByGestorEvento, telefono);
    }


}
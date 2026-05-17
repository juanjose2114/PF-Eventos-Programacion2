package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class BilleteraDigital implements IMetodoPago{
    private String celular;
    private int contrasenia;

    /**
     * Metodo Constructor Clase Billetera Digital
     * @param celular de la Billetera Digital
     * @param contrasenia de la Billetera Digital
     */
    public BilleteraDigital(String celular, int contrasenia) {
        this.celular = celular;
        this.contrasenia = contrasenia;
    }

    /**
     * Obtener celular de la Billetera Digital
     * @return celular actual de la Billetera Digital
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Actualizar celular de la Billetera Digital
     * @param celular nuevo de la Billetera Digital
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Obtener contrasenia de la Billetera Digital
     * @return contrasenia actual de la Billetera Digital
     */
    public int getContrasenia() {
        return contrasenia;
    }

    /**
     * Actualizar contrasenia de la Billetera Digital
     * @param contrasenia nueva de la Billetera Digital
     */
    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Metodo para simular pago con Billetera Digital
     * @param monto a pagar
     * @return pago exitoso en el 60% de los casos
     */
    @Override
    public boolean pagar(int monto) {
        if(monto<0){
            JOptionPane.showMessageDialog(null, "El monto no puede ser negativo");
            return false;
        }
        boolean pagoExitoso= Math.random()<0.6;
        if(pagoExitoso==true){
            JOptionPane.showMessageDialog(null, "Pago con Billetera Digital Exitoso");
        } else{
            JOptionPane.showMessageDialog(null, "La Billetera Digital presenta fallos en estos momentos." +
                    "Intente nuevamente");
        }
        return pagoExitoso;
    }
}

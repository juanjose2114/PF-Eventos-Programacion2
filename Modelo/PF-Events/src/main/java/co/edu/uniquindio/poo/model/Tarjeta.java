package co.edu.uniquindio.poo.model;

import javax.swing.*;
import java.time.LocalDate;

public class Tarjeta implements IMetodoPago {
   private String titular;
   private int numeroTarjeta;
   private LocalDate fechaVencimiento;
   private int CVC;

    /**
     * Metodo Constructor para la clase Tarjeta
      * @param titular de la tarjeta
     * @param numeroTarjeta
     * @param fechaVencimiento de la tarjeta
     * @param CVC de la tarjeta
     */
   public Tarjeta(String titular, int numeroTarjeta, LocalDate fechaVencimiento, int CVC) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.CVC = CVC;
    }

    /**
     * Obtener titular de la Tarjeta
     * @return titular actual de la tarjeta
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Actualizar titular de la tarjeta
     * @param titular nuevo de la tarjeta
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Obtener Numero de la Tarjeta
     * @return numero actual de la tarjeta
     */
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Actualizar Numero de la tarjeta
     * @param numeroTarjeta nuevo
     */
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Obtener Fecha Vencimiento de la tarjeta
     * @return fecha de vencimiento actual de la tarjeta
     */
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Actualizar Fecha Vencimiento de la Tarjeta
     * @param fechaVencimiento nueva de la tarjeta
     */
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtener CVC de la Tarjeta
     * @return CVC actual de la Tarjeta
     */
    public int getCVC() {
        return CVC;
    }

    /**
     * Actualizar CVC de la Tarjeta
     * @param CVC nuevo de la Tarjeta
     */
    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    /**
     * Metodo para simular pago con tarjeta
     * @param monto a pagar
     * @return pago exitoso en el 80% de los casos
     */
    @Override
    public boolean pagar(int monto) {
        if(monto<0){
            JOptionPane.showMessageDialog(null, "El monto no puede ser negativo");
            return false;
        }
        boolean pagoExitoso= Math.random()<0.8;
        if(pagoExitoso==true){
            JOptionPane.showMessageDialog(null, "Pago con Tarjeta Exitoso");
        } else{
            JOptionPane.showMessageDialog(null, "Pago con Tarjeta Rechazado");
        }
        return pagoExitoso;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.ecommerce;

/**
 *
 * @author delar
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    
    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de " + titular + ": $" + monto);
        // Simulacion de procesamiento
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento para tarjeta de credito
        double descuento = monto * 0.05;
        System.out.println("Descuento aplicado: $" + descuento);
        return monto - descuento;
    }
    
    // Getters
    public String getNumeroTarjeta() { return numeroTarjeta; }
    public String getTitular() { return titular; }
}
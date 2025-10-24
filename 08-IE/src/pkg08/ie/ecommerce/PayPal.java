/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.ecommerce;

/**
 *
 * @author delar
 */
public class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal (" + email + "): $" + monto);
        // Simulacion de procesamiento
        return true;
    }
    
    // Getter
    public String getEmail() { return email; }
}
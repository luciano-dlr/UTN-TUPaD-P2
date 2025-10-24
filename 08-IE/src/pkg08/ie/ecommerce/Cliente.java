/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.ecommerce;

/**
 *
 * @author delar
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("Cliente " + nombre + " notificado: " + mensaje + " (Email: " + email + ")");
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
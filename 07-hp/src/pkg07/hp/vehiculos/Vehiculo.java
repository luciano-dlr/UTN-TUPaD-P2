/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.vehiculos;

/**
 *
 * @author delar
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo() {
        System.out.println("Vehiculo: " + marca + " " + modelo);
    }
    
    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}
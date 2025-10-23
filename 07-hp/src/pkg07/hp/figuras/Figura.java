/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.figuras;

/**
 *
 * @author delar
 */
public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarArea() {
        System.out.println(nombre + " - Area: " + calcularArea());
    }
    
    public String getNombre() { return nombre; }
}
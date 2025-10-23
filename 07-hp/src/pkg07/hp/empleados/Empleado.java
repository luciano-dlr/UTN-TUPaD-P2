/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.empleados;

/**
 *
 * @author delar
 */
public abstract class Empleado {
    protected String nombre;
    protected String id;
    
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSueldo();
    
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | ID: " + id + 
                         " | Sueldo: $" + calcularSueldo());
    }
    
    public String getNombre() { return nombre; }
    public String getId() { return id; }
}
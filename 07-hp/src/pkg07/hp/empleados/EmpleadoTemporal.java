/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.empleados;

/**
 *
 * @author delar
 */
public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
    
    public double getTarifaPorHora() { return tarifaPorHora; }
    public int getHorasTrabajadas() { return horasTrabajadas; }
}
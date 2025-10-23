/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.empleados;

/**
 *
 * @author delar
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int anosAntiguedad;
    
    public EmpleadoPlanta(String nombre, String id, double sueldoBase, int anosAntiguedad) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.anosAntiguedad = anosAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase + (anosAntiguedad * 1000);
    }
    
    public double getSueldoBase() { return sueldoBase; }
    public int getAnosAntiguedad() { return anosAntiguedad; }
}
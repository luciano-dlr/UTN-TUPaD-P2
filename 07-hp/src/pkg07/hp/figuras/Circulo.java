/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.figuras;

/**
 *
 * @author delar
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    public double getRadio() { return radio; }
}
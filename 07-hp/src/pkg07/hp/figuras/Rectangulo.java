/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.figuras;

/**
 *
 * @author delar
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    public double getBase() { return base; }
    public double getAltura() { return altura; }
}
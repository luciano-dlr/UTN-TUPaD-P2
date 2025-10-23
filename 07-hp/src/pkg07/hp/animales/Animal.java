/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.hp.animales;

/**
 *
 * @author delar
 */
public class Animal {
    protected String nombre;
    protected String tipo;
    
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido generico");
    }
    
    public void describirAnimal() {
        System.out.println("Animal: " + nombre + " | Tipo: " + tipo);
    }
    
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}
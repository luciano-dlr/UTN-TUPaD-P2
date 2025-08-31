/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introduccion.poo;

/**
 *
 * @author delar
 */
class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println(idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + ": " + edad + " anios, " + huevosPuestos + " huevos puestos");
    }
}

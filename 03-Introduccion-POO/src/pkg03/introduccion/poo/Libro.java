/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introduccion.poo;

/**
 *
 * @author delar
 */
class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usar setter para validación
    }
    
    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }
    
    // Setter con validación
    public void setAñoPublicacion(int año) {
        if (año >= 1455) { // Aproximadamente cuando se inventó la imprenta
            this.añoPublicacion = año;
            System.out.println("Año de publicación actualizado a: " + año);
        } else {
            System.out.println("Error: El año debe ser 1455 o mayor. No se realizaron cambios.");
        }
    }
}
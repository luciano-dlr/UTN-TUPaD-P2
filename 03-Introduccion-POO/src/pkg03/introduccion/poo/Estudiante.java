/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introduccion.poo;

/**
 *
 * @author delar
 */
class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
        System.out.println("Calificación disminuida en " + puntos + " puntos.");
    }
}

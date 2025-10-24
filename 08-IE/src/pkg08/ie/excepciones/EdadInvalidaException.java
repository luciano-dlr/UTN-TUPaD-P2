/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.excepciones;

/**
 *
 * @author delar
 */
public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    
    public EdadInvalidaException(int edad) {
        super("La edad " + edad + " no es valida. Debe estar entre 0 y 120 anios.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.excepciones;

/**
 *
 * @author delar
 */
public class ValidacionEdad {
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad);
        }
        System.out.println("Edad valida: " + edad + " anios");
    }
    
    public static void demostrarValidacion() {
        System.out.println("\n=== VALIDACION DE EDAD ===");
        
        int[] edades = {25, -5, 150, 30, 200, 18};
        
        for (int edad : edades) {
            try {
                validarEdad(edad);
            } catch (EdadInvalidaException e) {
                System.out.println("Excepcion capturada: " + e.getMessage());
            }
        }
    }
}
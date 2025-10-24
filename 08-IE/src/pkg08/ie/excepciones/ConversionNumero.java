/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.excepciones;

/**
 *
 * @author delar
 */
public class ConversionNumero {
    
    public static int convertirAEntero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error de conversion: '" + texto + "' no es un numero valido");
            return 0; // Valor por defecto
        }
    }
    
    public static void demostrarConversion() {
        System.out.println("\n=== CONVERSION DE CADENA A NUMERO ===");
        
        String[] textos = {"123", "45.67", "abc", "789", "12x3"};
        
        for (String texto : textos) {
            int numero = convertirAEntero(texto);
            System.out.println("Texto: '" + texto + "' -> Numero: " + numero);
        }
    }
}
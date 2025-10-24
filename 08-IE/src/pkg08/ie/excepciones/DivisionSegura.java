/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.excepciones;

/**
 *
 * @author delar
 */
public class DivisionSegura {
    
    public static double dividir(double dividendo, double divisor) {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico: " + e.getMessage());
            return Double.NaN; // Retorna Not a Number
        }
    }
    
    public static void demostrarDivision() {
        System.out.println("=== DIVISION SEGURA ===");
        
        // Caso normal
        double resultado1 = dividir(10, 2);
        System.out.println("10 / 2 = " + resultado1);
        
        // Caso con error
        double resultado2 = dividir(10, 0);
        System.out.println("10 / 0 = " + resultado2);
        
        // Otro caso normal
        double resultado3 = dividir(15, 3);
        System.out.println("15 / 3 = " + resultado3);
    }
}
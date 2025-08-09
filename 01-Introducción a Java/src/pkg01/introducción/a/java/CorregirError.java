/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01.introducción.a.java;

import java.util.Scanner;

/**
 *
 * @author delar
 */
public class CorregirError {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Corregido: antes estaba nextInt()
        System.out.println("Hola, " + nombre);
        
        /*
        ERROR: Usar nextInt() para leer un String provoca un error de tipo.
        SOLUCIÓN: Cambiar a nextLine() para leer texto completo.
        */
    }
}

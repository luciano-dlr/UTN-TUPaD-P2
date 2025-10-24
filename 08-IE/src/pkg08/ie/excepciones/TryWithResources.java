/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.excepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author delar
 */
public class TryWithResources {
    
    public static void leerConTryWithResources(String nombreArchivo) {
        System.out.println("\nIntentando leer archivo: " + nombreArchivo);
        
        // Try-with-resources: cierra automáticamente los recursos
        try (FileReader reader = new FileReader(nombreArchivo);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally ejecutado para: " + nombreArchivo);
        }
    }
    
    public static void demostrarTryWithResources() {
        System.out.println("\n=== TRY-WITH-RESOURCES ===");
        
        // Crear un archivo de prueba primero
        crearArchivoPrueba();
        
        // Leer con try-with-resources
        leerConTryWithResources("archivo_prueba.txt");
        
        // Intentar leer archivo inexistente
        leerConTryWithResources("archivo_inexistente.txt");
    }
    
    private static void crearArchivoPrueba() {
        try (java.io.FileWriter writer = new java.io.FileWriter("archivo_prueba.txt")) {
            writer.write("Linea 1: Este es un archivo de prueba\n");
            writer.write("Linea 2: Creado para demostrar try-with-resources\n");
            writer.write("Linea 3: Los recursos se cierran automaticamente\n");
        } catch (IOException e) {
            System.out.println("Error al crear archivo de prueba: " + e.getMessage());
        }
    }
}
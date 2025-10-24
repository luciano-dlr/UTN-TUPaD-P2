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
public class LecturaArchivo {
    
    public static void leerArchivo(String nombreArchivo) {
        try {
            FileReader reader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String linea;
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            
            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public static void demostrarLectura() {
        System.out.println("\n=== LECTURA DE ARCHIVO ===");
        
        // Intentar leer un archivo que existe
        leerArchivo("archivo_existente.txt");
        
        // Intentar leer un archivo que no existe
        leerArchivo("archivo_inexistente.txt");
    }
}
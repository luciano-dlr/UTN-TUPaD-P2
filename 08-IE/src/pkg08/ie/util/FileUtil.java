/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.util;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author delar
 */
public class FileUtil {
    
    public static void crearArchivo(String nombreArchivo, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            System.out.println("Archivo '" + nombreArchivo + "' creado exitosamente");
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }
}
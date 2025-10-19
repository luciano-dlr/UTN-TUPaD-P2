/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg06.colecciones.sistema_stock;

/**
 *
 * @author delar
 */
public enum CategoriasProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");
    
    private final String description;
    
    CategoriasProducto(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
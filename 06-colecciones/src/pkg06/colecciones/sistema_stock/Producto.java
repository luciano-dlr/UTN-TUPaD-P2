/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg06.colecciones.sistema_stock;

/**
 *
 * @author delar
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriasProducto categoria;
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriasProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + 
                         " | Nombre: " + nombre + 
                         " | Precio: $" + precio + 
                         " | Stock: " + cantidad + 
                         " | Categoria: " + categoria.getDescription());
    }
    
    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    
    public CategoriasProducto getCategoria() { return categoria; }
    public void setCategoria(CategoriasProducto categoria) { this.categoria = categoria; }
    
    @Override
    public String toString() {
        return "Producto{id='" + id + "', nombre='" + nombre + "', precio=" + precio + 
               ", cantidad=" + cantidad + ", categoria=" + categoria.getDescription() + "}";
    }
}
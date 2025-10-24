/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.ie.ecommerce;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author delar
 */
public class Pedido implements Pagable, Notificable {
    private List<Producto> productos;
    private String estado;
    private Notificable notificable;
    
    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }
    
    public void setNotificable(Notificable notificable) {
        this.notificable = notificable;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        notificar("Producto agregado: " + producto.getNombre());
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar("Estado del pedido cambiado a: " + nuevoEstado);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    @Override
    public void notificar(String mensaje) {
        if (notificable != null) {
            notificable.notificar(mensaje);
        }
        System.out.println("Notificacion: " + mensaje);
    }
    
    // Getters
    public List<Producto> getProductos() { return productos; }
    public String getEstado() { return estado; }
    
    @Override
    public String toString() {
        return "Pedido - Estado: " + estado + " - Total: $" + calcularTotal() + " - Productos: " + productos.size();
    }
}
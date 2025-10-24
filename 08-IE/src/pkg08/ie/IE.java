/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.ie;
import pkg08.ie.ecommerce.*;
import pkg08.ie.excepciones.*;
import pkg08.ie.util.FileUtil;
/**
 *
 * @author delar
 */
public class IE {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("=== TRABAJO PRACTICO 8: INTERFACES Y EXCEPCIONES ===\n");
        
        // ======================
        // PARTE 1: SISTEMA E-COMMERCE
        // ======================
        System.out.println("*** PARTE 1: SISTEMA E-COMMERCE ***\n");
        
        // Crear productos
        Producto producto1 = new Producto("Laptop", 150000);
        Producto producto2 = new Producto("Mouse", 15000);
        Producto producto3 = new Producto("Teclado", 25000);
        
        // Crear cliente
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");
        
        // Crear pedido y asociar cliente para notificaciones
        Pedido pedido = new Pedido();
        pedido.setNotificable(cliente);
        
        // Agregar productos al pedido
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        // Cambiar estado del pedido
        pedido.cambiarEstado("PROCESADO");
        
        // Mostrar información del pedido
        System.out.println("\n" + pedido);
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        // Procesar pagos con diferentes metodos
        System.out.println("\n--- PROCESAMIENTO DE PAGOS ---");
        
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Perez");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);
        
        PayPal paypal = new PayPal("juan@email.com");
        paypal.procesarPago(pedido.calcularTotal());
        
        // ======================
        // PARTE 2: MANEJO DE EXCEPCIONES
        // ======================
        System.out.println("\n\n*** PARTE 2: MANEJO DE EXCEPCIONES ***");
        
        // 1. Division segura
        DivisionSegura.demostrarDivision();
        
        // 2. Conversion de cadena a numero
        ConversionNumero.demostrarConversion();
        
        // 3. Lectura de archivo
        // Primero creamos un archivo de prueba
        FileUtil.crearArchivo("archivo_existente.txt", 
            "Este es un archivo de prueba\nLinea 2 del archivo\nLinea 3 del archivo");
        
        LecturaArchivo.demostrarLectura();
        
        // 4. Validacion de edad con excepcion personalizada
        ValidacionEdad.demostrarValidacion();
        
        // 5. Try-with-resources
        TryWithResources.demostrarTryWithResources();
        
        System.out.println("\n=== PROGRAMA FINALIZADO ===");
    }
    
}

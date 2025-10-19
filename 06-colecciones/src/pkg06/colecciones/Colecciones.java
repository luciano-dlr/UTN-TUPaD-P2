/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.colecciones;

/**
 *
 * @author delar
 */

import pkg06.colecciones.biblioteca.*;
import pkg06.colecciones.sistema_stock.*;


public class Colecciones {

    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRACTICO 6: COLECCIONES ===");
        
        // ======================
        // SISTEMA DE STOCK
        // ======================
        System.out.println("\n*** SISTEMA DE STOCK ***");
        
        Inventario inventario = new Inventario();
        
        // 1. Crear productos
        Producto p1 = new Producto("P001", "Arroz", 800, 50, CategoriasProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 25000, 10, CategoriasProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa", 2500, 30, CategoriasProducto.ROPA);
        Producto p4 = new Producto("P004", "Sillon", 15000, 5, CategoriasProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 600, 100, CategoriasProducto.ALIMENTOS);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar todos los productos
        System.out.println("\n--- Tarea 2: Listar productos ---");
        inventario.listarProductos();
        
        // 3. Buscar producto por ID
        System.out.println("\n--- Tarea 3: Buscar producto por ID ---");
        Producto productoBuscado = inventario.buscarProductoPorId("P003");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        // 4. Filtrar por categoria
        System.out.println("\n--- Tarea 4: Filtrar por categoria (ALIMENTOS) ---");
        var productosAlimentos = inventario.filtrarPorCategoria(CategoriasProducto.ALIMENTOS);
        for (Producto p : productosAlimentos) {
            p.mostrarInfo();
        }
        
        // 5. Eliminar producto y listar restantes
        System.out.println("\n--- Tarea 5: Eliminar producto P002 ---");
        inventario.eliminarProducto("P002");
        System.out.println("Productos restantes:");
        inventario.listarProductos();
        
        // 6. Actualizar stock
        System.out.println("\n--- Tarea 6: Actualizar stock de P001 ---");
        inventario.actualizarStock("P001", 75);
        
        // 7. Mostrar total de stock
        System.out.println("\n--- Tarea 7: Total de stock ---");
        System.out.println("Total de stock: " + inventario.obtenerTotalStock());
        
        // 8. Producto con mayor stock
        System.out.println("\n--- Tarea 8: Producto con mayor stock ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar productos por precio
        System.out.println("\n--- Tarea 9: Productos entre $1000 y $3000 ---");
        var productosFiltrados = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
        }
        
        // 10. Mostrar categorias disponibles
        System.out.println("\n--- Tarea 10: categorias disponibles ---");
        inventario.mostrarCategoriasDisponibles();
        
        // ======================
        // SISTEMA DE BIBLIOTECA
        // ======================
        System.out.println("\n\n*** SISTEMA DE BIBLIOTECA ***");
        
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear autores
        Autor autor1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien anios de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN003", "La casa de los espiritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN004", "Cronica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("ISBN005", "Ficciones", 1944, autor2);
        
        // 4. Listar todos los libros
        System.out.println("\n--- Tarea 4: Listar libros ---");
        biblioteca.listarLibros();
        
        // 5. Buscar libro por ISBN
        System.out.println("\n--- Tarea 5: Buscar libro por ISBN ---");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        
        // 6. Filtrar libros por anio
        System.out.println("\n--- Tarea 6: Filtrar libros del anio 1949 ---");
        var libros1949 = biblioteca.filtrarLibrosPorAnio(1949);
        for (Libro libro : libros1949) {
            libro.mostrarInfo();
        }
        
        // 7. Eliminar libro y listar restantes
        System.out.println("\n--- Tarea 7: Eliminar libro ISBN001 ---");
        biblioteca.eliminarLibro("ISBN001");
        System.out.println("Libros restantes:");
        biblioteca.listarLibros();
        
        // 8. Mostrar cantidad total de libros
        System.out.println("\n--- Tarea 8: Cantidad total de libros ---");
        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Listar autores disponibles
        System.out.println("\n--- Tarea 9: Autores disponibles ---");
        biblioteca.mostrarAutoresDisponibles();
        
        System.out.println("\n=== PROGRAMA FINALIZADO ===");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.introduccion.poo;

import java.util.Scanner;

/**
 *
 * @author delar
 */
public class IntroduccionPOO {
    
  private static final Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
     
    // Variables para almacenar objetos creados
    private static Estudiante estudiante;
    private static Mascota mascota;
    private static Libro libro;
    private static Gallina gallina1, gallina2;
    private static NaveEspacial nave;

    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL - PROGRAMACION ORIENTADA A OBJETOS ===");
            System.out.println("1. Registro de Estudiantes");
            System.out.println("2. Registro de Mascotas");
            System.out.println("3. Encapsulamiento con la Clase Libro");
            System.out.println("4. Gestion de Gallinas en Granja Digital");
            System.out.println("5. Simulacion de Nave Espacial");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void ejercicio1() {
        System.out.println("\n=== REGISTRO DE ESTUDIANTES ===");
        
        if (estudiante == null) {
            System.out.print("Ingrese nombre del estudiante: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese apellido del estudiante: ");
            String apellido = scanner.nextLine();
            
            System.out.print("Ingrese curso del estudiante: ");
            String curso = scanner.nextLine();
            
            System.out.print("Ingrese calificacion inicial: ");
            double calificacion = scanner.nextDouble();
            
            estudiante = new Estudiante(nombre, apellido, curso, calificacion);
        }
        
        estudiante.mostrarInfo();
        
        System.out.print("\n¿Cuantos puntos desea aumentar? ");
        double puntosSubir = scanner.nextDouble();
        estudiante.subirCalificacion(puntosSubir);
        
        System.out.print("¿Cuantos puntos desea disminuir? ");
        double puntosBajar = scanner.nextDouble();
        estudiante.bajarCalificacion(puntosBajar);
        
        System.out.println("\nInformacion final:");
        estudiante.mostrarInfo();
    }
    
    private static void ejercicio2() {
        System.out.println("\n=== REGISTRO DE MASCOTAS ===");
        
        if (mascota == null) {
            System.out.print("Ingrese nombre de la mascota: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese especie de la mascota: ");
            String especie = scanner.nextLine();
            
            System.out.print("Ingrese edad de la mascota: ");
            int edad = scanner.nextInt();
            
            mascota = new Mascota(nombre, especie, edad);
        }
        
        System.out.println("\nInformacion inicial:");
        mascota.mostrarInfo();
        
        System.out.print("\n¿Cuantos años han pasado? ");
        int años = scanner.nextInt();
        
        for (int i = 0; i < años; i++) {
            mascota.cumplirAnios();
        }
        
        System.out.println("\nInformacion despues del paso del tiempo:");
        mascota.mostrarInfo();
    }
    
    private static void ejercicio3() {
        System.out.println("\n=== ENCAPSULAMIENTO CON LA CLASE LIBRO ===");
        
        if (libro == null) {
            System.out.print("Ingrese titulo del libro: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Ingrese autor del libro: ");
            String autor = scanner.nextLine();
            
            System.out.print("Ingrese anio de publicacion: ");
            int año = scanner.nextInt();
            
            libro = new Libro(titulo, autor, año);
        }
        
        System.out.println("\nInformacion inicial del libro:");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Anio: " + libro.getAñoPublicacion());
        
        // Intentar modificar con año inválido
        System.out.print("\nIngrese un año invalido (menor que 1455): ");
        int añoInvalido = scanner.nextInt();
        libro.setAñoPublicacion(añoInvalido);
        
        // Modificar con año válido
        System.out.print("Ingrese un anio valido (1455 o mayor): ");
        int añoValido = scanner.nextInt();
        libro.setAñoPublicacion(añoValido);
        
        System.out.println("\nInformacion final del libro:");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Anio: " + libro.getAñoPublicacion());
    }

    private static void ejercicio4() {
        System.out.println("\n=== GESTION DE GALLINAS EN GRANJA DIGITAL ===");
        
        if (gallina1 == null) {
            gallina1 = new Gallina("G001", 1, 0);
            gallina2 = new Gallina("G002", 2, 5);
        }
        
        System.out.println("Estado inicial:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.print("\nCuantos dias simular? ");
        int dias = scanner.nextInt();
        
        for (int i = 0; i < dias; i++) {
            gallina1.envejecer();
            gallina2.envejecer();
            
            if (Math.random() > 0.3) gallina1.ponerHuevo();
            if (Math.random() > 0.4) gallina2.ponerHuevo();
        }
        
        System.out.println("\nEstado despues de " + dias + " dias:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    
    private static void ejercicio5() {
        System.out.println("\n=== SIMULACION DE NAVE ESPACIAL ===");
        
        if (nave == null) {
            System.out.print("Ingrese nombre de la nave: ");
            String nombre = scanner.nextLine();
            nave = new NaveEspacial(nombre, 50);
        }
        
        System.out.println("\nEstado inicial:");
        nave.mostrarEstado();
        
        // Intentar avanzar sin recargar
        System.out.print("\nIngrese distancia a avanzar (sin recargar): ");
        int distancia1 = scanner.nextInt();
        nave.avanzar(distancia1);
        
        // Recargar combustible
        System.out.print("\nIngrese cantidad de combustible a recargar: ");
        int combustible = scanner.nextInt();
        nave.recargarCombustible(combustible);
        
        // Avanzar después de recargar
        System.out.print("Ingrese distancia a avanzar (despues de recargar): ");
        int distancia2 = scanner.nextInt();
        nave.avanzar(distancia2);
        
        System.out.println("\nEstado final:");
        nave.mostrarEstado();
    }
}




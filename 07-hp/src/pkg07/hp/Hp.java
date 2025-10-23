/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.hp;

import pkg07.hp.vehiculos.*;
import pkg07.hp.figuras.*;
import pkg07.hp.empleados.*;
import pkg07.hp.animales.*;

/**
 *
 * @author delar
 */
public class Hp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("=== TRABAJO PRACTICO 7: HERENCIA Y POLIMORFISMO ===\n");
        
        // ======================
        // KATA 1: VEHICULOS
        // ======================
        System.out.println("*** KATA 1: VEHICULOS Y HERENCIA BASICA ***");
        
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();
        
        // Upcasting
        Vehiculo vehiculo = auto;
        System.out.print("Upcasting - ");
        vehiculo.mostrarInfo();
        
        // Downcasting
        if (vehiculo instanceof Auto) {
            Auto autoDowncast = (Auto) vehiculo;
            System.out.print("Downcasting - ");
            autoDowncast.mostrarInfo();
        }
        
        // ======================
        // KATA 2: FIGURAS GEOMETRICAS
        // ======================
        System.out.println("\n*** KATA 2: FIGURAS GEOMETRICAS Y METODOS ABSTRACTOS ***");
        
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        figuras[2] = new Circulo(3.0);
        
        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
        
        // ======================
        // KATA 3: EMPLEADOS
        // ======================
        System.out.println("\n*** KATA 3: EMPLEADOS Y POLIMORFISMO ***");
        
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new EmpleadoPlanta("Juan Perez", "EP001", 50000, 5);
        empleados[1] = new EmpleadoTemporal("Maria Garcia", "ET001", 1500, 40);
        empleados[2] = new EmpleadoPlanta("Carlos Lopez", "EP002", 45000, 2);
        empleados[3] = new EmpleadoTemporal("Ana Martinez", "ET002", 1200, 35);
        
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            
            // Uso de instanceof para clasificar
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
            }
        }
        
        System.out.println("\nResumen:");
        System.out.println("Empleados de planta: " + contadorPlanta);
        System.out.println("Empleados temporales: " + contadorTemporal);
        
        // ======================
        // KATA 4: ANIMALES
        // ======================
        System.out.println("\n*** KATA 4: ANIMALES Y COMPORTAMIENTO SOBRESCRITO ***");
        
        Animal[] animales = new Animal[4];
        animales[0] = new Perro("Firulais");
        animales[1] = new Gato("Mishi");
        animales[2] = new Vaca("Lola");
        animales[3] = new Perro("Rex");
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("---");
        }
        
        // Demostración de polimorfismo puro
        System.out.println("=== DEMOSTRACION DE POLIMORFISMO ===");
        for (Animal animal : animales) {
            animal.hacerSonido(); // Llamada polimorfica
        }
        
        System.out.println("\n=== PROGRAMA FINALIZADO ===");
    }
    
}

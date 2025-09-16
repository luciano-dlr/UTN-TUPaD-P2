/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.poo;
import java.util.Scanner;
/**
 *
 * @author delar
 */
public class POO {

    private static final Scanner scanner = new Scanner(System.in);
    private static Empleado[] empleados = new Empleado[10];
    private static int contadorEmpleados = 0;
    
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("\n=== SISTEMA DE GESTION DE EMPLEADOS ===");
            System.out.println("1. Crear empleado (constructor completo)");
            System.out.println("2. Crear empleado (constructor básico)");
            System.out.println("3. Mostrar todos los empleados");
            System.out.println("4. Actualizar salario (porcentaje)");
            System.out.println("5. Actualizar salario (monto fijo)");
            System.out.println("6. Mostrar total de empleados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1 -> crearEmpleadoCompleto();
                case 2 -> crearEmpleadoBasico();
                case 3 -> mostrarEmpleados();
                case 4 -> actualizarSalarioPorcentaje();
                case 5 -> actualizarSalarioFijo();
                case 6 -> mostrarTotalEmpleados();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("opcion no válida. Intente nuevamente.");
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void crearEmpleadoCompleto() {
        if (contadorEmpleados >= empleados.length) {
            System.out.println("No se pueden crear mas empleados. Límite alcanzado.");
            return;
        }
        
        System.out.println("\n--- Crear Empleado (Constructor Completo) ---");
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese puesto: ");
        String puesto = scanner.nextLine();
        
        System.out.print("Ingrese salario: ");
        double salario = scanner.nextDouble();
        
        empleados[contadorEmpleados] = new Empleado(id, nombre, puesto, salario);
        contadorEmpleados++;
        
        System.out.println("Empleado creado exitosamente!");
    }
    
    private static void crearEmpleadoBasico() {
        if (contadorEmpleados >= empleados.length) {
            System.out.println("No se pueden crear mas empleados. Límite alcanzado.");
            return;
        }
        
        System.out.println("\n--- Crear Empleado (Constructor Basico) ---");
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese puesto: ");
        String puesto = scanner.nextLine();
        
        empleados[contadorEmpleados] = new Empleado(nombre, puesto);
        contadorEmpleados++;
        
        System.out.println("Empleado creado exitosamente con salario por defecto!");
    }
    
    private static void mostrarEmpleados() {
        System.out.println("\n--- LISTA DE EMPLEADOS ---");
        if (contadorEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        for (int i = 0; i < contadorEmpleados; i++) {
            System.out.println(empleados[i].toString());
        }
    }
    
    private static void actualizarSalarioPorcentaje() {
        if (contadorEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        System.out.println("\n--- Actualizar Salario (Porcentaje) ---");
        mostrarEmpleados();
        
        System.out.print("Seleccione el numero de empleado: ");
        int index = scanner.nextInt() - 1;
        
        if (index < 0 || index >= contadorEmpleados) {
            System.out.println("Empleado no valido.");
            return;
        }
        
        System.out.print("Ingrese porcentaje de aumento: ");
        double porcentaje = scanner.nextDouble();
        
        empleados[index].actualizarSalario(porcentaje);
        System.out.println("Salario actualizado exitosamente!");
        System.out.println("Nuevo salario: " + String.format("$%.2f", empleados[index].getSalario()));
    }
    
    private static void actualizarSalarioFijo() {
        if (contadorEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        System.out.println("\n--- Actualizar Salario (Monto Fijo) ---");
        mostrarEmpleados();
        
        System.out.print("Seleccione el número de empleado: ");
        int index = scanner.nextInt() - 1;
        
        if (index < 0 || index >= contadorEmpleados) {
            System.out.println("Empleado no valido.");
            return;
        }
        
        System.out.print("Ingrese monto de aumento: ");
        int monto = scanner.nextInt();
        
        empleados[index].actualizarSalario(monto);
        System.out.println("Salario actualizado exitosamente!");
        System.out.println("Nuevo salario: " + String.format("$%.2f", empleados[index].getSalario()));
    }
    
    private static void mostrarTotalEmpleados() {
        System.out.println("\n--- TOTAL DE EMPLEADOS ---");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
    
}

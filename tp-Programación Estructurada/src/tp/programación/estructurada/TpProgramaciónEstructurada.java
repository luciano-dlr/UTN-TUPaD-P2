/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.programación.estructurada;

/**
 *
 * @author delar
 */
import java.util.Scanner;

public class TpProgramaciónEstructurada {
    
    // Variable global para el ejercicio 11
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    // Scanner global para toda la clase
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Verificacion de Anio Bisiesto");
            System.out.println("2. Determinar el Mayor de Tres Numeros");
            System.out.println("3. Clasificación de Edad");
            System.out.println("4. Calculadora de Descuento según categoria");
            System.out.println("5. Suma de Números Pares (while)");
            System.out.println("6. Contador de Positivos, Negativos y Ceros (for)");
            System.out.println("7. Validación de Nota entre 0 y 10 (do-while)");
            System.out.println("8. Calculo del Precio Final con impuesto y descuento");
            System.out.println("9. Calculo de costo de envio y total de compra");
            System.out.println("10. Actualizacion de stock");
            System.out.println("11. Calculo de descuento especial");
            System.out.println("12. Modificacion de array de precios");
            System.out.println("13. Impresion recursiva de arrays");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    // Ejercicio 1: Verificación de Anio Bisiesto
    private static void ejercicio1() {
        System.out.println("\n=== VERIFICACIÓN DE AniO BISIESTO ===");
        System.out.print("Ingrese un anio: ");
        int anio = scanner.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
    }
    
    // Ejercicio 2: Determinar el Mayor de Tres Números
    private static void ejercicio2() {
        System.out.println("\n=== MAYOR DE TRES NUMEROS ===");
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        
        System.out.println("El mayor es: " + mayor);
    }
    
    // Ejercicio 3: Clasificación de Edad
    private static void ejercicio3() {
        System.out.println("\n=== CLASIFICACION DE EDAD ===");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        String clasificacion;
        if (edad < 12) {
            clasificacion = "Ninio";
        } else if (edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad <= 59) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }
        
        System.out.println("Eres un " + clasificacion + ".");
    }
    
    // Ejercicio 4: Calculadora de Descuento según categoria
    private static void ejercicio4() {
        System.out.println("\n=== CALCULADORA DE DESCUENTO ===");
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();
        
        double descuento = 0;
        switch (categoria) {
            case "A" -> descuento = 0.10;
            case "B" -> descuento = 0.15;
            case "C" -> descuento = 0.20;
            default -> System.out.println("Categoria no válida.");
        }
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
    // Ejercicio 5: Suma de Números Pares (while)
    private static void ejercicio5() {
        System.out.println("\n=== SUMA DE NÚMEROS PARES ===");
        int numero;
        int sumaPares = 0;
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
            
        } while (numero != 0);
        
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
    
    // Ejercicio 6: Contador de Positivos, Negativos y Ceros (for)
    private static void ejercicio6() {
        System.out.println("\n=== CONTADOR DE NÚMEROS ===");
        int positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
    // Ejercicio 7: Validación de Nota entre 0 y 10 (do-while)
    private static void ejercicio7() {
        System.out.println("\n=== VALIDACIÓN DE NOTA ===");
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
    
    // Ejercicio 8: Cálculo del Precio Final con impuesto y descuento
    private static void ejercicio8() {
        System.out.println("\n=== CÁLCULO DE PRECIO FINAL ===");
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorcentaje = scanner.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = scanner.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuestoPorcentaje, descuentoPorcentaje);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
    private static double calcularPrecioFinal(double precioBase, double impuestoPorcentaje, double descuentoPorcentaje) {
        double impuesto = precioBase * (impuestoPorcentaje / 100);
        double descuento = precioBase * (descuentoPorcentaje / 100);
        return precioBase + impuesto - descuento;
    }
    
    // Ejercicio 9: Cálculo de costo de envio y total de compra
    private static void ejercicio9() {
        System.out.println("\n=== CÁLCULO DE COSTO DE ENViO ===");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    
    private static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona no válida. Se aplicará tarifa Nacional.");
            return peso * 5;
        }
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    // Ejercicio 10: Actualización de stock
    private static void ejercicio10() {
        System.out.println("\n=== ACTUALIZACIÓN DE STOCK ===");
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    // Ejercicio 11: Cálculo de descuento especial
    private static void ejercicio11() {
        System.out.println("\n=== DESCUENTO ESPECIAL ===");
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
    private static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    // Ejercicio 12: Modificación de array de precios
    private static void ejercicio12() {
        System.out.println("\n=== MODIFICACIÓN DE ARRAY DE PRECIOS ===");
        
        // a. Declarar e inicializar array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // c. Modificar precio especifico (tercer producto)
        precios[2] = 129.99;
        
        // d. Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    
    // Ejercicio 13: Impresión recursiva de arrays
    private static void ejercicio13() {
        System.out.println("\n=== IMPRESIÓN RECURSIVA DE ARRAYS ===");
        
        // a. Declarar e inicializar array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales recursivamente
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);
        
        // c. Modificar precio especifico
        precios[2] = 129.99;
        
        // d. Mostrar valores modificados recursivamente
        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
    private static void imprimirRecursivo(double[] array, int indice) {
        // Caso base: cuando llegamos al final del array
        if (indice >= array.length) {
            return;
        }
        
        // Imprimir el elemento actual
        System.out.println("Precio: $" + array[indice]);
        
        // Llamada recursiva para el siguiente elemento
        imprimirRecursivo(array, indice + 1);
    }
}
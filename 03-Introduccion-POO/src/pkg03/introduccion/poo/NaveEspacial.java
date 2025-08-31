/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introduccion.poo;

/**
 *
 * @author delar
 */

class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int COMBUSTIBLE_POR_KM = 2;
    private final int LIMITE_COMBUSTIBLE = 100;
    
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para despegar");
        }
    }
    
    public void avanzar(int distancia) {
        int combustibleNecesario = distancia * COMBUSTIBLE_POR_KM;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible usado: " + 
                              combustibleNecesario + ", restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para avanzar " + distancia + " km");
            System.out.println("Combustible necesario: " + combustibleNecesario + ", disponible: " + combustible);
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Combustible recargado: " + cantidad + ". Total: " + combustible);
        } else {
            int recargaPosible = LIMITE_COMBUSTIBLE - combustible;
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println("Solo se pudieron recargar " + recargaPosible + 
                             " unidades. Combustible al maximo: " + combustible);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01.introducción.a.java;

import java.util.Scanner;

/**
 *
 * @author delar
 */
public class LeerNombreEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);
    }

}

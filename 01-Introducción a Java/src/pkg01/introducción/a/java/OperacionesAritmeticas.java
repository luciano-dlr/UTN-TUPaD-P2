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
public class OperacionesAritmeticas {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}

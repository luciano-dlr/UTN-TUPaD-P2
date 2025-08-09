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
public class DivisionEnterosYDouble {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = input.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = input.nextInt();

        // Division con enteros
        if (b != 0) {
            System.out.println("Division entera: " + (a / b));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        // División con double
        double resultadoDouble = (double) a / b;
        System.out.println("Division con double: " + resultadoDouble);
    }
}

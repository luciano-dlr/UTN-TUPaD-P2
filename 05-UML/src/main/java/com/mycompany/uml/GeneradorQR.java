/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author delar
 */
public class GeneradorQR {
      public CodigoQR generar(String valor, Usuario u) { // dependencia de creación
        return new CodigoQR(valor, u);
    }
}

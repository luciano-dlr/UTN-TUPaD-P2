/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author delar
 */
class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composición
    private Titular10 titular;    // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion); // composición
    }

    // Método CORREGIDO para establecer la relación bidireccional
    public void setTitular(Titular10 titular) {
        this.titular = titular;
        titular.setCuenta(this); // Establece la referencia bidireccional
    }
}
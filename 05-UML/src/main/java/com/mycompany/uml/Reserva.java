/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author delar
 */
class Reserva {
    private String fecha;
    private String hora;
    private Cliente6 cliente6; // asociación unidireccional
    private Mesa mesa;       // agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente6 = cliente6;
        this.mesa = mesa;
    }
}
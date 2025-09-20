/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

import com.mycompany.uml.Foto;

/**
 *
 * @author delar
 */
class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;     // composición
    private Titular titular; // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // composición
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this); // mantiene la bidireccionalidad
    }
}
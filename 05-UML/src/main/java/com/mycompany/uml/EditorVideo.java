/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author delar
 */
public class EditorVideo {
     public Render exportar(String formato, Proyecto p) { // dependencia de creación
        return new Render(formato, p);
    }
}

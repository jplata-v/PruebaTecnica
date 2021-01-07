/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joao.rest.modelos;

/**
 *
 * @author JOAO
 */
public class Cuadrado {
    private int Id;     
    private String Nombre;
    private Double lado;
    
     public Cuadrado() {
    }
     
     public Cuadrado(int Id, String Nombre, Double lado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.lado = lado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}

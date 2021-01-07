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
public class Circulo {
    
    private int Id;
    private String Nombre;
    private double diametro;
    private double radio;

    public Circulo() {
    }

    public Circulo(int Id, String Nombre, double diametro, double radio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.diametro = diametro;
        this.radio = radio;
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

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}

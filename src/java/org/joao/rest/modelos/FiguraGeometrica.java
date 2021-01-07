/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joao.rest.modelos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOAO
 */
@XmlRootElement
public class FiguraGeometrica {
    private int Id;
    private String Nombre;
    private double superficie;
    private double base;
    private double altura;
    private double diametro;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int Id, String Nombre, double superficie, double base, double altura, double diametro) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.superficie = superficie;
        this.base = base;
        this.altura = altura;
        this.diametro = diametro;
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

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
}

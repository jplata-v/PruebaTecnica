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
public class Triangulo {
    private int Id;
    private String Nombre;
    private double base;
    private double altura;
    private double lado;

    public Triangulo() {
    }

    public Triangulo(int Id, String Nombre, double base, double altura, double lado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.base = base;
        this.altura = altura;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Comparator;

/**
 *
 * @author kamil
 */

public class Empleado{
    public String nombre;
    public int legajo;
    public double sueldo;
    //easter egg
    public Empleado(String nombre, int legajo, double sueldo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static Comparator<Empleado> ordenar = new Comparator<Empleado>(){ 
        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }        
    };
}
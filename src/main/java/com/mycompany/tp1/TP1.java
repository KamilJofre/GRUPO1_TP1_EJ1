
package com.mycompany.tp1;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;


public class TP1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        
        int n;
        //easter egg
        ArrayList<Empleado> lista = new ArrayList<>();
        
        do{
            System.out.println("**********************");
            System.out.println("*1. Agregar empleado *");
            System.out.println("*2. Salir            *");
            System.out.println("**********************");
            n=leer.nextInt();
            
            switch(n){
                case 1:
                    System.out.print("Ingrese nombre:");
                    String nombre = leer.next();
                    
                    System.out.print("Ingrese legajo:");
                    int legajo= leer.nextInt();
                    
                    System.out.print("Ingrese sueldo:");
                    double sueldo = leer.nextDouble();
                    
                    lista.add(new Empleado(nombre,legajo,sueldo));
                    System.out.println("\n");
                    
                    nombre=null;
                    legajo=0;
                    sueldo=0;
                    break;
                    
                case 2:
                    n=2;
                    for(Empleado g: lista){
                        
                        System.out.println("Nombre: "+g.nombre+", legajo "+g.legajo+", su sueldo es: "+g.sueldo+"$");
                    }
                    break;
            }
            
            }while(n != 2);
                System.out.println("Chau");
                
        
        Iterator<Empleado> it = lista.iterator();
        boolean encontrado = false;
        
        System.out.println("Buscar legajo:");
        double buscarLegajo= leer.nextDouble();
        
        
            while (it.hasNext()) {
                Empleado e = it.next();
                if (e.getLegajo() == buscarLegajo) {
                    encontrado = true;
                    System.out.println("Encontrado: " + e.getNombre());
                    it.remove();
                    
                    
                    
                    System.out.println("Nueva lista");
                    for(Empleado g: lista){
                        System.out.println("Nombre: "+g.nombre+", legajo "+g.legajo+", su sueldo es: "+g.sueldo+"$");
                    } 
                    
                    break; // detenemos la búsqueda
                }
                
            }
            if (!encontrado) {
                System.out.println("No se encontró el elemento.");
            }
            
            
        System.out.println("\nLista ordenada.");
        lista.sort(Empleado.ordenar);
        for(Empleado g: lista){
                        System.out.println("Nombre: "+g.nombre+", legajo "+g.legajo+", su sueldo es: "+g.sueldo+"$");
                    } 
            
        
            
        leer.close();
    }      
}

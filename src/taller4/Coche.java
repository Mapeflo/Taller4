/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author marya
 */
public class Coche {
  
    private String marca; 
    private String modelo;
    private double velocidadMaxima;

public Coche() {
        
    this.marca = "Sin marca";
    this.modelo = "Sin modelo";
    this.velocidadMaxima = 0;
    }

public Coche(String marca, String modelo, double velocidadMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMaxima = velocidadMaxima;
    }

public void acelerar (double incremento) {
   if (incremento > 0) {
       velocidadMaxima += incremento;
       System.out.println("La velocidad maxima se incremento a: " + velocidadMaxima + "k/h");
    } 
   else {
       System.out.println("Incremento no positivo. No hay cambios en velocidad maxima: " + velocidadMaxima + "k/h");
       } 
     
    }
  }  
    


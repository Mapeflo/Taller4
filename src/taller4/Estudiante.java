package taller4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marya
 */
public final class Estudiante {
    
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante() {
        
      this.nombre = "Sin nombre";
      this.edad = 0;
      this.notaPromedio = 0;  
    }
    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    } 
    
    public String getNombre() {
        return nombre;
    }

    public final void setNombre(String nombre) {
        
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("El nombre no puede ser nulo/vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre.trim();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
    if (edad >= 0 && edad <=100){
        this.edad = edad;
    }else{
        System.out.println("La edad debe estar entre 0 y 100");
        this.edad = 0;
    }  
  }
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        
        if(notaPromedio>= 0 && notaPromedio <= 5) {
        this.notaPromedio = notaPromedio;
    }else {
            System.out.println("La nota promedio debe estar entre 0 y 5");
            this.notaPromedio = 0;
        }
    }
    
    
    
    
    
}

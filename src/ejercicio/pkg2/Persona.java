/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author Estudiante
 */
public class Persona {
   private String nombre;
   private int edad;
   private Carro[] carros;

    public Persona(String nombre, int edad, Carro[] carros) {
        this.nombre = nombre;
        this.edad = edad;
        this.carros = carros;
        carros = new Carro[20]; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
           
    

}

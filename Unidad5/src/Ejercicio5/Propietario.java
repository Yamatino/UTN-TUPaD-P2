/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Yamatino
 */
// Propietario.java
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Relación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Setter para establecer la relación desde la otra clase
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    // Getters
}
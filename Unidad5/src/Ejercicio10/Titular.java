/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Yamatino
 */
// Titular.java 
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Relación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    // Getters
}

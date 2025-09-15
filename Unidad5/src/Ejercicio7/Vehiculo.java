/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Yamatino
 */
// Vehiculo.java
public class Vehiculo {
    private String patente;
    private String modelo;

    // Agregación: El vehículo recibe un motor que existe independientemente.
    private Motor motor;

    // Asociación: El vehículo conoce a su conductor.
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Método para establecer la relación bidireccional
    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }
    // Getters
}

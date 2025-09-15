/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Yamatino
 */
// Computadora.java
public class Computadora {
    private String marca;
    private String numeroSerie;

    // Relación de Composición: La computadora crea y posee su PlacaMadre.
    private PlacaMadre placaMadre;

    // Relación de Asociación: La computadora conoce a su propietario.
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        
        // La PlacaMadre se crea aquí, demostrando la composición.
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
        
        // Se establece la relación bidireccional.
        this.propietario = propietario;
        propietario.setComputadora(this);
    }
    // Getters
}
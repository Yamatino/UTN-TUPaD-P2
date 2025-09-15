/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Yamatino
 */
// Pasaporte.java
import java.util.Date;

public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    
    // Relación de Composición: El Pasaporte CREA y es dueño de su Foto.
    private Foto foto; 
    
    // Relación de Asociación: El Pasaporte tiene una referencia al Titular.
    private Titular titular;

    public Pasaporte(String numero, Date fechaEmision, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        // Composición: Se crea la Foto dentro del Pasaporte.
        this.foto = new Foto(titular.getNombre() + ".jpg", "JPG");
        
        // Asociación bidireccional: Se establece la referencia en ambos objetos.
        this.titular = titular;
        titular.setPasaporte(this);
    }

    // Getters y Setters
    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }
}
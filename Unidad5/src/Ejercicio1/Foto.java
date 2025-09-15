/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Yamatino
 */
// Foto.java
public class Foto {
    private String imagen; // Representación de la imagen, ej: "foto_dni123.jpg"
    private String formato; // Ej: "JPG"

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Getters y Setters
    public String getImagen() {
        return imagen;
    }
}
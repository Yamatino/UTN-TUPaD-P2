/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Yamatino
 */
// Reproductor.java
public class Reproductor {
    // Dependencia de Uso: El método 'reproducir' USA un objeto Cancion
    // pero la clase Reproductor no tiene un atributo de tipo Cancion.
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + 
                           " de " + cancion.getArtista().getNombre());
    }
}
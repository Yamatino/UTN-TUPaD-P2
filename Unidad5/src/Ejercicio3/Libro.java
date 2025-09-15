/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Yamatino
 */
// Libro.java
public class Libro {
    private String titulo;
    private String isbn;
    
    // Asociación unidireccional: El Libro conoce a su Autor.
    private Autor autor; 
    
    // Agregación: El Libro conoce a su Editorial.
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    // Getters
}
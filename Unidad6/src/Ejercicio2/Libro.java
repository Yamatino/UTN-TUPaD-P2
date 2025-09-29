/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Yamatino
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relacion de composicion con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("---------------------------------");
        System.out.println("Libro: " + this.titulo);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Anio de Publicacion: " + this.anioPublicacion);
        this.autor.mostrarInfo(); // Muestra la informacion del autor asociado
        System.out.println("---------------------------------");
    }
}

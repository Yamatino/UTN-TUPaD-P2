/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Yamatino
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Se inicializa la lista vacia
    }

    /**
     * Crea un nuevo objeto Libro y lo agrega a la coleccion de la biblioteca.
     */
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca " + this.nombre + ".");
    }


    public String getNombre() {
        return this.nombre;
    }
    /**
     * Muestra la informacion de todos los libros en la biblioteca.
     */
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }

    /**
     * Busca un libro por su ISBN.
     * @return El objeto Libro si se encuentra, o null si no existe.
     */
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Elimina un libro de la coleccion usando su ISBN.
     */
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            System.out.println("Libro '" + libroAEliminar.getTitulo() + "' ha sido eliminado.");
        } else {
            System.out.println("No se pudo eliminar: Libro con ISBN '" + isbn + "' no encontrado.");
        }
    }

    /**
     * @return La cantidad total de libros en la biblioteca.
     */
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    /**
     * @return Una lista de libros publicados en un anio especifico.
     */
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    /**
     * Muestra una lista de todos los autores unicos disponibles en la biblioteca.
     */
    public void mostrarAutoresDisponibles() {
        // Usamos un Set para evitar autores duplicados
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : this.libros) {
            autoresUnicos.add(libro.getAutor());
        }

        System.out.println("--- Autores Disponibles en la Biblioteca ---");
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
        } else {
            for (Autor autor : autoresUnicos) {
                autor.mostrarInfo();
            }
        }
    }
}
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

public class Principal {
    public static void main(String[] args) {

        // --- TAREA 1: Creamos una biblioteca ---
        System.out.println("--- TAREA 1: CREANDO BIBLIOTECA ---");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca '" + miBiblioteca.getNombre() + "' creada.");

        // --- TAREA 2: Crear al menos tres autores ---
        System.out.println("\n--- TAREA 2: CREANDO AUTORES ---");
        Autor autor1 = new Autor("A01", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A02", "J.K. Rowling", "Britanica");
        Autor autor3 = new Autor("A03", "Stephen King", "Estadounidense");
        System.out.println("Autores creados.");

        // --- TAREA 3: Agregar 5 libros a la biblioteca ---
        System.out.println("\n--- TAREA 3: AGREGANDO LIBROS ---");
        miBiblioteca.agregarLibro("978-0307350444", "Cien Anios de Soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-8478884452", "Harry Potter y la piedra filosofal", 1997, autor2);
        miBiblioteca.agregarLibro("978-0307474720", "El amor en los tiempos del colera", 1985, autor1);
        miBiblioteca.agregarLibro("978-0670813025", "It", 1986, autor3);
        miBiblioteca.agregarLibro("978-8498382662", "Harry Potter y las Reliquias de la Muerte", 2007, autor2);

        // --- TAREA 4: Listar todos los libros ---
        System.out.println("\n--- TAREA 4: LISTADO COMPLETO DE LIBROS ---");
        miBiblioteca.listarLibros();

        // --- TAREA 5: Buscar un libro por su ISBN ---
        System.out.println("\n--- TAREA 5: BUSCAR LIBRO CON ISBN '978-0670813025' ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-0670813025");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // --- TAREA 6: Filtrar libros por anio de publicacion ---
        System.out.println("\n--- TAREA 6: FILTRAR LIBROS PUBLICADOS EN 1985 ---");
        ArrayList<Libro> librosPorAnio = miBiblioteca.filtrarLibrosPorAnio(1985);
        if (librosPorAnio.isEmpty()) {
            System.out.println("No se encontraron libros de ese anio.");
        } else {
            for (Libro libro : librosPorAnio) {
                libro.mostrarInfo();
            }
        }
        
        // --- TAREA 7: Eliminar un libro y listar los restantes ---
        System.out.println("\n--- TAREA 7: ELIMINAR LIBRO Y LISTAR RESTANTES ---");
        miBiblioteca.eliminarLibro("978-8478884452");
        System.out.println("\nLista de libros despues de la eliminacion:");
        miBiblioteca.listarLibros();

        // --- TAREA 8: Mostrar la cantidad total de libros ---
        System.out.println("\n--- TAREA 8: MOSTRAR CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("La biblioteca tiene un total de " + miBiblioteca.obtenerCantidadLibros() + " libros.");

        // --- TAREA 9: Listar todos los autores disponibles ---
        System.out.println("\n--- TAREA 9: LISTAR AUTORES DISPONIBLES ---");
        miBiblioteca.mostrarAutoresDisponibles();
    }
}
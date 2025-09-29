/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Yamatino
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Un curso se crea sin profesor asignado
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Asigna o cambia el profesor, manteniendo la consistencia en ambos objetos.
     * Este es el unico punto donde se debe modificar la relacion.
     * @param nuevoProfesor El nuevo profesor para el curso.
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // Si el curso ya tenia un profesor, lo desvinculamos de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        // Asignamos el nuevo profesor a este curso
        this.profesor = nuevoProfesor;

        // Si el nuevo profesor no es null, agregamos este curso a su lista
        if (nuevoProfesor != null) {
            nuevoProfesor.getCursos().add(this);
        }
    }

    /**
     * Muestra la informacion del curso, incluyendo el nombre de su profesor.
     */
    public void mostrarInfo() {
        System.out.println("---------------------------------");
        System.out.println("Curso: " + this.nombre + " (Codigo: " + this.codigo + ")");
        if (this.profesor != null) {
            System.out.println("Profesor Asignado: " + this.profesor.getNombre());
        } else {
            System.out.println("Profesor Asignado: Ninguno");
        }
        System.out.println("---------------------------------");
    }
}
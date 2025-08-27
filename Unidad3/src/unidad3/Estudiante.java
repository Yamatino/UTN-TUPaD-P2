/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author Yamatino
 */
public class Estudiante {
     
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    public void mostrarInfo() {
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion Actual: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("Calificacion aumentada en " + puntos + " puntos.");
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("Calificacion disminuida en " + puntos + " puntos.");
    }
}

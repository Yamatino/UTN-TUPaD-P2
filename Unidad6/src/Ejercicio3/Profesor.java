/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Yamatino
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Cursos que dicta

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); // Inicializa la lista vacia
    }
    
    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * Muestra la informacion basica del profesor y la cantidad de cursos que dicta.
     */
    public void mostrarInfo() {
        System.out.println("---------------------------------");
        System.out.println("Profesor: " + this.nombre + " (ID: " + this.id + ")");
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Cantidad de cursos: " + this.cursos.size());
        System.out.println("---------------------------------");
    }

    /**
     * Muestra los codigos y nombres de los cursos que el profesor dicta.
     */
    public void listarCursos() {
        System.out.println("Cursos dictados por " + this.nombre + ":");
        if (this.cursos.isEmpty()) {
            System.out.println("  -> Ninguno");
        } else {
            for (Curso curso : this.cursos) {
                System.out.println("  -> Codigo: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
            }
        }
    }
}
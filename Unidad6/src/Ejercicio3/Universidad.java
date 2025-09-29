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

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return this.profesores;
    }
    
    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // El metodo setProfesor se encarga de la sincronizacion
            System.out.println("Asignacion exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());
        } else {
            System.out.println("Error: No se encontro el curso o el profesor.");
        }
    }

    public void listarProfesores() {
        System.out.println("\n=== LISTA DE PROFESORES DE LA UNIVERSIDAD " + this.nombre.toUpperCase() + " ===");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\n=== LISTA DE CURSOS DE LA UNIVERSIDAD " + this.nombre.toUpperCase() + " ===");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Antes de eliminar el curso, rompemos la relacion con su profesor
            curso.setProfesor(null);
            this.cursos.remove(curso);
            System.out.println("Curso '" + curso.getNombre() + "' eliminado.");
        } else {
            System.out.println("Error: No se pudo eliminar el curso con codigo " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Antes de eliminar al profesor, desasignarlo de todos sus cursos
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            this.profesores.remove(profesor);
            System.out.println("Profesor '" + profesor.getNombre() + "' eliminado.");
        } else {
            System.out.println("Error: No se pudo eliminar el profesor con ID " + id);
        }
    }
}

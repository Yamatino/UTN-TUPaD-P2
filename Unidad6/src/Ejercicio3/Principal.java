/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Yamatino
 */
public class Principal {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        // --- Tarea 1 y 2: Crear 3 profesores y 5 cursos y agregarlos a la universidad ---
        System.out.println("--- TAREAS 1 Y 2: CREANDO Y AGREGANDO ENTIDADES ---");
        Profesor prof1 = new Profesor("P01", "Ana Lopez", "Matematicas");
        Profesor prof2 = new Profesor("P02", "Juan Perez", "Fisica");
        Profesor prof3 = new Profesor("P03", "Maria Garcia", "Quimica");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        Curso curso1 = new Curso("C101", "Calculo I");
        Curso curso2 = new Curso("C102", "Algebra Lineal");
        Curso curso3 = new Curso("C201", "Fisica Clasica");
        Curso curso4 = new Curso("C202", "Termodinamica");
        Curso curso5 = new Curso("C301", "Quimica Organica");
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);

        // --- Tarea 3: Asignar profesores a cursos ---
        System.out.println("\n--- TAREA 3: ASIGNANDO PROFESORES A CURSOS ---");
        uni.asignarProfesorACurso("C101", "P01"); // Calculo I -> Ana Lopez
        uni.asignarProfesorACurso("C102", "P01"); // Algebra -> Ana Lopez
        uni.asignarProfesorACurso("C201", "P02"); // Fisica Clasica -> Juan Perez
        uni.asignarProfesorACurso("C301", "P03"); // Quimica -> Maria Garcia

        // --- Tarea 4: Listar cursos con su profesor y profesores con sus cursos ---
        System.out.println("\n--- TAREA 4: LISTADO BIDIRECCIONAL ---");
        System.out.println("--- Listado de Cursos y su Profesor ---");
        uni.listarCursos();
        System.out.println("\n--- Listado de Profesores y sus Cursos ---");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        // --- Tarea 5: Cambiar el profesor de un curso y verificar ---
        System.out.println("\n--- TAREA 5: CAMBIANDO PROFESOR DE 'Fisica Clasica' ---");
        System.out.println("Asignando a Ana Lopez (P01) a Fisica Clasica (C201)...");
        uni.asignarProfesorACurso("C201", "P01");
        System.out.println("Verificacion:");
        prof1.listarCursos();
        prof2.listarCursos();
        uni.buscarCursoPorCodigo("C201").mostrarInfo();
        
        // --- Tarea 6: Remover un curso y confirmar ---
        System.out.println("\n--- TAREA 6: REMOVIENDO CURSO 'Calculo I' ---");
        uni.eliminarCurso("C101");
        System.out.println("Verificacion en la lista de Ana Lopez:");
        prof1.listarCursos();
        
        // --- Tarea 7: Remover un profesor y dejar sus cursos con profesor = null ---
        System.out.println("\n--- TAREA 7: REMOVIENDO AL PROFESOR 'Maria Garcia' ---");
        uni.eliminarProfesor("P03");
        System.out.println("Verificacion del curso 'Quimica Organica':");
        uni.buscarCursoPorCodigo("C301").mostrarInfo();
        
        // --- Tarea 8: Mostrar reporte de cantidad de cursos por profesor ---
        System.out.println("\n--- TAREA 8: REPORTE DE CURSOS POR PROFESOR ---");
        for (Profesor p : uni.getProfesores()) {
            System.out.println("-> " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
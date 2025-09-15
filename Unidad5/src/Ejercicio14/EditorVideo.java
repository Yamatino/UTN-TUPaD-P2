/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Yamatino
 */
// EditorVideo.java
public class EditorVideo {
    // Dependencia de Creación: El método 'exportar' CREA un objeto Render
    // y lo utiliza inmediatamente, sin guardarlo en la clase.
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("Preparando exportación...");
        Render nuevoRender = new Render(formato, proyecto);
        nuevoRender.iniciar();
        System.out.println("Exportación completada.");
    }
}
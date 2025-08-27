/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author Yamatino
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anoPublicacion;


    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnoPublicacion() {
        return this.anoPublicacion;
    }

    public void setAnoPublicacion(int nuevoAno) {
        if (nuevoAno > 0) {
            this.anoPublicacion = nuevoAno;
            System.out.println("El anio de publicacion ha sido actualizado a " + nuevoAno + ".");
        } else {
            System.out.println("Error: El aino de publicacion debe ser un numero positivo. No se realizo el cambio.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Yamatino
 */
// Documento.java
import java.util.Date;

public class Documento {
    private String titulo;
    private String contenido;
    
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = null; 
    }

    public void firmar(Usuario firmante) {
        if (this.firmaDigital == null) {
            String hash = "hash_generado_para_" + contenido.substring(0, 5);
            this.firmaDigital = new FirmaDigital(hash, new Date(), firmante);    
            System.out.println("Documento firmado por " + firmante.getNombre());
        } else {
            System.out.println("El documento ya estaba firmado.");
        }
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}
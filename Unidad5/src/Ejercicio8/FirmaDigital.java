/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Yamatino
 */
// FirmaDigital.java
import java.util.Date;

public class FirmaDigital {
    private String codigoHash;
    private Date fecha;
    
    // Agregación: La firma se asocia con un usuario que ya existe.
    private Usuario usuario;

    public FirmaDigital(String codigoHash, Date fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    // Getters
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Yamatino
 */
// GeneradorQR.java
public class GeneradorQR {
    // Dependencia de Creación: El método 'generar' CREA un objeto CodigoQR
    // pero no lo guarda como atributo. Lo devuelve para que otro lo use.
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Generando código QR...");
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        return nuevoCodigo;
    }
}
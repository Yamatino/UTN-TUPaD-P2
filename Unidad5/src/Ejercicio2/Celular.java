/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Yamatino
 */
// Celular.java
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    
    // Relación de Agregación: El Celular RECIBE una Batería ya creada.
    private Bateria bateria;
    
    // Relación de Asociación: El Celular tiene una referencia al Usuario.
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Se asigna la batería existente.
    }
    
    public void asignarUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this); // Se establece el enlace bidireccional.
    }
    // Getters
}
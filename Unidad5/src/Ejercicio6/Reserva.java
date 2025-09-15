/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Yamatino
 */
// Reserva.java
import java.util.Date;

public class Reserva {
    private Date fecha;
    private String hora;

    // Asociación Unidireccional: La reserva conoce al cliente.
    private Cliente cliente;
    
    // Agregación: La reserva se asocia con una mesa existente.
    private Mesa mesa;

    public Reserva(Date fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    // Getters
}
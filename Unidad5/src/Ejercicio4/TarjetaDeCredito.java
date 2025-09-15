/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Yamatino
 */
// TarjetaDeCredito.java
import java.util.Date;

public class TarjetaDeCredito {
    private String numero;
    private Date fechaVencimiento;
    
    // Relación de Asociación: La tarjeta conoce a su Cliente.
    private Cliente cliente; 
    
    // Relación de Agregación: La tarjeta conoce a su Banco.
    private Banco banco;

    public TarjetaDeCredito(String numero, Date fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        
        // Se establece la relación bidireccional
        this.cliente = cliente;
        cliente.setTarjeta(this);
    }
    // Getters
}
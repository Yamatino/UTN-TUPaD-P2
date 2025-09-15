/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Yamatino
 */
// CuentaBancaria.java
public class CuentaBancaria {
    private String cbu;
    private double saldo;

    // Composición: La cuenta crea y posee su propia clave de seguridad.
    private ClaveSeguridad clave;

    // Asociación: La cuenta conoce a su titular.
    private Titular titular;

    public CuentaBancaria(String cbu, double saldoInicial, Titular titular, String claveInicial) {
        this.cbu = cbu;
        this.saldo = saldoInicial;

        // Se crea la clave de seguridad al crear la cuenta.
        this.clave = new ClaveSeguridad(claveInicial);

        // Se establece la relación bidireccional.
        this.titular = titular;
        titular.setCuentaBancaria(this);
    }
    // Getters
}
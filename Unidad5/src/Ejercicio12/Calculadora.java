/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Yamatino
 */
// Calculadora.java
public class Calculadora {
    // Dependencia de Uso: El método 'calcular' USA un objeto Impuesto
    // pero no lo almacena como un atributo de la clase.
    public void calcular(Impuesto impuesto) {
        double totalConIntereses = impuesto.getMonto() * 1.21;
        System.out.println("Cálculo para " + impuesto.getContribuyente().getNombre() + 
                           ": $" + totalConIntereses);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author Yamatino
 */
public class NaveEspacial {

    private String nombre;
    private double combustible;
    private static final double MAX_COMBUSTIBLE = 100.0; // Limite del tanque

    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        // Se asegura que el combustible inicial no supere el maximo
        if (combustibleInicial > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible = combustibleInicial;
        }
    }

    public void despegar() {
        double combustibleNecesario = 10.0; // Hacemos que el despegue cueste algo de combustible
        if (this.combustible >= combustibleNecesario) {
            this.combustible -= combustibleNecesario;
            System.out.println("La nave " + this.nombre + " ha despegado");
        } else {
            System.out.println("Fallo en el despegue: combustible insuficiente.");
        }
    }

    public void avanzar(double distancia) {
        double combustibleNecesario = distancia; // Regla de consumo
        System.out.println("Intentando avanzar " + distancia + " unidades...");

        if (this.combustible >= combustibleNecesario) {
            this.combustible -= combustibleNecesario;
            System.out.println("La nave " + this.nombre + " avanzo " + distancia + " unidades.");
        } else {
            System.out.println("Error: Combustible insuficiente para avanzar esa distancia.");
            System.out.println("Se necesitan " + combustibleNecesario + " unidades, pero solo hay " + this.combustible + " disponibles.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a recargar debe ser positiva.");
            return;
        }
        
        System.out.println("Recargando " + cantidad + " unidades de combustible...");
        this.combustible += cantidad;
        
        if (this.combustible > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque de combustible lleno. El exceso fue descartado.");
        } else {
            System.out.println("Recarga completada.");
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave: " + this.nombre + " ---");
        System.out.println("Combustible Actual: " + this.combustible + " / " + MAX_COMBUSTIBLE);
    }
}

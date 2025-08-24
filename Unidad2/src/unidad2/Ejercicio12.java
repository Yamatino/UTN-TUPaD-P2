/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author Yamatino
 */
public class Ejercicio12 {
        public static void main(String[] args) {
            
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirPrecios(precios);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios);
    }

    public static void imprimirPrecios(double[] arrayDePrecios) {
        for (double precio : arrayDePrecios) {
            System.out.print("Precio: $" + precio + "\n");
        }
    }
}

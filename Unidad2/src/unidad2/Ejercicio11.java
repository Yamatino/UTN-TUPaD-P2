/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author Yamatino
 */
public class Ejercicio11 {
    public static final double PORCENTAJE_DESCUENTO = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * PORCENTAJE_DESCUENTO;
        double precioFinal = precio - descuentoAplicado;

        System.out.printf("El descuento especial aplicado es: %.2f\n", descuentoAplicado);
        System.out.printf("El precio final con descuento es: %.2f\n", precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        calcularDescuentoEspecial(precioProducto);

    }
    
}

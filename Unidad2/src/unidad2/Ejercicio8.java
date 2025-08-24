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
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double PrecioBase;
        double impuesto;
        double descuento;
        
        System.out.print("Ingrese un precio base del producto ");
        PrecioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto del producto en porcentaje (ejemplo 10 para 10%) ");
        impuesto = scanner.nextDouble();
        System.out.print("Ingrese el descuento del producto en porcentaje (ejemplo 10 para 10%) ");
        descuento = scanner.nextDouble();
        
        double PrecioFinal = calcularPrecioFinal(PrecioBase,impuesto,descuento);
        
        System.out.println("El precio final del producto es " + PrecioFinal);
    }
    static double calcularPrecioFinal(double Precio, double impuesto,double descuento){
        
        double precioFinal = Precio + (Precio * (impuesto / 100.0) - (Precio * (descuento / 100.0)) );
        return precioFinal;
    }
}

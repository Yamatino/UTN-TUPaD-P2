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
public class Ejercicio9 {
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            // Manejar un caso donde la zona no es válida
            System.out.println("Advertencia: Zona de envio no reconocida.");
            return 0.0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.next();

        double costoDeEnvio = calcularCostoEnvio(peso, zona);

        
        double totalAPagar = calcularTotalCompra(precio, costoDeEnvio);

        System.out.println("El costo de envio es: " + costoDeEnvio);
        System.out.println("El total a pagar es: " + totalAPagar);

    }
}

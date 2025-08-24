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
public class Ejercicio10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int actual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = scanner.nextInt();

        int stockFinal = actualizarStock(actual, vendida, recibida);

        System.out.println("El nuevo stock del producto es: " + stockFinal);

    }
}

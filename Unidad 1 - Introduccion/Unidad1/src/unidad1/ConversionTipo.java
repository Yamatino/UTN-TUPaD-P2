/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1;

/**
 *
 * @author Yamatino
 */
import java.util.Scanner;

public class ConversionTipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (entero): ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingresa el divisor (entero): ");
        int divisor = scanner.nextInt();
        int resultado = dividendo / divisor;
        System.out.println("El resultado de la division entera es: " + resultado);
        
        //Al usar double la division es mas exacta (ejemplo 7 y 2 da 3.5)
    }
}
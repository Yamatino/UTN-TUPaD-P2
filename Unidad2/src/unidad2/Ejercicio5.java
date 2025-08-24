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
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int sumaPares = 0;
        int numero;
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = scanner.nextInt();
        
        while (numero != 0){
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = scanner.nextInt();        
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPares);
    }
}

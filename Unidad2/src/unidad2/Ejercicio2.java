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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo numero: ");
        int b = scanner.nextInt();
        System.out.print("Por favor, ingresa el tercer numero: ");
        int c = scanner.nextInt();
        
        int mayor;
        
        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        }else{
            mayor = c;
        }
        System.out.println("El mayor es: " + mayor);
        
    }
}

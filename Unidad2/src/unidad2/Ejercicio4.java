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
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double descuento = 0;
        char categoria;
        String descuentoaplicado = null;
        
        System.out.print("Ingrese el precio del producto ");
        int precio = scanner.nextInt();
        System.out.print("Ingrese la categoria, valores posibles A, B o C ");
        categoria = scanner.next().charAt(0);
        
        switch(categoria){
            case 'a':
            case 'A':
                descuento = precio * 0.10;
                descuentoaplicado = "A";
                break;
            case 'b':
            case 'B':
                descuento = precio * 0.15;
                descuentoaplicado = "B";
                break;
            case 'c':
            case 'C':
                descuento = precio * 0.20;
                descuentoaplicado = "C";
                break;
        }
            System.out.println("Precio Original: " + precio);
            System.out.println("Descuento Aplicado: " + descuentoaplicado);
            System.out.println("Precio final: " + (precio - descuento));
            
    }
}

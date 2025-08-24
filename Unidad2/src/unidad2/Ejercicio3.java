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
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad ");
        int edad = scanner.nextInt();
        
        if (edad < 12){
        System.out.println("Eres un niño");
        } else if(edad >= 12 && edad <= 17) {
        System.out.println("Eres un Adolescente");
        } else if(edad >= 18 && edad <= 59) {
        System.out.println("Eres un Adulto");
         }else{
        System.out.println("Eres un Adulto mayor");
        
        }
    }
}

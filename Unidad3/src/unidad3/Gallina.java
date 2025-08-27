/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author Yamatino
 */
public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0; // Todas las gallinas empiezan con 0 años de edad
        this.huevosPuestos = 0; // Y 0 huevos puestos
    }

    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + this.idGallina + " ha puesto un huevo.");
    }

    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + this.idGallina + " ahora tiene " + this.edad + " anios.");
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la Gallina ID: " + this.idGallina + " ---");
        System.out.println("Edad: " + this.edad + " anios");
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
    }
}

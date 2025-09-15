/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Yamatino
 */
// ClaveSeguridad.java
import java.util.Date;

public class ClaveSeguridad {
    private String codigo; // Podría ser un hash
    private Date ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = new Date();
    }
    // Getters y un setter para modificarla
    public void setCodigo(String nuevoCodigo) {
        this.codigo = nuevoCodigo;
        this.ultimaModificacion = new Date();
    }
}
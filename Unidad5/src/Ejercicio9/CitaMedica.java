/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Yamatino
 */
// CitaMedica.java
import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private String hora;

    // Asociación Unidireccional: La cita conoce al paciente.
    private Paciente paciente;
    
    // Asociación Unidireccional: La cita conoce al profesional.
    private Profesional profesional;

    public CitaMedica(Date fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    // Getters
}
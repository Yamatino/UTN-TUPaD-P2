package unidad4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yamatino
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    public Empleado(String nombre, String puesto){ 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        totalEmpleados++;
        //Asignamos como id unica el mismo total de empleados para que sea unico
        this.id = totalEmpleados;
    }
    public void actualizarSalario(int porcentaje){
        double aumento = this.salario * (porcentaje / 100.0);
        this.salario += aumento;
        System.out.println("Aumento del " + porcentaje + "% ($" + String.format("%.2f", aumento) + ") aplicado a " + this.nombre);
    }
    public void actualizarSalario(double montoFijo) {
        this.salario += montoFijo;
        System.out.println("Aumento de $" + montoFijo + " aplicado a " + this.nombre);
    }
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre='" + nombre + "', Puesto='" + puesto + "', Salario=$" + String.format("%.2f", salario) + "]";
    }
}

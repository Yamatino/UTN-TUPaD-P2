/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad4;

/**
 *
 * @author Yamatino
 */
public class Unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Consultamos el contador estático antes de crear objetos.
        System.out.println("Empleados iniciales: " + Empleado.mostrarTotalEmpleados());

        // Creando empleados usando los constructores sobrecargados.
        System.out.println("Creando primer empleado con constructor completo");
        Empleado emp1 = new Empleado(101, "Juan Perez", "DevOps", 5500.00);

        System.out.println("Creando segundo empleado con constructor simplificado");
        Empleado emp2 = new Empleado("Carlos Olivera", "Diseniador Grafico");

        // Verificando el contador estático después de la creación.
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());

        // Mostrando la información de los empleados.
        System.out.println("Datos de los empleados:");
        System.out.println(emp1);
        System.out.println(emp2);

        // Demostrando los métodos sobrecargados para aumentar salario.
        System.out.println("Aplicando aumentos de salario");

        // Aumento por porcentaje (método con int)
        emp1.actualizarSalario(10); // Aumento del 10%

        // Aumento por monto fijo (método con double)
        emp2.actualizarSalario(250.50);

        System.out.println("Datos actualizados de los empleados:");
        System.out.println(emp1);
        System.out.println(emp2);        
        
    }
    
}

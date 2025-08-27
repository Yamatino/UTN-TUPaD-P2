/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad3;

/**
 *
 * @author Yamatino
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO 1 - ESTUDIANTE");
        
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "5to Grado", 85.5);

        System.out.println("Creando y mostrando info inicial ");
        estudiante1.mostrarInfo();

        System.out.println("\nSubiendo calificacion");
        estudiante1.subirCalificacion(10); 


        System.out.println("\n Bajando calificacion");
        estudiante1.bajarCalificacion(5.5);
        estudiante1.mostrarInfo();
        
        System.out.println("\n \nEJERCICIO 2 - MASCOTA \n");
        
        Mascota miMascota = new Mascota("Rocky", "Perro", 4);


        System.out.println("Registrando mascota y mostrando su estado inicial");
        miMascota.mostrarInfo();

        System.out.println("\nSimulando el paso de un anio");
        miMascota.cumplirAnios();

        System.out.println("\nMostrando informacion actualizada de la mascota");
        miMascota.mostrarInfo();
        
        System.out.println("\n \nEJERCICIO 3 - LIBRO \n");
        
        Libro miLibro = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez", 1967);

        System.out.println("--- Informacion Inicial del Libro ---");
        System.out.println("Titulo: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Ano de Publicacion: " + miLibro.getAnoPublicacion());
        System.out.println("\n");

        System.out.println("--- Intentando cambiar el anio a un valor invalido (-1984) ---");
        miLibro.setAnoPublicacion(-1984);
        System.out.println("Ano actual tras el intento invalido: " + miLibro.getAnoPublicacion());
        System.out.println("\n");

        System.out.println("--- Intentando cambiar el anio a un valor valido (1970) ---");
        miLibro.setAnoPublicacion(1970);
        System.out.println("\n");

        System.out.println("Titulo: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Ano de Publicacion: " + miLibro.getAnoPublicacion());
        
        System.out.println("\n \nEJERCICIO 4 - GALLINAS \n");
        
        System.out.println("--- Creando las gallinas ---");
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2);
        System.out.println("Se han creado dos gallinas.\n");

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        System.out.println("\nSimulando un dia en la granja");

        gallina1.ponerHuevo();
        gallina1.ponerHuevo(); // Puso 2 huevos
        gallina1.envejecer();

        gallina2.ponerHuevo();

        System.out.println("\n");

        System.out.println(" Mostrando estado final de las gallinas");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("\n \nEJERCICIO 5 - NAVE ESPACIAL \n");
        
        
        NaveEspacial miNave = new NaveEspacial("Enterprise", 50);
        System.out.println("Nave creada.");
        miNave.mostrarEstado();

        System.out.println("\nPRIMER INTENTO DE VIAJE");
        miNave.despegar(); // Primero despegamos
        miNave.avanzar(60); // Intentamos avanzar mas de lo que podemos
        miNave.mostrarEstado();

        System.out.println("\nPROCESO DE RECARGA");
        miNave.recargarCombustible(80); // Esto deberia llenar el tanque a 100
        miNave.mostrarEstado();

        System.out.println("\nSEGUNDO INTENTO DE VIAJE");
        miNave.avanzar(75); // Ahora si tenemos combustible suficiente

        System.out.println("\nESTADO FINAL DE LA NAVE");
        miNave.mostrarEstado();
    }
    
}

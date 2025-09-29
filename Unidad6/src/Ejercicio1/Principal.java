/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Inventario tienda = new Inventario();

        // --- TAREA 1: Crear y agregar al menos cinco productos ---
        System.out.println("\n--- TAREA 1: AGREGANDO PRODUCTOS ---");
        tienda.agregarProducto(new Producto("A001", "Queso", 2500.50, 40, CategoriaProducto.ALIMENTOS));
        tienda.agregarProducto(new Producto("E001", "Monitor Gamer", 2800.00, 15, CategoriaProducto.ELECTRONICA));
        tienda.agregarProducto(new Producto("R001", "Jean", 1800.75, 60, CategoriaProducto.ROPA));
        tienda.agregarProducto(new Producto("H001", "Juego de Sabanas", 1200.00, 35, CategoriaProducto.HOGAR));
        tienda.agregarProducto(new Producto("E002", "Mouse Inalambrico", 950.00, 80, CategoriaProducto.ELECTRONICA));
        tienda.agregarProducto(new Producto("R002", "Buzo", 2950.00, 50, CategoriaProducto.ROPA));

        // --- TAREA 2: Listar todos los productos ---
        System.out.println("\n--- TAREA 2: LISTADO COMPLETO DE PRODUCTOS ---");
        tienda.listarProductos();

        // --- TAREA 3: Buscar un producto por ID ---
        System.out.println("\n--- TAREA 3: BUSCAR PRODUCTO CON ID 'E001' ---");
        Producto productoBuscado = tienda.buscarProductoPorId("E001");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // --- TAREA 4: Filtrar productos por categoria ---
        System.out.println("\n--- TAREA 4: FILTRAR POR CATEGORIA 'ROPA' ---");
        ArrayList<Producto> productosRopa = tienda.filtrarPorCategoria(CategoriaProducto.ROPA);
        for (Producto p : productosRopa) {
            p.mostrarInfo();
        }

        // --- TAREA 5: Eliminar un producto y listar los restantes ---
        System.out.println("\n--- TAREA 5: ELIMINAR PRODUCTO 'H001' Y LISTAR RESTANTES ---");
        tienda.eliminarProducto("H001");
        tienda.listarProductos();

        // --- TAREA 6: Actualizar el stock de un producto ---
        System.out.println("\n--- TAREA 6: ACTUALIZAR STOCK DE 'A001' A 75 UNIDADES ---");
        tienda.actualizarStock("A001", 75);
        Producto productoActualizado = tienda.buscarProductoPorId("A001");
        if (productoActualizado != null) {
            productoActualizado.mostrarInfo();
        }

        // --- TAREA 7: Mostrar el total de stock disponible ---
        System.out.println("\n--- TAREA 7: MOSTRAR STOCK TOTAL ---");
        int stockTotal = tienda.obtenerTotalStock();
        System.out.println("El stock total de todos los productos es: " + stockTotal + " unidades.");

        // --- TAREA 8: Obtener y mostrar el producto con mayor stock ---
        System.out.println("\n--- TAREA 8: PRODUCTO CON MAYOR STOCK ---");
        Producto productoMaxStock = tienda.obtenerProductoConMayorStock();
        if (productoMaxStock != null) {
            productoMaxStock.mostrarInfo();
        }

        // --- TAREA 9: Filtrar productos con precios entre $1000 y $3000 ---
        System.out.println("\n--- TAREA 9: FILTRAR PRODUCTOS CON PRECIOS ENTRE $1000 y $3000 ---");
        ArrayList<Producto> productosEnRango = tienda.filtrarProductosPorPrecio(1000.00, 3000.00);
        if (productosEnRango.isEmpty()) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        } else {
            for (Producto p : productosEnRango) {
                p.mostrarInfo();
            }
        }

        // --- TAREA 10: Mostrar las categorias disponibles ---
        System.out.println("\n--- TAREA 10: MOSTRAR CATEGORIAS DISPONIBLES ---");
        tienda.mostrarCategoriasDisponibles();
    }
}
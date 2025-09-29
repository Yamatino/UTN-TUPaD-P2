/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Yamatino
 */
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
        System.out.println("\n=== LISTA DE PRODUCTOS EN INVENTARIO ===");
        for (Producto producto : this.productos) {
            producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto producto : this.productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            this.productos.remove(productoAEliminar);
            System.out.println("Producto '" + productoAEliminar.getNombre() + "' eliminado.");
        } else {
            System.out.println("No se pudo eliminar: Producto con ID '" + id + "' no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto productoAActualizar = buscarProductoPorId(id);
        if (productoAActualizar != null) {
            productoAActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + productoAActualizar.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("No se pudo actualizar: Producto con ID '" + id + "' no encontrado.");
        }
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getCategoria() == categoria) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : this.productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (this.productos.isEmpty()) {
            return null;
        }
        Producto productoMayorStock = this.productos.get(0);
        for (int i = 1; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCantidad() > productoMayorStock.getCantidad()) {
                productoMayorStock = this.productos.get(i);
            }
        }
        return productoMayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + " (" + cat.getDescripcion() + ")");
        }
        System.out.println("-----------------------------");
    }
}
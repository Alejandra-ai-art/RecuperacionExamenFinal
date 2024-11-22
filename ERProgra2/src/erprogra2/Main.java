/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package erprogra2;

/**
 *
 * @author oem
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VideojuegoManager manager = new VideojuegoManager();

        // Crear videojuegos con diferentes datos
        manager.agregar(new Videojuego(1, "Dark Souls", 59.99, "RPG", "PC"));
        manager.agregar(new Videojuego(2, "Halo Infinite", 69.99, "Shooter", "Xbox"));
        manager.agregar(new Videojuego(3, "God of War", 49.99, "Aventura", "PS5"));
        manager.agregar(new Videojuego(4, "The Witcher 3", 39.99, "RPG", "PC"));
        manager.agregar(new Videojuego(5, "Super Mario Odyssey", 59.99, "Plataformas", "Switch"));

        // Consultar videojuegos
        System.out.println("Lista de Videojuegos:");
        manager.consultar().forEach(System.out::println);

        // Buscar por género
        System.out.println("\nBuscando videojuegos de género 'RPG':");
        manager.buscarPorGenero("RPG")
                .ifPresentOrElse(System.out::println,
                                 () -> System.out.println("No se encontraron videojuegos de ese género."));

        // Actualizar precio
        System.out.println("\nActualizando precio del videojuego con ID 2:");
        manager.actualizarPrecio(2, 64.99);
        System.out.println(manager.consultar().get(1)); // Mostrar el videojuego actualizado

        // Eliminar un videojuego
        System.out.println("\nEliminando el videojuego con ID 3:");
        manager.eliminar(3);
        System.out.println("Lista de Videojuegos después de la eliminación:");
        manager.consultar().forEach(System.out::println);
    }
}
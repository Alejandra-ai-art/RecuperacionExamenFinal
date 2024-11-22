/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erprogra2;

/**
 *
 * @author oem
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VideojuegoManager implements CrudOperations<Videojuego> {
    private final List<Videojuego> videojuegos = new ArrayList<>();

    @Override
    public void agregar(Videojuego videojuego) {
        if (videojuegos.stream().anyMatch(v -> v.getId() == videojuego.getId())) {
            throw new IllegalArgumentException("El ID del videojuego debe ser único.");
        }
        videojuegos.add(videojuego);
    }

    @Override
    public List<Videojuego> consultar() {
        return new ArrayList<>(videojuegos);
    }

    @Override
    public Optional<Videojuego> buscarPorGenero(String genero) {
        return videojuegos.stream()
                .filter(v -> v.getGenero().equalsIgnoreCase(genero))
                .findFirst();
    }

    @Override
    public void actualizarPrecio(int id, double nuevoPrecio) {
        if (nuevoPrecio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        videojuegos.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .ifPresent(v -> v.setPrecio(nuevoPrecio));
    }

    @Override
    public void eliminar(int id) {
        if (videojuegos.isEmpty()) {
            throw new IllegalStateException("No hay videojuegos registrados.");
        }
        videojuegos.removeIf(v -> v.getId() == id);
    }
}
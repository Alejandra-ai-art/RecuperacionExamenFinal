/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erprogra2;

/**
 *
 * @author oem
 */
import java.util.List;
import java.util.Optional;

public interface CrudOperations<T> {
    void agregar(T item);
    List<T> consultar();
    Optional<T> buscarPorGenero(String genero);
    void actualizarPrecio(int id, double nuevoPrecio);
    void eliminar(int id);
}
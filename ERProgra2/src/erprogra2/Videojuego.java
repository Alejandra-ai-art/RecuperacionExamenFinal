/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erprogra2;

/**
 *
 * @author oem
 */
public class Videojuego extends Producto {
    private String genero;
    private String plataforma;

    public Videojuego(int id, String nombre, double precio, String genero, String plataforma) {
        super(id, nombre, precio);
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.Entidades;

import java.util.Date;

/**
 *
 * @author Damian
 */
public class Pelicula {
    private String titulo;
    private String autor;
    private double duracion;
    // contructores

    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }
    // setter & getter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    //mostrar

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + '}';
    }
    
    
}

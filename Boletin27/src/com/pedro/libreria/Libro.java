
package com.pedro.libreria;

import java.io.Serializable;

public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String titulo,autor;
    private double precio;
    private int unidades;

    public Libro(String titulo, String autor, double precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + "\t " + precio + " €/unidad\t Stock:" + unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
  
}

package librerias;

import java.util.ArrayList;

public class Libreria {
    ArrayList<Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser nulo");
        }
        if (libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío");
        }
        if (libro.getAutor() == null || libro.getAutor().isEmpty()) {
            throw new IllegalArgumentException("El autor del libro no puede estar vacío");
        }
        if (libro.getIsbn() == null || libro.getIsbn().isEmpty()) {
            throw new IllegalArgumentException("El ISBN del libro no puede estar vacío");
        }
        for (Libro l : libros) {
            if (l.getIsbn().equals(libro.getIsbn())) {
                throw new IllegalArgumentException("Ya existe un libro con el mismo ISBN");
            }
        }
        libros.add(libro);
        System.out.println("Libro con título '" + libro.getTitulo() + "' agregado");
        System.out.println("-----------------------------");
    }

    public void eliminarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser nulo");
        }
        if (!libros.contains(libro)) {
            throw new IllegalArgumentException("El libro no existe en la biblioteca");
        } else {
            libros.remove(libro);
            System.out.println("Libro con título " + libro.getTitulo() + "eliminado");
        }
        System.out.println("-----------------------------");
    }

    public void mostrarLibros() {
        if (libros == null || libros.isEmpty()) {
            System.out.println("No hay libros disponibles");
            return;
        }
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getIsbn() + " - " + libro.getPrecio() + " - " + libro.getStock());
        }
        System.out.println("-----------------------------");
        System.out.println("Hay un total de " + libros.size() + " libros disponibles");
    }

    public void darDeBajaLibros() {
        if (libros == null || libros.isEmpty()) {
            System.out.println("No hay libros para dar de baja");
            return;
        }
        libros.removeIf(libro -> libro.getStock() == 0);
        System.out.println("-----------------------------");
    }

    public void buscarLibro(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("El título no puede estar vacío");
            return;
        }
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getIsbn() + " - " + libro.getPrecio() + " - " + libro.getStock());
                libroEncontrado = true;
            }
        }
        if (!libroEncontrado) {
            System.out.println("Libro no encontrado");
        }
        System.out.println("-----------------------------");
    }
}

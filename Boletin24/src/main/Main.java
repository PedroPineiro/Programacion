package main;

import javax.swing.JOptionPane;

import librerias.Libreria;
import librerias.Libro;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null, "Seleccione una opción:\n"
                    + "1. Agregar libro\n"
                    + "2. Eliminar libro\n"
                    + "3. Mostrar libros\n"
                    + "4. Dar de baja libros\n"
                    + "5. Buscar libro\n"
                    + "6. Salir");
            switch (opcion) {
                case "1":
                    String titulo = JOptionPane.showInputDialog("Ingrese el título del libro");
                    String autor = JOptionPane.showInputDialog("Ingrese el autor del libro");
                    String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro"));
                    int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del libro"));
                    libreria.agregarLibro(new Libro(titulo, autor, isbn, precio, stock));
                    break;
                case "2":
                    titulo = JOptionPane.showInputDialog("Ingrese el título del libro a eliminar");
                    libreria.eliminarLibro(new Libro(titulo, "", "", 0, 0)); // Solo necesitamos el título para eliminar
                    break;
                case "3":
                    libreria.mostrarLibros();
                    break;
                case "4":
                    libreria.darDeBajaLibros();
                    break;
                case "5":
                    titulo = JOptionPane.showInputDialog("Ingrese el título del libro a buscar");
                    libreria.buscarLibro(titulo);
                    break;
                case "6":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (JOptionPane.showConfirmDialog(null, "¿Desea hacer algo más?", "Seleccione", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
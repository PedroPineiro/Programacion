
package com.pedro.archivos;

import com.pedro.libreria.*;
import java.io.*;
import java.util.ArrayList;

public class OperacionesLecturaEscritura {

    public static void guardarListadoLibros(ArrayList<Libro> lista, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
            System.out.println("""
                               
                               Guardando archivo...
                               Listado guardado exitosamente""");
        } catch (IOException e) {
            System.out.println("""
                               
                               Guardando archivo...
                               Error al guardar el listado.""" + e.getMessage());
        }
    }

    public static ArrayList<Libro> cargarListadoLibros(String archivo) {
        ArrayList<Libro> lista = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<Libro>) ois.readObject();
            System.out.println("""
                               
                               Leyendo archivo...
                               Listado leido exitosamente""");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("""
                               
                               Leyendo archivo...
                               Error al leer el listado.""" + e.getMessage());
        }

        return lista;
    }
}
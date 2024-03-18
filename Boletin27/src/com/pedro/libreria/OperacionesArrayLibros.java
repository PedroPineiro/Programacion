
package com.pedro.libreria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperacionesArrayLibros {
    
    /**
     * Metodo que muestra por consola el listado de libros (ArrayList) que haya sido cargado con anterioridad
     * @param libros ArrayList a mostrar
     */
    public static void mostrarArrayListConsola(ArrayList<Libro> libros){
        
        System.out.println("\nListado:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        
    }
    
    /**
     * Metodo que muestra por venatan de JOptionPane el listado de libros (ArrayList) que haya sido cargado con anterioridad
     * @param libros ArrayList listado a mostrar
     */
    public static void mostrarArrayListVentana(ArrayList<Libro> libros){
        
        StringBuilder sb = new StringBuilder();
        
        for (Libro libro : libros) {
            sb.append(libro);
        }
        
        JOptionPane.showMessageDialog(null, "Listado\n"+sb);
    }
    
    /**
     * Metodo para añadir un nuevo libro al Array 
     * @param libros ArrayList al que añadir un libro
     * @return Array list con libro añadido
     */
    public static ArrayList<Libro> añadirLibro(ArrayList<Libro> libros){
        
        libros.add(new Libro(JOptionPane.showInputDialog("Titulo"),
                              JOptionPane.showInputDialog("Autor"),
                             Double.parseDouble(JOptionPane.showInputDialog("Precio por unidad")),
                            Integer.parseInt(JOptionPane.showInputDialog("Unidades en stock"))));
        
        return libros;
    }
    
    /**
     * Metodo para obtener el precio de un libro apartir del titulo proveido
     * @param libros ArrayList en el que se quiere buscar el libro
     * @param titulo titulo del libro que se quiere buscar
     */
    public static void mostrarPrecioBuscado(ArrayList<Libro> libros,String titulo){
             
        Libro libMostrar = OperacionesArrayLibros.encontraLibro(libros, titulo);
       
        if(libMostrar==null){
                
            JOptionPane.showMessageDialog(null, "Error: Libro no escontrado");
                
        }else{
                
            JOptionPane.showMessageDialog(null, libMostrar.getTitulo() + " tiene un precio de " + libMostrar.getPrecio() + "€/unidad");
                
        }
            
    }
    
    /**
     * Metodo para cambiar el precio de un libro
     * @param libros ArrayList donde se encuentra los libros a cambiar
     * @param titulo del libro al que se quiere cambiar el precio
     * @param precioNuevo por el que sera replazado el antiguo
     */
    public static void modificarPrecio(ArrayList<Libro> libros,String titulo, Double precioNuevo){
        
        Libro libro = OperacionesArrayLibros.encontraLibro(libros, titulo);
        
        if(libro==null){
                
            JOptionPane.showMessageDialog(null, "Error: Libro no escontrado");
        
        }else{
            
            Double precioViejo = libro.getPrecio(); // Guarda rl sntigo precio para luego
            
            libro.setPrecio(precioNuevo);
            
            JOptionPane.showMessageDialog(null, "El precio de " +libro.getTitulo()+ "a sido cambiado de " +precioViejo+ "€ a " +libro.getPrecio()+ "€");
            
        }
        
    }
    
    /**
     * Metodo para vender(reducir) la cantidad de unidades 
     * @param libros ArrayList donde se encuentra el libro al que se le quiere reducir unidades
     * @param cant cantidad a restar a las unidades
     * @param titulo  del libro al que se quiere cambiar las unidades
     */
    public static void venderLibro(ArrayList<Libro> libros, int cant, String titulo){
        
        Libro libro = OperacionesArrayLibros.encontraLibro(libros, titulo);
             
        if(libro==null){
                
            JOptionPane.showMessageDialog(null, "Error: Libro no escontrado");
        
        }else{
        
            libro.setUnidades(libro.getUnidades()-cant);
            darBajaLibro(libros, libro, titulo); // Comprobacion de unidades restantes

        }
        
    }
    
    // METODOS AUXILIARES //
    
    /**
     * Metodo auxiliar para buscar un libro en base al titulo proveido
     * @param libros ArrayList en el que se quiere buscar el libro
     * @param titulo titulo del libro que se quiere buscar
     * @return 
     */
    private static Libro encontraLibro(ArrayList<Libro> libros, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    
    private static void darBajaLibro(ArrayList<Libro> libros,Libro libro,String titulo){ /// Pendiente de revision
        
        if (libro.getUnidades()==0){
            libros.removeIf(i -> i.getTitulo()==titulo);
            JOptionPane.showMessageDialog(null, "Aviso: El libro ha sido dado de baja");
        }else{
            JOptionPane.showMessageDialog(null, "El numero de unidades en stock restantes es de "+libro.getUnidades());
        }
    }
}

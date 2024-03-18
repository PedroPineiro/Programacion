/**
 * Clase aplicación para utilizar la clase generica Operacions
 */
public class App {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("El minimo es: " + Operacions.min(1, 4));
        System.out.println("El maximo es: " + Operacions.max(1, 4));
        System.out.println("El elemento se encuentra en la posicion: " + Operacions.search(arr, 2));
        System.out.println("El elemento eliminado es: " + Operacions.delete(arr, 2));
    }
}

/**
 * Clase generica
 */
public class Operacions {
    //calcular el elemento minimo de una lista
    public static <T extends Comparable<T>> T min(T a, T b) {
        if (a.compareTo(b) <= 0) {
            return a;
        } else {
            return b;
        }
    }

    //calcular el elemento maximo de una lista
    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    //Buscar el elemento en una lista, devolviendo la posicion de la primera aparicion del objeto -1 si no se encuentra
    public static <T> int search(T[] arr, T obj) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    // Metodo que borra la primera aparicion de un objeto en una lista, devolviendo el objeto eliminado de la lista o null si no se encuentra
    public static <T> T delete(T[] arr, T obj) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(obj)) {
                T temp = arr[i];
                arr[i] = null;
                return temp;
            }
        }
        return null;
    }
}

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[30];
        int aprobados = 0;
        int suspensos = 0;
        double media;
        double suma = 0;
        int notaMasAlta = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            suma += notas[i];
            suma = suma + notas[i];
        }

        media = suma / notas.length;

        System.out.println("Aprobados: " + aprobados + "\nSuspensos: " + suspensos);
        System.out.println("Media: " + media);

        for (int nota : notas) {
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }
        }

        System.out.println("Nota más alta: " + notaMasAlta);

        String[] alumnos = {"Juan", "Pedro", "Luis", "Ana", "María", "Sara", "Lucía", "Pablo", "Javier", "Carlos",
                "Jorge", "Marta", "Sergio", "Jesús", "David", "Julián", "Jesica", "Cristina", "Sonia", "Miguel",
                "Jesús", "Javier", "Jorge", "Jesica", "Cristina", "Sonia", "Miguel", "Jesús", "Javier", "Jorge"};

        System.out.println("La nota de " + alumnos[0] + " es " + notas[0]);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println("La nota de " + alumnos[i] + " es " + notas[i]);
            }
        }

        Arrays.sort(notas);

        System.out.println("Notas ordenadas: " + Arrays.toString(notas));

        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno del que quieras ver la nota");

        int indice = -1;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equalsIgnoreCase(nombre)) {
                indice = i;
                break;
            }
        }
        try {
            if (indice != 1) {
                System.out.println("La nota de " + nombre + " es: " + notas[indice] + ".");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Introduce el nombre de un alumno válido.");
        }
    }

}
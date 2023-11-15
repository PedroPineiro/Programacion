package boletinrepasorepetitivas_01;

import java.util.Scanner;

public class Boletin12 {
    Scanner sc = new Scanner(System.in);
    String respuesta;
    public void media() {
        do {
            System.out.println("Ingrese el número de alumnos:");
            int numAlumnos = sc.nextInt();

            double sumaNotas = 0;

            for (int i = 1; i <= numAlumnos; i++) {
                System.out.println("Ingrese la nota del alumno " + i + ":");
                double nota = sc.nextDouble();
                sumaNotas += nota;
            }

            double media = sumaNotas / numAlumnos;
            System.out.println("La nota media del grupo es: " + media);

            System.out.println("¿Desea repetir el proceso? (si/no)");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("¡Programa finalizado!");
        sc.close();
    }
}

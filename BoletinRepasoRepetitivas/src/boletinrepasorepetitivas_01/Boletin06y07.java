package boletinrepasorepetitivas_01;

import java.util.Scanner;

public class Boletin06y07 {
    Scanner sc = new Scanner(System.in);
    int lado;

    public void calcaularArea() {
        System.out.print("Introduce el valor del lado: ");
        lado = sc.nextInt();

        if (lado > 0) {
            int area = lado * lado;
            System.out.println("El área de un cuadrado de lado " + lado + " es: " + area);
        } else {
            System.out.println("El lado ingresado no es válido para calcular el área del cuadrado.");

        }
    }
}

package boletinrepasorepetitivas_01;

import java.util.Scanner;

public class Boletin08 {
    Scanner sc = new Scanner(System.in);
    int lado;

    public void calcularArea() {
        System.out.print("Introduce el valor del lado: ");

        do {
            lado = sc.nextInt();
            int area = lado * lado;
            System.out.println("El área de un cuadrado de lado " + lado + " es: " + area);
        } while (lado > 0 && lado != 0);
    }
}

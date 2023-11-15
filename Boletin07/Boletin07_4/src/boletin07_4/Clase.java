package boletin07_4;

import java.util.Scanner;

public class Clase {

    Scanner sc = new Scanner(System.in);
    String nome1;
    String nome2;
    int peso1;
    int peso2;

    public void verCaracteristicas() {

        System.out.println("Introduce o nome da primeira persoa: ");
        nome1 = sc.nextLine();
        System.out.println("Introduce o nome da segunda persoa: ");
        nome2 = sc.nextLine();
        System.out.println("Introduce o peso da primeira persoa: ");
        peso1 = sc.nextInt();
        System.out.println("Introduce o peso da segunda persoa: ");
        peso2 = sc.nextInt();

        if (peso1 > peso2) {
            System.out.println(nome1);
            System.out.println((peso1 - peso2));
        } else {
            System.out.println(nome2);
            System.out.println((peso2 - peso1));
        }

    }
}

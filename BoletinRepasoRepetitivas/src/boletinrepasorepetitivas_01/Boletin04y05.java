package boletinrepasorepetitivas_01;

import java.util.Scanner;

public class Boletin04y05 {
    Scanner sc = new Scanner(System.in);

    public void verPositivos() {
        int num;
        int suma;
        do {
            num = sc.nextInt();
            System.out.println(num);
            suma = (num += num);
        } while (num >= 0);

        if (num < 0) {
            System.out.println("O número non pode ser negativo");
        }

        System.out.println(suma);
    }
}

package boletinrepasorepetitivas_01;

import java.util.Scanner;

public class Boletin02 {
    Scanner sc = new Scanner(System.in);
    public void visualizar() {
        System.out.println("Introduce 5 números");
        int n = 0;

        while (n < 5) {
            int num = sc.nextInt();
            System.out.println(num);
            n++;
        }
    }
}

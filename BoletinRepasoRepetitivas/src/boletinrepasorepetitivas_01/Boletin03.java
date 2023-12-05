package boletinrepasorepetitivas_01;

import java.util.Scanner;

public class Boletin03 {
    Scanner sc = new Scanner(System.in);

    public void visualizarNums() {
        int num;
        System.out.println("Introduce números. Pulsa 0 para pechar");
        do {
            num = sc.nextInt();
            System.out.println(num);
        } while (num != 0);
    }
}

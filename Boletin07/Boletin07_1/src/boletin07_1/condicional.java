package boletin07_1;

import java.util.Scanner;

public class condicional {
    public void verPositivo(int num){
        System.out.print("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    if(num>0){
            System.out.println(num+" é positivo");
    }
        System.out.println("Saimos do condicional");
    }

}

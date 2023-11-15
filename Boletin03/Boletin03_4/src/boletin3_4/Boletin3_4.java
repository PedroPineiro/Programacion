package boletin3_4;

import java.util.Scanner;


public class Boletin3_4 {

    
    public static void main(String[] args) {
        int b100,b20,b5,moeda;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce os billetes de 100: ");
        b100 = sc.nextInt();     
        System.out.print("Introduce os billetes de 20: ");
        b20 = sc.nextInt();
        System.out.print("Introduce os billetes de 5: ");
        b5 = sc.nextInt();
        System.out.print("Introduce as moedas de 1: ");
        moeda = sc.nextInt();
        System.out.println(b100*100+b20*20+b5*5+moeda+"€");
    }
    
}
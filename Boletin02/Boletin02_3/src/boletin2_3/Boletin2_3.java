package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        float euro,dolar,cambio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros que quieras pasar a dólares: ");
        euro = sc.nextFloat();
        System.out.print("Introduce el cambio: ");
        cambio = sc.nextFloat();
        dolar = euro*cambio;
        System.out.println(euro +" euros son "+dolar+" dólares");
    }
    
}

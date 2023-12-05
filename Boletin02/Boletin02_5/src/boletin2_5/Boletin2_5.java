package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milla,metro;
        final int valor=1852;
        System.out.print("Introduce la cantidad millas que quieres pasar a metros: ");
        milla = sc.nextFloat();
        metro = milla*valor;
        System.out.println(milla +" millas son "+metro+" metros");
    }
    
}

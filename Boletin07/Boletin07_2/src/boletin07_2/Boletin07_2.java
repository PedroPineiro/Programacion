package boletin07_2;

import java.util.Scanner;

public class Boletin07_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            condicional obx=new condicional();
            
            System.out.println("Inserta dos números: ");
            obx.verOperacion(sc.nextShort(),sc.nextShort());
    }
    
}

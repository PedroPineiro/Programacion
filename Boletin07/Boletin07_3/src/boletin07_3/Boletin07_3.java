package boletin07_3;

import java.util.Scanner;

public class Boletin07_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clase obx=new Clase();
        System.out.print("Teclea un numero: ");
        obx.verSigno(sc.nextInt());
    }
    
}

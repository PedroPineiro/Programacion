package boletin02_02;

import java.util.Scanner;

public class Boletin02_02 {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o lado do cadrado: ");
        float lado =sc.nextInt();
        float area = (float) Math.pow(lado, 2);
        System.out.println("Area: " + area);
        
    }
    
}





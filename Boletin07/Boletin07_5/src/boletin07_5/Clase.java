package boletin07_5;

import java.util.Scanner;

public class Clase {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    public void verNumeros() {
    
        System.out.println("Introduce o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce o segundo numero: ");
        num2= sc.nextInt();
        System.out.println("Introduce o terceiro numero: ");
        num3= sc.nextInt();
        
    if (num1>num2 && num1>num3) {
            System.out.println("O maior é "+num1);
    }
    else if(num2>num1 && num2>num3){
            System.out.println("O maior é "+num2);
        }
    else if (num3>num1 && num3>num2){
        System.out.println("O maior é "+num3);
    }
    }
}

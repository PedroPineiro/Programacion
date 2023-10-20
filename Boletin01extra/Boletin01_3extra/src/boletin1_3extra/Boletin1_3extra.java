package boletin1_3extra;

import java.util.Scanner;


public class Boletin1_3extra {

    
    public static void main(String[] args) {
        float precio,rebaja,resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio en euros: ");
        precio = sc.nextFloat();
        System.out.print("Introduce el porcentaje de descuento que tiene: ");
        rebaja = sc.nextFloat();
        resultado=precio-(precio*rebaja/100);
        System.out.println("El precio final es "+resultado+" euros");

        
    }
    
}

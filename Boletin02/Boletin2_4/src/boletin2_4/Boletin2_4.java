package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        float n1,n2,suma,resta,prod,div;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero con el que quieras operar: ");
        n1 = sc.nextFloat();
        System.out.print("Introduce el segundo numero con el que quieras operar: ");
        n2 = sc.nextFloat();
        suma=n1+n2;
        resta=n1-n2;
        prod=n1*n2;
        div=n1/n2;
        System.out.println("La suma entre "+n1+" y "+n2+" da "+suma);
        System.out.println("La resta entre "+n1+" y "+n2+" da "+resta);
        System.out.println("El producto entre "+n1+" y "+n2+" da "+prod);
        System.out.println("La division entre "+n1+" y "+n2+" da "+div);
    }
    
}

package boletin06_3;

import java.util.Scanner;

public class Boletin06_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //calcular circunferencia sin setters
        System.out.println("Circulo 1 ");
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio=sc.nextDouble();
        Circulo circulo1 = new Circulo(radio);
        circulo1.calcularArea();
        circulo1.calcularLonxitude();
        
        //calcular circunferencia con setters
        Circulo circulo2 = new Circulo();
        System.out.println("_________________________________________________");
        System.out.println("Circulo 2 ");
        System.out.print("Introduce el radio: ");
        circulo2.setRadio(sc.nextDouble());
        circulo2.calcularArea();
        circulo2.calcularLonxitude();
        
        
        
        
        
        
    }
    
}

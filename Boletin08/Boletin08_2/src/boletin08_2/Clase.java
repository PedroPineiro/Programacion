package boletin08_2;

import java.util.Scanner;

public class Clase {
    Scanner sc=new Scanner(System.in);
        int caso;
        int lado;
        int base;
        int altura;
        int radio;
        int result;
public void verCuadrado(){
    System.out.print("Introduce el lado: ");
    lado=sc.nextInt();
    result=lado*lado;
    System.out.println("El area del cuadrado es "+result);
}
public void verTriangulo(){
    System.out.print("Introduce la base: ");
    base=sc.nextInt();
    System.out.print("Introduce la altura: ");
    altura=sc.nextInt();
    result=base*altura/2;
    System.out.println("El area del triangulo es "+result);
}
public void verCirculo(){
    System.out.print("Introduce el radio: ");
    radio=sc.nextInt();
    result=(int) (Math.PI*Math.pow(radio, 2));
    System.out.println("El area del circulo es "+result);
}


    public void verArea(){
        System.out.print("1=area cuadrado, 2=area triangulo, 3=area circulo: ");
        caso=sc.nextInt();
        switch(caso){
            case 1: verCuadrado();
            break;
            case 2: verTriangulo();
            break;
            case 3: verCirculo();
            break;
            default: System.out.println("Opcion incorrecta");
            break;
        }
    }
}

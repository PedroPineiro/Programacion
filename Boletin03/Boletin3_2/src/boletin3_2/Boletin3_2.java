package boletin3_2;

import java.util.Scanner;


public class Boletin3_2 {

    
    public static void main(String[] args) {
        float centig,fahren,kelvin;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce os grados centigrados: ");
        centig = sc.nextFloat();        
        float cambioK=(float)(273.15);
        fahren=centig*(9/5)+32;
        kelvin=centig + cambioK;
        System.out.println(centig+"ºC son "+fahren+"F");
        System.out.println(centig+"ºC son "+kelvin+"K");

        
    }
    
}

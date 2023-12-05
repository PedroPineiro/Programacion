package diasemana;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Condicional obx =new Condicional();
        System.out.print("Introduce un numero entre el 1 y 7, ambos incluidos: ");
        obx.verDias(sc.nextInt());
    }
    
}

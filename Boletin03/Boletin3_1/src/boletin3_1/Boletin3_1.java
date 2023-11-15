package boletin3_1;

import java.util.Scanner;


public class Boletin3_1 {

    
    public static void main(String[] args) {
        float tarifa,desconto,prezoPagado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o prezo da tarifa: ");
        tarifa = sc.nextFloat();
        System.out.print("Introduce o prezo pagado: ");
        prezoPagado = sc.nextFloat();
        desconto=((tarifa-prezoPagado)*100)/tarifa;
        System.out.println("O desconto é dun "+desconto+"%");

        
    }
    
}

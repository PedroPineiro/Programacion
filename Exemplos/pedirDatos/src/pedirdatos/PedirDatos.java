
package pedirdatos;

import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {
//        PEDIR DATOS
//        area dun rectangulo
        float base, altura,area;
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la base: ");
            base = sc.nextFloat();
            System.out.print("Introduce la altura: ");
            altura = sc.nextFloat();
            area = base*altura;
            System.out.println("Area = " + area);
            
//            Calculo da lonxitude e area dun circulo
            System.out.print("Introduce o radio: ");
            float ra=sc.nextFloat();
            float lonxitude=(float)(2*Math.PI*ra);
            System.out.println("lonxitude ="+lonxitude);
    
      

    }
    
}

package boletinrepasorepetitivas_01;

import javax.swing.JOptionPane;

public class Boletin09 {
    int num;
    int suma = 0;

    public void sumarNumeros(){
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce los números a sumar"));
            suma += num;
        } while (suma < 100);
        System.out.println("La suma de todos los números es " + suma);
    }

}
